import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Race {
    final int HOURS = 24;
    final int CARS_COUNT = 3;

    private ArrayList<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public void start() {
        HashMap<Car, Integer> raceResults = new HashMap<>();

        for (Car car : cars) {
            Integer result = car.getSpeed() * HOURS;
            raceResults.put(car, result);
        }

        Map.Entry<Car, Integer> winner = null;
        for (Map.Entry<Car, Integer> entry : raceResults.entrySet()) {
            if (winner == null || entry.getValue()
                    .compareTo(winner.getValue()) > 0) {
                winner = entry;
            }
        }

        if (winner != null) {
            System.out.println("Самая быстрая машина: " + winner.getKey().getName());
        }
    }
}

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // ваш код начнется здесь
        // вы не должны ограничиваться только классом Main и можете создавать свои классы по необходимости
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();

        for (int i = 1; i <= race.CARS_COUNT; i++) {
            System.out.println("— Введите название машины №" + i + ":");
            String name = scanner.nextLine();

            while (true) {
                try {
                    System.out.println("— Введите скорость машины №" + i + ":");
                    int speed = Integer.parseInt(scanner.nextLine());
                    if (speed > 0 && speed <= 250) {
                        race.addCar(new Car(name, speed));
                        break;
                    } else {
                        System.out.println("— Неправильная скорость");
                    }
                } catch (Exception e) {
                    System.out.println("— Неправильная скорость");
                }
            }
        }
        race.start();
    }
}

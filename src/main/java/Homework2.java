import java.util.Scanner;
public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Домашнее задание");
        System.out.println("1 - Задание №1");
        System.out.println("2 - Задание №2");
        System.out.println("3 - Задание №3");
        System.out.println("4 - Задание №4");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1: pointCheck(scanner); break;
            case 2: exitLoop(scanner); break;
            case 3: sumCalculation(scanner); break;
            case 4: tvControlRemote(scanner); break;
            default: System.out.println("Неверный выбор");
        }

        scanner.close();
    }
    // Задание 1
    private static void pointCheck(Scanner scanner){
        int score;
        while (true) {
            System.out.print("Please enter your score (0-100): ");
            score = scanner.nextInt();

            if (score >= 0 && score <= 100) {
                break;
            } else {
                System.out.println("Введено некорректное значение! Попробуйте снова.");
            }
        }

        if (score >= 90) {
            System.out.println("Your grade is A!");
        } else if (score >= 80) {
            System.out.println("Your grade is B!");
        } else if (score >= 70) {
            System.out.println("Your grade is C!");
        } else if (score >= 60) {
            System.out.println("Your grade is D!");
        } else if (score >= 50) {
            System.out.println("Your grade is E!");
        } else {
            System.out.println("Your grade is F!");
        }
    }
    private static void exitLoop(Scanner scanner) {
        System.out.println("\nЦикл с выходом по 'Exit'");
        System.out.println("Вводите строки. Для выхода введите 'Exit'");

        String userInput;

        while (true) {
            System.out.print("Введите строку: ");
            userInput = scanner.nextLine().trim();

            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("Выход из программы...");
                break;
            }

            if (userInput.isEmpty()) {
                System.out.println("Вы ввели пустую строку!");
            } else {
                System.out.println("Вы ввели: " + userInput);
            }
        }
    }

    private static void sumCalculation(Scanner scanner) {
        System.out.print("Введите число: ");
        int x = scanner.nextInt();

        int sum = 0;

        if (x >= 0) {
            for (int i = 0; i <= x; i++) {
                sum += i;
            }
        } else {
            for (int i = 0; i >= x; i--) {
                sum += i;
            }
        }

        System.out.printf("Сумма всех чисел от 0 до %d равна %d%n", x, sum);
    }

    private static void tvControlRemote(Scanner scanner)  {
        System.out.println("\nПульт от телевизора");

        String[] channels = {
                "Беларусь 1",
                "Беларусь 2",
                "НТВ",
                "ТНТ",
                "СТВ",
                "Беларусь 3",
                "Матч ТВ",
                "Беларусь 4",
                "Беларусь 5",
                "СТВ Спорт"
        };

        int channelNumber;

        System.out.println("Доступные каналы: 1-" + channels.length);
        System.out.println("0 - для выхода");
        while (true) {
            System.out.print("Введите номер канала: ");
            if (scanner.hasNextInt()) {
                channelNumber = scanner.nextInt();

                if (channelNumber == 0) {
                    System.out.println("Выключение телевизора...");
                    break;
                }
                if (channelNumber >= 1 && channelNumber <= channels.length) {
                    String channelName = channels[channelNumber - 1];
                    System.out.println("Сейчас включен: " + channelName);
                } else {
                    System.out.println("Канала " + channelNumber + " не существует!");
                }

            } else {
                String input = scanner.next();
                System.out.println("Ошибка! Введите число от 1 до " + channels.length + " или 0 для выхода");
            }
        }
    }
}


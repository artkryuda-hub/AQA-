import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1. Написать программу, выводящую информацию о вас (имя, фамилия, профессия).
        System.out.println("Информация обо мне:");

        String firstName = "Артур";
        String lastName = "Кривда";
        String profession = "QA Engineer";

        System.out.println(lastName);
        System.out.println(firstName);
        System.out.println(profession);

        //2. Объявить и проинициализировать переменные всех вам известных типов и вывести их значения на экран.
        System.out.println("Типы переменных:");
        byte byteValue = 123;
        short shortValue = 32;
        int intValue = 435454;
        long longValue = 54858838458834L;
        float floatValue = 3.14F;
        double doubleValue = 1.5;
        char charValue = 'A';
        String stringValue = "Текст...";
        boolean booleanValue = true;

        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("char: " + charValue);
        System.out.println("String: " + stringValue);
        System.out.println("boolean: " + booleanValue);

//3. Запросить на ввод строку, ввести произвольный текст с клавиатуры и вывести на экран результат работы всех рассмотренных методов работы со строками.


        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи произвольный текст: ");
        String userInput = scanner.nextLine();

        System.out.println("Длина строки: " + userInput.length());
        System.out.println("Первый символ: " + userInput.charAt(0));
        System.out.println("В верхнем регистре: " + userInput.toUpperCase());
        System.out.println("В нижнем регистре: " + userInput.toLowerCase());
        System.out.println("Замена пробелов на дефисы: " + userInput.replace("", "_"));
        System.out.println("Содержит букву 'А'?: " + userInput.contains("А"));
        System.out.println("Поле пустое?': " + userInput.isEmpty());
    }
}

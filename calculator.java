import java.util.Scanner;

public class calculator {
    import java.util.Scanner;

    public class Calculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Добре дошли в калкулатора!");
            System.out.println("Изберете операция: +, -, *, /");
            char operation = scanner.next().charAt(0);

            System.out.println("Въведете първото число:");
            double num1 = scanner.nextDouble();

            System.out.println("Въведете второто число:");
            double num2 = scanner.nextDouble();

            double result = 0;

            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Грешка: Деление на нула не е позволено.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Невалидна операция.");
                    return;
            }

            System.out.println("Резултатът е: " + result);

            scanner.close();
        }
    }


}

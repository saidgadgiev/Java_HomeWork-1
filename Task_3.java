/*
 * Task_3.
 * Реализовать простой калькулятор (+,-,=,*), только с целыми числами.
 */
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите 1 число -> ");
        int a = iScanner.nextInt();
        System.out.printf("Введите символ (+, -, / или *) -> ");
        String simbol = iScanner.next();
        System.out.printf("Введите 2 число -> ");
        int b = iScanner.nextInt();
        System.out.printf("*******************\n");
        System.out.printf("Результат \n"+ a + " " + simbol + " "+ b + " = ");

        int result = switch (simbol){
            case "+" -> a+b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> 0;
        };
        System.out.print(result);

        

    }
}

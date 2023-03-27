import java.util.Scanner;
/**
 * program
 * 
 * Создайте массив, в котором будут храниться кубы 
 * чисел от 1 до 1000. Затем вводятся 2 числа из 
 * этого диапазона. Используя данные из массива 
 * найдите их кубы.

Sample Input:

8 
11 

Sample Output:

512 
1331
 */
public class Task_1 {
    

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);

        System.out.println("Введите первое число -> ");
        int a = iScanner.nextInt();
        System.out.println("Введите второе число -> ");
        int b = iScanner.nextInt();
        int res_1 = 1;
        int res_2 = 1;
        // System.out.printf("cnt: ");

        for(int i = 0; i < 3 ; i++){

            res_1 = res_1 * a;
            res_2 = res_2 * b;

        }
        System.out.println("\nРезулютат");
        System.out.println(res_1);
        System.out.println(res_2);
        
        
        
    }
}
/*
 * Вводится число n, затем n чисел целых, по одному 
 * на каждой строке. Затем вводится число, на которое 
 * нужно умножить все введённые выше числа. Выведите на 
 * экран результат умножения построчно.
 * Sample Input:
 * 4
 * 1
 * 2
 * 3
 * 5
 * 2
 * 
 * Sample Output:
 * 2
 * 4
 * 6
 * 10
 */


import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        System.out.printf("Введите количество элементов в массиве -> ");
        Scanner iScanner = new Scanner(System.in);
        int a = iScanner.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.printf("Введите "+ i + " элемент массива -> ");
            arr[i] = iScanner.nextInt();
        }
        System.out.printf("Введите на что надо умножить -> ");
        int b = iScanner.nextInt();
        System.out.printf("\n*************************\n");
        System.out.printf("Результат\n");
        for (int i = 0; i < a; i++){
            // arr[i] *= b;
            System.out.println(arr[i]*b);
        }


    }
    
}

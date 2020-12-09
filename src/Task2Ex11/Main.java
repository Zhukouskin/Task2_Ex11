package Task2Ex11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число n : ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1 ; i <= n; i++){
            sum = sum + i;

        }
      System.out.println("Сумма чисел равна : " + sum);
    }
}

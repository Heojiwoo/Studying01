package 연산자.자가진단01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.println("sum : " + (num1 + num2 + num3));
        System.out.println("avg : " + (num1 + num2 + num3) / 3);
    }
}

package 연산자.자가진단02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int plus = num1 + 100;
        int remain = num2 % 10;

        System.out.printf("%d %d", plus, remain);
    }
}

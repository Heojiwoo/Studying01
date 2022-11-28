package 연산자.자가진단07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 == 0 || num2 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}

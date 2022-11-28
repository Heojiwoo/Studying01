package 연산자.자가진단06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1  + " > " + num2 + " --- " + "false");
        } else {
            System.out.println(num1  + " > " + num2 + " --- " + "true");
        }

        if (num1 >= num2) {
            System.out.println(num1  + " > " + num2 + " --- " + "false");
        } else if (num1 <= num2) {
            System.out.println(num1  + " > " + num2 + " --- " + "true");
        }
    }
}

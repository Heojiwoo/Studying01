package 입력.자가진단06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("height = ");
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        System.out.printf("Your height is %dcm.", height);
    }
}

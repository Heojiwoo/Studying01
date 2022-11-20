package com.lec.java.input03;

import java.util.Scanner;

public class Input03Main {
    public static void main(String[] args) {
        System.out.println("nextLine() vs. next()");

        Scanner sc = new Scanner(System.in);

        System.out.print("여러 단어의 문장을 입력하세요> ");
        String in = sc.nextLine(); // 한 라인 전체 (\n 입력까지)
        System.out.println("in: " + in);

        // next()
        // 다음 토큰(token)을 받아서 String으로 리턴
        System.out.print("여러 단어의 문장을 입력하세요> ");
        String in1 = sc.next(); // 한 라인 전체 (\n 입력까지)
        System.out.println("in1: " + in1);

        String in2 = sc.next(); // 한 라인 전체 (\n 입력까지)
        System.out.println("in2: " + in2);

        String in3 = sc.next(); // 한 라인 전체 (\n 입력까지)
        System.out.println("in3: " + in3);

        // 숫자 타입도 여러개를 '한줄'에 받을 수 있다.
        // > 100 3.14 300
        System.out.print("숫자 3개 (int, double, int)를 입력받으세요> ");
        int i1 = sc.nextInt();
        double d1 = sc.nextDouble();
        int i2 = sc.nextInt();

        System.out.printf("i1, d1, i2: %d, %f, %d\n", i1, d1, i2);

        sc.close();

    } // end main()
} // end class

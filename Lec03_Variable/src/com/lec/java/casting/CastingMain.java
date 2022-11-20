package com.lec.java.casting;
/*
 * 암묵적 형변환(Implicit casting): 자바 언어가 자동으로 해주는 형변환
 *
 *        primitive type 에서 implicit casting 방향
 *
 *        byte → short → int → long → float → double
 *                        ↑
 *                    char
 *
 * 명시적 형변환(Explicit casting): 프로그래머가 직접 타입을 변환하는 것
 *
 *      (변환하고자 하는 타입명)변수/값
 *
 *
 *
 */

public class CastingMain {
    public static void main(String[] args) {

        // 암묵적 형변환
        byte num1 = 123;
        short s1 = 123;
        int n1 = s1;
        double d1 = n1;
        char ch1 = 'A';
//        s1 = ch1;
        n1 = ch1;

        // 명시적 형변환
        byte num5 = (byte)513;
        System.out.println("num5 = " + num5); // 주의! 자료 손실 가능성 주의!

        int n = 10;
//        byte num6 = n;
        byte num6 = (byte)n;

        double avg1 = (99 + 88 + 78) / 3;
        double avg2 = (double)(99 + 88 + 78) / 3;
        System.out.println("avg1 : " + avg1);
        System.out.println("avg2 : " + avg2);


    }
}

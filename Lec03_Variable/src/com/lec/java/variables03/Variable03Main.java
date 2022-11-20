package com.lec.java.variables03;

//자바의 기본 자료형(primitive data type)
//정수 타입: byte(1바이트), short(2바이트), int(4바이트), long(8바이트)
//실수 타입: float(4바이트), double(8바이트)
//문자 타입: char(2바이트)
//논리 타입: boolean(1바이트)
public class Variable03Main {

    public static void main(String[] args) {
        System.out.println("byte : " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);

        byte num1 = -128;
        byte num2 = 0;
        byte num3 = 123;
//        byte num4 = 1234; // 에러 : byte에 저장할 수 있는 크기 넘어섬

        System.out.println("short : " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
        short num5 = -12345;
        short num6 = 12345;
//        short num7 = 32768;

        System.out.println("int : " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
//        int num9 = 9876543210;

        System.out.println("long : " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
//        long num10 = 9876543210;
        // 리터럴(literal) : 코드에 직접 입력하는 값.
        // 리터럴도 타입이 있다.
        // 정수타입리터럴은 int 타입으로 인식하려 한다.
        // 실수타입리터럴은 double 타입으로 인식하려 한다.

        long num11 = 9876543210L;
        // 9876543210 이라는 숫자가 int 타입이 아니라 long 타입임을 명시하기 위해서
        // 숫자 뒤에 영문자 L을 붙여줌
        // 자바에서 정수 타입 변수의 기본은 int임.
        // 자바는 정수 숫자(리터럴)를 별도 표기가 없으면 int라고 생각.

        long num12 = 12; // 8byte long <- 4byte int (가능)
        long num13 = 12L;
        int num14 = 12;
//        int num15 = 12L; // 에러 : 4byte int <- 8byte long (불가)

        // 값의 경계선을 넘어가면?
        // overflow! underflow! 발생
        byte num15 = Byte.MAX_VALUE; // 127
        byte num16 = (byte)(num15 + 1); // 128??
        System.out.println("num15 = " + num15);
        System.out.println("num16 = " + num16);





    } // end main



}

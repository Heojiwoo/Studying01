package com.lec.java.variables04;

public class Variable04Main {
    public static void main(String[] args) {
        double number1 = 3.141592;
//        float number2 = 3.14;
        float number3 = 3.14f; // 숫자 뒤에 f를 붙여주면, float 리터럴이 된다. 자바는 그 숫자를 float 타입으로 인식

        // 실수타입의 최대, 최솟값
        System.out.println("float : " + Float.MIN_VALUE + " ~ " + Float.MAX_VALUE);
        System.out.println("double : " + Double.MIN_VALUE + " ~ " + Double.MAX_VALUE);

        float number4 = 1.23456789f;
        double number5 = 1.23456789;

        System.out.println("number4 = " + number4);
        System.out.println("number5 = " + number5);

        // float과 double은 저장할 수 있는 값의 크기만이 아니라
        // 소수점 이하 정밀도(precision)에서도 차이가 있다.


    }
}

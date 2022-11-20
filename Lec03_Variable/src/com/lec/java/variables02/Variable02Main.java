package com.lec.java.variables02;

public class Variable02Main {
    public static void main(String[] args) {
        // 변수 선언과 동시에 초기화
        int num1 = 10;
        System.out.println("num1 = " + num1);

        // 한번에 같은 타입의 변수 여러개 선언 가능
        int a, b, c;

        int kor = 50, eng = 50, math = 33;
        System.out.println("총점 : " + (kor + eng + math));

        int total = kor + eng + math;
        System.out.println("Total : " + total);

        // 평균
        System.out.println("평균 : " + (total / 3)); // 정수와 정수의 연산결과는 정수!
        System.out.println("평균 : " + (total / 3.0)); // 실수와의 연산결과는 실수!
        System.out.println("평균 : " + ((double)total / 3)); // 형변환연산자 사용해서 명시적으로 형(type) 변환

        // 변수명 바꿀때는 refactor-rename 사용하자! SHIFT+F6

        // 변수명으로 사용 가능
        // 알파벳, 숫자, _
        // 숫자로 시작하면 안됨
        // 띄어쓰기 안됨
        // 대소문자 구분
        // 중복 안됨
        int abc;
//      int abc; // 중복선언 불가

        double Abc;
        double year2020;
//        int 2020year; // 숫자로 시작 안됨

//        short year 2020; // 띄어쓰기 안됨
        
        int myLittleToy; // 자바에선 일반적으로 변수명을 camel=notation 따름
        int my_little_toy;
        int _my_toy;
        int $aa; // $ 가능
//        int a#; // 다른 특수문자 불가
    } 
}

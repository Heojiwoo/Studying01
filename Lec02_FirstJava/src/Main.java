public class Main {
    public static void main(String[] args) {

        //        System.out.println();  () 안의 내용을 출력하고 한줄 바꿈
        System.out.println("안녕하세요 2022");
        System.out.println(123);   // 숫자 123
        System.out.println("123");  // 문자열 "123"

        System.out.print(1);  // print() 는 줄바꿈 안함
        System.out.print(2);
        System.out.print(3);
        System.out.print(2);
        System.out.print(3);

        System.out.println();  // 줄바꿈만 함.
        System.out.println(10 + 20);
        System.out.println("10" + "20"); // 문자열 + 문자열 => "1020" 문자열

        System.out.println("안녕하세요" + " + " + "여러분!!");

        System.out.println("결과: " + 10);
        System.out.println("결과: " + 10 + 20);
        // "문자열" + 숫자 => 문자열
        //           ↓ 문자열 변환
        // "문자열" + "숫자" => 문자열
        System.out.println("결과: " + (10 + 20));

        // 사칙연산 (*, -, *, /)
        System.out.println("10 + 20 = " + (10 + 20));
        System.out.println("10 - 20 = " + (10 - 20));
        System.out.println("10 * 20 = " + (10 * 20));
        System.out.println("10 / 20 = " + (10 / 20)); // 정수/정수 연산 결과는 정수 (즉, 소수점이하 절삭)
        System.out.println("10 / 20 = " + (10.0 / 20)); // 실수와의 연산 결과는 실수

        System.out.println(100 * (4 - 2));

        // She Says "Hi" <-- 출력하려면?
        System.out.println("She says \"Hi\"");
        // 입문시 기억할만한 이스케이프 문자
        // \"  : 쌍따옴표
        // \n  : 줄바꿈
        // \t  : 탭문자
        // \\  : 문자열 안에서 역슬래시 출력

        System.out.println("123\n456\n789");
        System.out.println("\tAvengers\\Endgame");

    }
}
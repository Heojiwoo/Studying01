package com.lec.java.variables05;

public class Variable05Main {
    public static void main(String[] args) {
        System.out.println("char, boolean, String");

        // char: 문자 하나를 저장하기 위한 자료 타입(2바이트)
        // char 는 문자의 코드값(정수)가 담긴다 (2byte)

        char ch1 = 'A';
//        char ch2 = "A";
        // 문자열(String)은 큰따옴표("")로 묶어 줌.   (String literal)
        // 문자 하나(char)는 작은따옴표('')로 묶어 줌.   (char literal)

        System.out.println("ch1 : " + ch1);

        char ch2 = '한';
        char ch3 = '글';
        System.out.println("ch2 : " + ch2);
        System.out.println("ch3 : " + ch3);

        char ch4 = 1234;
        char ch5 = 0x4D2; // 16진수 리터럴
        System.out.println("ch4 : " + ch4);
        System.out.println("ch5 : " + ch5);

        // 1. "bible"
        // 2. "cable"
        // 3. "able"
        // 오름차순 정렬하면?
        // 3 - 1 - 2

        // 1. "aaAA"
        // 2. "AaAa"
        // 3. "aAaA"
        // 4. "AAaa"
        // 4 - 2 - 3 - 1

        char ch6 = 'A';
        char ch7 = 'a';
        System.out.println("ch6 : " + ch6);
        System.out.println("ch7 : " + ch7);

        System.out.println("ch6 : " + (int)ch6);
        System.out.println("ch7 : " + (int)ch7);

        // boolean (논리형) : 참(true), 거짓(false)
        boolean b1 = true;
        boolean b2 = false;

        System.out.println("b1 : " + b1);
        System.out.println("b2 : " + b2);

        System.out.println(10 < 20);
        System.out.println(10 > 20);

        // String 타입
        // String은 primitive 타입은 아닙니다
        String name = "Heo";
        String nick = "juu";
        System.out.println("이름은 : " + name + "\n별명은 : " + nick);

        // ---------------------------------------------
        // TextBlock : Java15 이상
        //   - TextBlock 안에서는 굳이 " 을 escaping 하지 않아도 된다.
                System.out.println("\nTextBlock (Java15이상)");

        /* 만약 아래 내용을 String 으로 만드려면?
        <html>

          <body>
             <span>example text</span>
          </body>
        </html>
        */
            String txt = "<html>\n" +
                    "\n" +
                    "\t<body>\n" +
                    "\t\t<span>example text</span>\n" +
                    "\t</body>\n" +
                    "</html>";

        System.out.println(txt);

        String txt2 = "abc" + "defg";

        String txt3 = """
                <html>
                                
                      <body>
                         <span>example text</span>
                      </body>
                    </html>
                """;
        System.out.println(txt3);


    }
}

package 입력.형성평가04;

/* http://jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=9&sca=1020
109 : 입력 - 형성평가4
세 개의 정수를 입력받아 합을 출력하는 프로그램을 작성하시오.

입력 예]
20 50 100

출력 예]
sum = 170
 *
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in1 = sc.nextInt();
        int in2 = sc.nextInt();
        int in3 = sc.nextInt();

        System.out.println("sum = " + (in1 + in2 + in3));

        sc.close();
    }
}

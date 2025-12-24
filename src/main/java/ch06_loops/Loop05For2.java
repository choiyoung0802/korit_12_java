package ch06_loops;

import java.util.Scanner;

public class Loop05For2 {
    public static void main(String[] args) {
        // 1부터 100까지의 숫자 중 홀수 합만 구하는 for문을 작성하시오.
        // 힌트 # 1 : for문 내에 if가 들어갈 수 있음.
        // 힌트 # 2 : 근데 if문 안 쓰고도 홀수 합만을 하는 것이 가능하긴 함.
        int sum = 0;
        for (int num = 1 ; num < 101 ; num++) {
            if (num % 2 == 1) {
                sum += num;
            }
        }
        System.out.println("홀수의 합 : " + sum);

        int sum1 = 0;
        for (int num1 = 1 ; num1 < 101 ; num1+=2) {
            sum1 += num1;
        }
        System.out.println(sum1);

        /*
            숫자 관련 변수 볼 때 i를 보는 경우가 많다.
            i는 index의 축약어로 쓰임.

            숫자를 입력 받아서 1부터 n까지 더하는 반복문을 작성하겠습니다.
            실행 예
            1부터 몇 까지 더하시겠습니까? >>> 10
            1부터 10까지의 합은 55입니다.
         */
        Scanner scanner = new Scanner(System.in);
        int endNumber; // 한계값을 저장할 변수
        System.out.print("1부터 몇 까지 더하시겠습니까? >>> ");
        endNumber = scanner.nextInt();
        int sum2 = 0;
        for (int num2 = 1; num2 < endNumber + 1 ; num2++) {
            sum2 += num2;
        }
        System.out.println("1부터 " + endNumber + "까지의 합은 " + sum2 + "입니다.");

        int sum3 = 0;
        sum3 = endNumber*(endNumber+1)/2;
        System.out.println(sum3);
    }
}

package ch06_loops;

import java.util.Scanner;

/*
    중첩 for문도 가능합니다.
    for (int i = 0 ; i < 100 ; i++) {
        반복실행문1-a
        for (int j = 0 ; j < 100 ; j++) {
            반복실행문2
        }
        반복실행문1-b
    }
    for 문을 활용하여 1일차 1교시입니다. ~ 5일차 3교시입니다. 까지 출력하시오.
    다 하면 구구단 for문으로 출력하시오.
 */
public class Loop06NestedFor {
    public static void main(String[] args) {
//        for (int day = 1 ; day < 6 ; day++) {
//            for (int lesson = 1; lesson < 4; lesson++) {
//                System.out.println(day + "일차 " + lesson + "교시입니다.");
//            }
//            System.out.println();
//        }

//        for (int dan = 2 ; dan < 10 ; dan++) {
//            for (int num = 1 ; num < 10 ; num++) {
//                System.out.println(dan + " x " + num + " = " + (dan * num));
//            }
//            System.out.println();
//        }
//        for (int num = 1 ; num < 101 ; num++) {
//            System.out.print(num + " ");
//            if (num % 10 == 0) {
//                System.out.println();
//            }
//        }

//        for (int i = 1 ; i < 101 ; i+=10) {
//            System.out.println(i + " " + (i+1) + " " + (i+2) + " " + (i+3) + " " + (i+4) + " " + (i+5) + " " + (i+6) + " " + (i+7) + " " + (i+8) + " " + (i+9));
//        }
        /*
            숫자를 입력 받아서 홀수만 더하는 for 반복문을 작성하시오.
            다 했으면 짝수만 구하는 for 반복문을 작성하시오.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("1부터 몇까지 더하시겠습니까? >>> ");
        int endNumber = scanner.nextInt();;
        int sum1 = 0; // 홀수
        int sum2 = 0; // 짝수
        for (int num = 1 ; num < endNumber + 1 ; num++) {
            if (num % 2 == 1) {
                sum1 += num;
            } else {
                sum2 += num;
            }
        }
        System.out.println("1부터 " + endNumber + "까지 중 홀수의 합은 " + sum1 + "입니다.");
        System.out.println("1부터 " + endNumber + "까지 중 짝수의 합은 " + sum2 + "입니다.");
    }
}

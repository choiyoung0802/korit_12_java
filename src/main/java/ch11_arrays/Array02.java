package ch11_arrays;

import java.util.Scanner;

/*
    1. humans 배열에 이름을 입력할 수 있도록 할겁니다.
    실행 예
    몇 명의 학생을 등록하시겠습니까? >>> 5
    1번 학생의 이름을 등록하세요 >>> 김일
    2번 학생의 이름을 등록하세요 >>> 김이
    3번 학생의 이름을 등록하세요 >>> 김삼
    4번 학생의 이름을 등록하세요 >>> 김사
    5번 학생의 이름을 등록하세요 >>> 김오

    2. scores 배열에 점수를 입력할 수 있도록 할겁니다.
    1번 학생의 점수를 입력하세요 >>> 4.5
    2번 학생의 점수를 입력하세요 >>> 4.4
    3번 학생의 점수를 입력하세요 >>> 4.3
    4번 학생의 점수를 입력하세요 >>> 4.2
    5번 학생의 점수를 입력하세요 >>> 4.1

    학생들의 점수 총합은 21.5점입니다.
 */
public class Array02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 명의 학생을 등록하시겠습니까? >>> ");
        int num = scanner.nextInt();
        scanner.nextLine();
        String[] humans = new String[num];
        for (int i = 0 ; i < humans.length ; i++) {
            System.out.print(i+1 + "번 학생의 이름을 등록하세요 >>> ");
            humans[i] = scanner.nextLine();
        } // 미쳤다 너무어렵다 이게 맞나 ..
        // 아니 존나 열심히 공부해야지 이게 맞아.
        System.out.println();
        double[] scores = new double[num];
        double sum = 0;
        for (int i = 0 ; i < scores.length ; i++) {
            System.out.print(i+1 + "번 학생의 점수를 입력하세요 >>> ");
            scores[i] = scanner.nextDouble();
            sum += scores[i];
        }
        System.out.println();
        System.out.println("학생들의 점수 총합은 " + sum + "입니다.");
    }
}

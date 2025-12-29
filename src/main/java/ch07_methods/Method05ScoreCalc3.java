package ch07_methods;

import java.util.Scanner;
// 선생님 풀이
public class Method05ScoreCalc3 {
    // 1. 합을 구하는 메서드
    public static double calcSum(int numOfSubs) {
        double sum = 0;         // 지역변수 sum 선언 및 초기화
        Scanner scanner = new Scanner(System.in);
        for (int i = 0 ; i < numOfSubs ; i++) {
            System.out.print((i + 1) + " 과목의 점수를 입력하세요. >>> ");
            sum += scanner.nextDouble();
        }
        return sum;
    }

    // 2. 평균을 구하는 메서드
    public static void calcAvg() {
        Scanner scanner = new Scanner(System.in);
        int numOfSubs = 0;      // 사용할 변수 선언
        double avgScore = 0;
        System.out.print("몇 개의 과목을 입력하시겠습니까? >>> ");
        numOfSubs = scanner.nextInt();      // 이건 Java 내장 method를 호출한 경우죠.
        double sum = calcSum(numOfSubs);    // method 내에서 사용자 정의 method를 호출하는 것이 가능합니다.
        avgScore = sum / numOfSubs;
        System.out.println("총합은 " + sum + "이며, 평균은 " + avgScore + "입니다.");
    }

    public static void main(String[] args) {
        // method 호출 영역
        calcAvg();
    }
}

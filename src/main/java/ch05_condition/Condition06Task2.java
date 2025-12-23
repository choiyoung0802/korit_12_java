package ch05_condition;

import java.util.Scanner;

/*
    Condition05Task에서 고민해봐야 할 사항이 있습니다.
    예를 들어서 129038점 입력하면 A가 나오긴 하겠네요.
    즉, 100 초과 / 0 미만의 점수가 입력됐을 때 A / F라는 결과값이 나오게 됩니다.
    애초에 잘못된 점수를 입력했을 때 불가능한 점수 입력이라고
    안내를 하려면 어떻게 할 수 있을까요?
    100 초과 / 0 미만의 점수에 대해 grade를 x라고 가정하겠습니다.

    문제를 푸시오(단, 선수학습을 하신 분들의 경우 중첩 if문을 사용하지 않겠습니다.)
 */
public class Condition06Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요 >>> ");
        int score = scanner.nextInt();
        scanner.nextLine();
        System.out.print("이름을 입력하세요 >>> ");
        String name = scanner.nextLine();
        String grade = "";
        if (score > 100 || score <0) { // 안되는 조건을 먼저 걸어두고 시작
            grade = "x";
        } else if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
    }
}

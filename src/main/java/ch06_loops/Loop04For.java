package ch06_loops;
/*
    for 반복문(for loop)
    : 대부분의 경우 횟수가 고정되어 있을 때 사용하는 반복문
    (근데 아까 저희는 구구단 하든지 레슨 어쩌고 할 때 횟수를 고정시켜서 사용했었습니다만
    사실 for문을 쓰는 편이 훨씬 간단합니다)

    그럼 무엇을 기준으로 for / while을 선택하는가?
    : 횟수를 기준으로 특정 반복횟수가 되었을 때 반복을 정지하고 싶다면 - for
    : 몇 번이나 진행될지 모르지만 특정 상태가 되었을 때 반복을 정지하고 싶다면 - while

    형식 :
    for(시작값 ; 종료값 ; 증감값) {
        반복실행문
    }
 */
public class Loop04For {
    public static void main(String[] args) {
        // while문을 통한 1 - 10까지 출력
        int i = 1;
        while(i < 11) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        // for문을 통한 1 - 10까지 출력
        for (int j = 1 ; j < 11 ; j++) {
            System.out.print(j + " ");
        }
        System.out.println();

        // 1부터 100까지의 합을 구하시오.(for문으로 해보시고 다 하셨으면 while로도)
        // 제한 : 1 2 3 4 5 ... 100을 출력하고 합구하는게 아니라
        // 맨 마지막에 합의 값을 한 번만 출력하시오.
        int sum = 0;
        for (int num = 1 ; num < 101 ; num++) {
            sum += num;
        }
        System.out.println(sum);

        System.out.println();
    }
}

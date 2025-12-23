package ch06_loops;
/*
    1부터 100까지 출력하시오
    실행 예
    1
    2
    3
    ...
    100
 */
public class Loop02While {
    public static void main(String[] args) {
//        int num = 0;
//        while(num < 100) {
//            System.out.println(++num);
//        }

        /*
            2번 문제 // 내가 못 푼 거임. 반복해서 풀어야함. 못 풀면 빡대가리. 복습하자.
            1 2 3 4 5 6 ... 10
            11 12 13 ... 20
            ...
            91 92 ... 100
            으로 출력하시오.
         */

        // # 1 - 반복을 100번 하는 풀이
//        int num1 = 0;
//        while(num1 < 100) {
//            System.out.print(++num1 + " ");
//            if(num1 % 10 == 0) {
//                System.out.println();
//            }
//        }

        System.out.println(" 2번 풀이");
        /*
            힌트 : 1 2 3 4 5 6 ... 10 을 출력하는게 한 번의 반복
            힌트 # 2 : 첫 번째 반복의 경우 첫 번째 변수가 1로 시작하는데,
                두 번째 반복의 첫 번째 변수는 11이네요.
                세 번째는 21이구요
                10씩 차이가 나네요.
                그럼 10씩 더하면 되는거 아닌가 하는 생각이 드셨다면 풀 수 있습니다.
                근데 코드가 길고 안 예쁩니다.
         */
        int num2 = 1;
        while(num2 < 101) {
            System.out.println(num2 + " " + (num2+1) + " " + (num2+2) + " " + (num2+3) + " " + (num2+4) + " " + (num2+5) + " " + (num2+6) + " " + (num2+7) + " " + (num2+8) + " " + (num2+9));
            num2+=10;
        }

    }
}

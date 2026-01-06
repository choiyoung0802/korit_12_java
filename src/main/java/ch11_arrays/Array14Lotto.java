package ch11_arrays;

import java.util.Arrays;

/*
    1차 배열을 기준으로
    1 ~ 45까지의 임의의 숫자를 뽑아 배열에 대입

    목표는 1차 배열 내에 6개의 임의의 int값을 집어넣는 것
    근데, 중복이 있으면 안됨. -> 저랑 같이 수업

    그래서 복습을 한다고 가정하고 1 ~ 45까지의 숫자를
    여섯개짜리의 빈 배열에 집어넣는 것부터 시작하겠습니다.

    lottoNumbers에 1 ~ 45까지의 숫자 중 6개를 뽑아 대입하는 반복문 작성
    -> 1차 배열 하나가 완성됩니다.

    그 1차 배열이 10번 반복되게끔 반복문 작성
    -> 그럼 전체적으로 2중 for문이 됩니다.(혹시 while문으로 작성하고싶다면
    그래도 됩니다)
 */
public class Array14Lotto {
    public static void main(String[] args) {
        // 1~45까지 값을 넣기위한 두 가지 방법
        // # 1 - random.nextInt(45) + 1 // 얘는 메모리를 많이 잡아먹음.
        // # 2 - Math.random()*45 + 1
        int[] lottoNums = new int[6];
        for (int j = 0 ; j < 5 ; j ++) {
            for (int i = 0; i < lottoNums.length; i++) {
                lottoNums[i] = (int) (Math.random() * 45 + 1);
            }
            Arrays.sort(lottoNums);
            System.out.println(Arrays.toString(lottoNums));
        }
//        System.out.println(Arrays.toString(lottoNums));
        // 그럼 현재 이상의 코드에서 중요한 점은 lottoNums라는 배열을 선언 했을 때,
        // 그 배열에 반복문을 통해서 계속 element를 덮어쓰는 방식으로 작성을 했다는 점입니다.
        // 그 결과 반복문 외부에서 sout을 했을 때 가장 최근 게임의 결과값이 나오는 점이라고 할 수 있겠네요.
        // Array15에 중복 없애서 코드짜는거 있음.
    }
}

package ch11_arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/*
    아까 random.nextInt();를 한 번 써봤습니다.
    그래서 Integer[] numbers 배열을 선연하고 10개 짜리 index로 만듭니다.
    그리고 0번지부터 9번지까지 nextInt();를 반복 실행하여
    numbers 내에 임의의 정수를 넣어주겠습니다.

    그리고 그 배열을 출력합니다.
    오름차순하고 출력합니다.
    내림차순하고 출력합니다.

    각 element를 뽑아서 10씩 곱합니다.
    향상된 for문으로 element를 출력합니다 -> 1239087 / 13409578 / -584976395 / ...
 */
public class Array11 {
    public static void main(String[] args) {
        Random random = new Random();
        Integer[] numbers = new Integer[10];
        for (int i = 0 ; i < numbers.length ; i++) {
            numbers[i] = random.nextInt();
        }
        System.out.print("정렬 전 : " + Arrays.toString(numbers) + "\n");
        Arrays.sort(numbers);
        System.out.print("오름차순 : " + Arrays.toString(numbers) + "\n");
        Arrays.sort(numbers, Comparator.reverseOrder());
        System.out.print("내림차순 : " + Arrays.toString(numbers) + "\n");

        // 여긴 모르겠다.
        for (Integer number : numbers) {
            System.out.print((number * 10) + " / ");
        }
    }
}

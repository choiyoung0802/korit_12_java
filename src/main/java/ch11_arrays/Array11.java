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
        Random random = new Random(); // 사용할 객체 생성
        Integer[] numbers = new Integer[10]; // 사용할 변수 선언
        for (int i = 0 ; i < numbers.length ; i++) { // 배열 내에 값 대입
            numbers[i] = random.nextInt();
        }
        System.out.print("정렬 전 : " + Arrays.toString(numbers) + "\n");
        Arrays.sort(numbers); // 오름차순 배열, 원본 배열을 바꾸기 때문에 주의할 것 - void
        System.out.print("오름차순 : " + Arrays.toString(numbers) + "\n");
        Arrays.sort(numbers, Comparator.reverseOrder()); // 내림차순 배열, 이것 또한 원본 배열 바꿈
        System.out.print("내림차순 : " + Arrays.toString(numbers) + "\n");

        // 여긴 모르겠다.
        for (Integer number : numbers) {
            System.out.print((number * 10) + " / ");
        }
        /*
            random.nextInt();
            argument가 없을 때는 가장 작은 정수부터 가장 큰 정수(int 범위 내)
            중 하나를 임의 생성함.
            random.nextInt(한계값);
            argument가 하나 있을 때는 한계값을 설정합니다. 근데 0을 포함하기 때문에
            random.nextInt(10);이라면 0~9 까지의 범위에서 생성합니다.
            생각해볼 점 :
            1부터 10까지의 범위로 만들고 싶다면?
         */
        /*
            1부터 100까지의 값을 다시 입력하겠습니다.
            그리고 10씩 곱하고
            향상된 for문을 통해서 10 / 120 / 79 / ... / 로 출력될 수 있도록
            이하에 코드를 작성하시오.
         */
        Integer[] nums = new Integer[10];
        for (int j = 0 ; j < nums.length ; j++) {
            nums[j] = random.nextInt(100) + 1;
        }
        System.out.println();
        System.out.print("정렬 전 : " + Arrays.toString(nums) + "\n");
        Arrays.sort(numbers); // 오름차순 배열, 원본 배열을 바꾸기 때문에 주의할 것 - void
        System.out.print("오름차순 : " + Arrays.toString(nums) + "\n");
        Arrays.sort(numbers, Comparator.reverseOrder()); // 내림차순 배열, 이것 또한 원본 배열 바꿈
        System.out.print("내림차순 : " + Arrays.toString(nums) + "\n");

        for (Integer num : nums) {
//            num = random.nextInt(100) + 1;
//            num *= 10; // 이렇게 해도 됨.
            System.out.print((num * 10) + " / ");
        }
    }
}

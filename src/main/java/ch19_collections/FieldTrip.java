package ch19_collections;

import java.util.*;

/*
           1. 학생의 수를 입력 받아 해당 횟수만큼 반복문을 돌릴 것.
           2. 1번 ~ 5번 학생의 응답을 fieldTrips List에 저장할 것
           3. 중복을 제거하기 위하여 fieldTripSet에 이상의 List의 element들을 옮겨 담을 것
           4. 맨 마지막 출력문은 Set -> List로 재이동하여 finalFieldTrips List에서 element들을 추출하여 작성할 것.
           실행 예
           몇 명의 학생이 수학 여행지를 입력하시겠습니까? 5 명
           1 번 학생의 수학 여행지를 입력하세요 >>> 제주
           2 번 학생의 수학 여행지를 입력하세요 >>> 제주
           3 번 학생의 수학 여행지를 입력하세요 >>> 민속촌
           4 번 학생의 수학 여행지를 입력하세요 >>> 민속촌
           5 번 학생의 수학 여행지를 입력하세요 >>> 제주

           1 번 학생의 후보지 : 제주
           2 번 학생의 후보지 : 제주
           3 번 학생의 후보지 : 민속촌
           4 번 학생의 후보지 : 민속촌
           5 번 학생의 후보지 : 제주

           수학 여행 후보지는
           제주
           민속촌
           입니다.
        */
public class FieldTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> fieldTripSet = new HashSet<>();
        List<String> fieldTrips = new ArrayList<>();
        List<String> finalFieldTrips = new ArrayList<>();
        System.out.print("몇 명의 학생이 수학 여행지를 입력하시겠습니까? >>> ");
        int num = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0 ; i < num ; i++) {
            System.out.print((i+1) + "번 학생의 수학 여행지를 입력하세요 >>> ");
            String fieldTrip = scanner.nextLine();
            fieldTrips.add(fieldTrip);
        }
        System.out.println();
        for (int i = 0 ; i < num ; i++) {
            System.out.println((i+1) + "번 학생의 후보지 : " + fieldTrips.get(i));
        }

        fieldTripSet.addAll(fieldTrips);
        finalFieldTrips.addAll(fieldTripSet);
        finalFieldTrips.sort(Comparator.reverseOrder());
        System.out.println("수학 여행 후보지는");
        for (String easd : finalFieldTrips) {
            System.out.println(easd);
        }
        System.out.println("입니다.");
    }
}

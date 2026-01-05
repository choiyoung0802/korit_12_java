package ch11_arrays;
/*
    이하의 scores 배열의 값을 탐색하여
    90 이상은 A
    80 이상은 B
    70 이상은 C
    60 이상은 D
    59 이하는 F 인데,
    실행 예
    A 등급 몇 명
    B 등급 몇 명
    C 등급 몇 명
    ...
    F 등급 몇 명
 */
public class Array07 {
    public static void main(String[] args) {
        int[] scores = {100, 97, 83, 85, 77, 64, 64, 58, 59, 92, 100};
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int f = 0;
        for (int i = 0 ; i < scores.length ; i++) {
            if (scores[i] < 0 || scores[i] > 100) break;
            else {
                if (scores[i] >= 90) a++;
                else if (scores[i] >= 80) b++;
                else if (scores[i] >= 70) c++;
                else if (scores[i] >= 60) d++;
                else f++;
            }
        }
        System.out.println("A 등급 인원 : " + a + "명");
        System.out.println("B 등급 인원 : " + b + "명");
        System.out.println("C 등급 인원 : " + c + "명");
        System.out.println("D 등급 인원 : " + d + "명");
        System.out.println("F 등급 인원 : " + f + "명");

        int[] grades = {0, 0, 0, 0, 0};
        for (int i = 0 ; i < scores.length ; i++) {
            if (scores[i] < 0 || scores[i] > 100) break;
            else {
                if (scores[i] >= 90) grades[0]++;
                else if (scores[i] >= 80) grades[1]++;
                else if (scores[i] >= 70) grades[2]++;
                else if (scores[i] >= 60) grades[3]++;
                else grades[4]++;
            }
        }
        System.out.println();
        System.out.println("A 등급 인원 : " + grades[0] + "명");
        System.out.println("B 등급 인원 : " + grades[1] + "명");
        System.out.println("C 등급 인원 : " + grades[2] + "명");
        System.out.println("D 등급 인원 : " + grades[3] + "명");
        System.out.println("F 등급 인원 : " + grades[4] + "명");
    }
}

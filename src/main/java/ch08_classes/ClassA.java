package ch08_classes;
// 정의하는 부분
public class ClassA {
    // 필드 / 인스턴스 변수 / 멤버 변수 / 속성 정의
    int num;
    String name;
    double score;
    // 이상의 코드에서 보시면 선언만 되어있고 초기화는 이루어지지 않았습니다.

    // 메서드 정의 방법
    // 접근제어자 리턴타입 메서드명(매개변수1, 매개변수2) {
    //   실행문(method body)
    //   (return)
    // }
    public void callName() {
        System.out.println(name + "을 부릅니다.");
    }
}

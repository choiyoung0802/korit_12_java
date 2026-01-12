package ch17_static.singleton;

public class ProductView {
    // 정적 변수를 선언 - field
    // 보통 싱글톤 패턴 만들 때 정적 변수 이름이 instance입니다.
    // -> 24년 1회 실기 시험 시 field명도 힌트였었습니다.
    private static ProductView instance;
    public static int conut = 1;

    // 생성자
    private ProductView() {
        int cnt = 1;    // 이건 객체 생성 시에 사용되는 field네요
        System.out.println(cnt + " 번 째 객체가 생성되었습니다.");
        cnt++;
        System.out.println("정적 변수를 참조하는 " + conut + " 번 째 객체가 생성되었습니다.");
        conut++;
    }

    public static ProductView getInstance() { // 메서드를 경유해야지 객체 생성 가능
        if (instance == null) {
            instance = new ProductView();
        }
        return instance;
    }
}

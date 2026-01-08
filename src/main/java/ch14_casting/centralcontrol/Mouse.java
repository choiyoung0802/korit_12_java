package ch14_casting.centralcontrol;

public class Mouse implements Power{
    @Override
    public void on() {
        System.out.println("마우스를 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("마우스를 끕니다.");
    }

    // 고유 메서드 정의(downcasting을 위해서)
    public void leftClick() {
        System.out.println("마우스 왼쪽 클릭");
    }
}

package ch14_casting.centralcontrol;

public class Computer implements Power{

    @Override
    public void on() {
        System.out.println("컴퓨터를 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("컴퓨터를 끕니다.");
    }

    // 고유 메서드 정의(downcasting을 위해서)
    public void compute() {
        System.out.println("컴퓨터가 연산을 수행합니다.");
    }
}
// AirConditioner / LED / Mouse 클래스를 만들어서 Power interface를 각각 기기에 맞게 구현하시오.
// CentralControl 클래스 하나 만드시오.
// CentralControlMain

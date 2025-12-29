package ch08_classes;
// 실행하는 부분
public class CarMain {
    public static void main(String[] args) {
        Car myCar = new Car(); // 객체 생성
        myCar.color = "빨강"; // 필드에 값 대입
        myCar.speed = 160;
        myCar.drive(); // 메서드 호출

        Car yourCar = new Car();
        yourCar.color = "노랑";
        yourCar.speed = 180;
        yourCar.brake();

        myCar.displayInfo();
        yourCar.displayInfo();

    }
}

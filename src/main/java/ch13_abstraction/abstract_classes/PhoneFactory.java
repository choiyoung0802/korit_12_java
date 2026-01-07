package ch13_abstraction.abstract_classes;
// 추상 메서드가 있는 클래스를 상속 받으면 강제로 구현시킴
public class PhoneFactory extends Factory{
    @Override
    public void produce(String model) { // 자식 클래스에 맞게끔 강제로 '재정의'해야함
        System.out.println("모바일폰 공장 : " + this.getName() + "에서 [" + model + "]을 생산합니다.");
    }

    @Override
    public void manage() { // 자식 클래스에 맞게끔 강제로 '재정의'해야함
        System.out.println("모바일폰 공장을 관리합니다.");
    }
}

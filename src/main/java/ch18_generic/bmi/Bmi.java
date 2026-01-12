package ch18_generic.bmi;
/*
    printResult(Person person)를 적용하고 조건문을 사용하여
    - 김일 님의 키는 xxx cm, 몸무게는 xxx kg, bmi 지수는 xxx 으로 저체중/정상/
    비만전단계/1단계 비만/2단계 비만/3단계 비만입니다. 라고 출력할 수 있도록 하시오.
    PersonMain에서 Person 객체 생성, Bmi 객체를 생성한 후 calcBmi() 및 printResult()를 호출하시오.

    - bmi 계산식은 chrome -> bmi 검색해서 확인하시오.
 */
public class Bmi {

    private double calcBmi(Person person) {

        double bmi = 0;
        String name = person.getName();
        double height = person.getHeight() * 0.01; // 여기서만 m법으로 쓰니까 별개의 변수를 선언하지 않았습니다.
        double weight = person.getWeight();
        bmi = weight / (height*height);
        return bmi;
    }

    public void printResult(Person person) {
        String name = person.getName();
        double height = person.getHeight();
        double weight = person.getWeight();
        double bmi = calcBmi(person);
        String result = "";
        if (bmi < 0 || bmi > 40) {
            result = "비정상";
        } else if (bmi > 35) {
            result = "3단계 비만";
        } else if (bmi > 30) {
            result = "2단계 비만";
        } else if (bmi > 25) {
            result = "1단계 비만";
        } else if (bmi > 23) {
            result = "비만전 단계";
        } else if (bmi > 18.5) {
            result = "정상";
        } else {
            result = "저체중";
        }
        System.out.println(name + " 님의 키는 " + height + "cm이고 몸무게는 " + weight +
                "kg이고 bmi지수는 " + bmi + " 입니다. " + result + "입니다.");
    }
}

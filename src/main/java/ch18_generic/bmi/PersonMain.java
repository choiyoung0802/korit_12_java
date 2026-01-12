package ch18_generic.bmi;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person("김일", 169, 65);
        Bmi bmi = new Bmi();
        bmi.printResult(person1);
    }
}

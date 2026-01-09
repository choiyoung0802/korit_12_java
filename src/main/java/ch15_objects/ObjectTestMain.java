package ch15_objects;

public class ObjectTestMain {
    public static void main(String[] args) {
        ObjectTest object1 = new ObjectTest();
        ObjectTest object2 = new ObjectTest("김이", "서울특별시 종로구");
        object1.setName("김일");
        object1.setAddress("부산광역시 연제구");
        object1.showInfo();
        object2.showInfo();
        System.out.println("---일반---");
        System.out.println(object1); // .toString()
        System.out.println("---- equals() ----");

        String example = "안녕하세요";

        boolean result1 = "안녕하세요" == example;
        System.out.println(result1);    // 결과값 : true

        String[] strArry = {"안녕하세요", "안녕"};
        boolean result2 = "안녕하세요" == strArry[0];
        boolean result3 = example == strArry[0];
        System.out.println(result2);    // 결과값 : true
        System.out.println(result3);    // 결과값 : true

        ObjectTest test1 = new ObjectTest("안녕하세요", "안녕");
        boolean result4 = "안녕하세요" == test1.getName();
        System.out.println(result4);    // 결과값 : true
        boolean result5 = strArry[0] == test1.getName();
        boolean result6 = example == test1.getName();
        System.out.println(result5);    // 결과값 : true
        System.out.println(result6);    // 결과값 : true

        String example2 = new String("안녕하세요");
        boolean result7 = "안녕하세요" == example2;
        System.out.println(result7);    // 결과값 : false
        String example3 = new String(example);
        boolean result8 = example3 == example;
        System.out.println(result8);    // 결과값 : false

        boolean result71 = "안녕하세요".equals(example2);
        System.out.println(result71);   // 결과값 : true
        boolean result81 = example3.equals(example);
        System.out.println(result81);   // 결과값 : true
    }
}

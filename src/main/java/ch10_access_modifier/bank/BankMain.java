package ch10_access_modifier.bank;

public class BankMain {
    public static void main(String[] args) {
        Bank human1 = new Bank(123456, "홍길동", 100000, 645);

        Bank human2 = new Bank(987654, "신사임당", 500000, 1234);

        human1.showAccountInfo();
        human2.showAccountInfo();
        System.out.println();
        human1.deposit(50000, 645);
        human1.withdraw(200000, 645);
        human1.withdraw(100000, 645);
        System.out.println();
        human2.withdraw(100000, 1234);
        human2.deposit(200000, 1234);
        System.out.println("\n최종 계좌 정보");
        human1.showAccountInfo();
        human2.showAccountInfo();
    }
}

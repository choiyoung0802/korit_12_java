package ch21_exception.bank;

import java.util.Scanner;

public class BankMain {
        private int balance = 10000;

    public void withdraw(int amount) throws InsufficientBalanceException {
        if (amount > balance) {
            int gap = amount - balance;
            throw new InsufficientBalanceException("잔액이 부족합니다. 부족 금액 : " + gap + "원");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankMain bank = new BankMain();
        try {
            System.out.print("출금할 금액을 입력하세요 >>> ");
            int money = scanner.nextInt();
            bank.withdraw(money);
            bank.balance = bank.balance - money;
            System.out.println("정상 출금 되었습니다.");
            System.out.println("출금 후 잔액 : " + bank.balance + "원");
        } catch (InsufficientBalanceException e) {
            System.out.println("출금액 입력 오류 : " + e.getMessage());
        }
    }
}

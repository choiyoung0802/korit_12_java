package ch21_exception.signup;

import java.util.Scanner;

public class IdMain {
    public static void checkId(String id) throws InvalidIdException {
        if (id.length() < 8) {
            throw new InvalidIdException("아이디는 8자 이상이어야 합니다.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("아이디를 입력하세요 >>> ");
        try {
            String id = scanner.nextLine();
            checkId(id);
            System.out.println("아이디 생성 성공 : " + id);
        } catch (InvalidIdException e) {
            System.out.println("아이디 입력 오류 : " + e.getMessage());
        } finally {
            System.out.println("프로그램 종료");
        }
    }
}

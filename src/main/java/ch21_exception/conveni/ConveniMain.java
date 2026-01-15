package ch21_exception.conveni;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConveniMain {
    public static void order(int quantity) throws InvalidOrderQuantityException {
        if (quantity < 1 || quantity > 50) {
            throw new InvalidOrderQuantityException("주문량은 최소 1개~ 최대 50개 입니다");
        } else {
            System.out.println("상품 " + quantity + "개 주문 접수가 완료되었습니다.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("주문량을 입력하세요 >>> ");
            int quantity = scanner.nextInt();
            order(quantity);
        } catch (InvalidOrderQuantityException e) {
            System.out.println("주문량 입력 오류 : " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("점수만 입력할 수 있습니다.");
        } catch (Exception e) {
            System.out.println("알 수 없는 예외가 발생하였습니다.");
        } finally {
            System.out.println("프로그램 정상 종료");
        }
    }
}

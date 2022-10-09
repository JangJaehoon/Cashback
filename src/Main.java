import java.util.Scanner;

// 자바 캐시백 프로그램
public class Main {
    public static void main(String[] args) {
        System.out.println("[캐시백 계산]");
        System.out.print("결제 금액을 입력해 주세요. (금액) : ");
        Scanner scan = new Scanner(System.in);
        int money = scan.nextInt();
        int cashback = (int)(money * 0.1);

        if(cashback >= 300){
            cashback = 300;
            System.out.println("캐시백 포인트는 300원을 넘을 수 없습니다.");
        }

        System.out.println(String.format("결제 금액은 %d원이고, 캐시백은 %d원 입니다.", money, cashback));
    }
}
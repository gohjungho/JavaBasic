import java.util.Scanner;

public class quiz15_04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열: ");
        String str = sc.nextLine();

        System.out.print("반대로 읽으면: ");
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i)); // 인덱스 자리값
        }
        System.out.println(" 입니다.");

    }
}

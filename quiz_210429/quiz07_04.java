import java.util.Scanner;

public class quiz07_04 {
    static int sumUp(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s += i;
        }

        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1부터 x까지의 합을 구하세요.");
        System.out.print("x의 값: ");
        int x = sc.nextInt();

        System.out.println("1부터 " + x + "까지의 합은 " + sumUp(x) + "입니다.");
    }
}

import java.util.Scanner;

public class quiz07_07 {
    static void putStart(int n) {
        putChar('*', n);
    }

    static void putChar(char c, int n) {
        while (n-- > 0)
            System.out.print(c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("왼쪽 아래가 직각인 이등변삼각형을 표시합니다.");
        System.out.print("단수는: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            putStart(i);
        }
    }
}

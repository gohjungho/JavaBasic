import java.util.Scanner;

public class quiz07_09 {
    static int readPlusInt() {
        Scanner sc = new Scanner(System.in);
        int x;
        do {
            System.out.print("양의 정수값:");
            x = sc.nextInt();
        } while (x <= 0);
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        do {
            int n = readPlusInt();

            System.out.print("반대로 읽으면 ");
            while (n > 0) {
                System.out.print(n % 10);
                n = n / 10;
            }
            System.out.println("입니다");

            do {
                System.out.print("다시 한 번?<Yes...1/No...0>");
                x = sc.nextInt();
            } while (x != 0 && x != 1);
        } while (x == 1);

    }
}

import java.util.Scanner;
import java.util.Random;

public class quiz07_08 {
    static int random(int a, int b) {
        if (b <= a)
            return a;
        else {
            Random rd = new Random();
            return a + rd.nextInt(b - a + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("난수를 생성합니다.");
        System.out.print("하한값: ");
        int a = sc.nextInt();
        System.out.print("상한값: ");
        int b = sc.nextInt();

        System.out.println("생성한 난수는 " + random(a, b) + "입니다.");

    }
}

import java.util.Scanner;
import java.util.Arrays;

public class quiz07_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 a: ");
        int a = sc.nextInt();
        System.out.print("정수 b: ");
        int b = sc.nextInt();
        System.out.print("정수 c: ");
        int c = sc.nextInt();

        System.out.println("중간값은 " + mod3(a, b, c) + "입니다.");

    }

    static int mod3(int a, int b, int c) {

        // if ((a <= b && c <= a) || (b <= a && a <= c))
        // return a;
        // if ((a <= b && b <= c) || (c <= b && b <= a))
        // return b;
        // else
        // return c;

        int[] num = { a, b, c };
        Arrays.sort(num);
        return num[1];
    }
}

import java.util.Scanner;

public class quiz07_01 {

    static int signOf(int n) {
        if (n < 0)
            return -1;
        else if (n > 0)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 x: ");
        int num = sc.nextInt();

        int s = signOf(num);

        System.out.println("signOf(x)는 " + s + "입니다.");
    }
}

import java.util.Random;
import java.util.Scanner;

class quiz6_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.print("요소 수: ");
        int num = sc.nextInt();

        int[] a = new int[num];

        a[0] = 1 + rd.nextInt(10);
        for (int i = 1; i < num; i++) {
            do {
                a[i] = 1 + rd.nextInt(10);
            } while (a[i] == a[i - 1]); // 인접한 값이 중복되지 않음 
        }

        for (int i = 0; i < num; i++) {
            System.out.println("a[" + i + "] = " + a[i]); 
        }
    }
}

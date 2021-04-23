import java.util.Random;
import java.util.Scanner;

class quiz6_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.print("요소 수: ");
        int num = sc.nextInt();

        int[] a = new int[num];

        for (int i = 0; i < num; i++) {
            a[i] = 1 + rd.nextInt(10);
            System.out.println("a[" + i + "] = " + a[i]);      
        }
    }
}

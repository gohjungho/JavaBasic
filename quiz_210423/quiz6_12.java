import java.util.Random;
import java.util.Scanner;

class quiz6_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int num = 0;

        do {
        System.out.print("요소 수: ");
        num = sc.nextInt();
        } while (num > 10);

        int[] a = new int[num];

        for (int i = 0; i < num; i++) {
            int j;
            do {
                a[i] = 1 + rd.nextInt(10);
                for (j = 0; j < i; j++) {
                    if (a[i] == a[j]) 
                        break;
                }
            } while (i > j);
        }

        for (int i = 0; i < num; i++) {
            System.out.println("a[" + i + "] = " + a[i]); 
        }
    }
}
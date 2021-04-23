import java.util.Random;
import java.util.Scanner;

class quiz6_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("요소 수:");
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int j = 0; j < n ; j++){
            System.out.print("a["+j+"] = ");
            a[j]= sc.nextInt();
        }

        System.out.println("요소를 섞었습니다.");

        for (int i = 0 ; i < n ; i++) {
            int x = rd.nextInt(n);
            int y = rd.nextInt(n);
            int t = a[x];
            a[x] = a[y];
            a[y] = t;
        }

        for (int j = 0; j < n ; j++){
            System.out.println("a["+j+"] = " + a[j]);
        }

    }
}

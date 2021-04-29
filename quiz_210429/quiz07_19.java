import java.util.Scanner;

public class quiz07_19 {
    static void aryRmv(int[] a, int idx, int n) {
        if (n > 0 && idx >= 0 && idx + n < a.length) {
            int d = idx + n - 1;
            if (d > a.length - n - 1)
                d = a.length - n - 1;
            for (int i = idx; i <= d; i++) {
                a[i] = a[i + n];
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소 수: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]: ");
            a[i] = sc.nextInt();
        }

        System.out.print("삭제를 시작할 인덱스: ");
        int d = sc.nextInt();
        System.out.print("삭제할 요소의 개수: ");
        int e = sc.nextInt();

        aryRmv(a, d, e);

        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}

import java.util.Scanner;

class quiz6_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("요소 수: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            b[i] = a[n - i - 1]; 
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.println("b[" + i + "] = " + b[i]);
        }
    }
}

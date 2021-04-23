import java.util.Scanner;

class quiz6_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("요소 수: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        System.out.print("찾을 숫자: ");
        int s = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (a[i] == s) {
                System.out.print("그 값은 a[" + i + "]에 있습니다.");
                break;
            }
        }
    }
}

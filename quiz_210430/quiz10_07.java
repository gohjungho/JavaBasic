import java.util.Scanner;

public class quiz10_07 {
    // 유틸리티 클래스 만들기. 메서드 오버로딩
    public static int min(int a, int b) {
        // if (a < b)
        // return a;
        // else
        // return b;
        return a < b ? a : b;
    }

    public static int max(int a, int b) {
        // if (b < a)
        // return a;
        // else
        // return b;
        return a > b ? a : b;
    }

    public static int min(int a, int b, int c) {
        // if (a < b && a < c)
        // return a;
        // else if (b < c && b < c)
        // return b;
        // else
        // return c;

        int min = a;
        if (b < min)
            min = b;
        if (c < min)
            min = c;
        return min;
    }

    public static int max(int a, int b, int c) {
        // if (b < a && c < a)
        // return a;
        // else if (a < b && c < b)
        // return b;
        // else
        // return c;

        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        return max;
    }

    public static int min(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min)
                min = a[i];
        }
        return min;
    }

    public static int max(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }
        return max;
    }

    // 배열에서 최소값을 가지는 모든 요소의 인덱스를 저장한 배열 구하기
    public static int[] minIndexArr(int[] a) {
        int min = min(a);
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == min)
                count++;
        }
        int[] c = new int[count--];
        for (int i = a.length - 1; count >= 0; i--) {
            if (a[i] == min)
                c[count--] = i;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();
        System.out.print("c: ");
        int c = sc.nextInt();

        System.out.print("배열 arr의 요소 수: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("a, b의 최소값은: " + min(a, b));
        System.out.println("a, b의 최대값은: " + max(a, b));
        System.out.println("a, b, c의 최소값은: " + min(a, b, c));
        System.out.println("a, b, c의 최대값은: " + max(a, b, c));

        System.out.println("배열 arr의 최소값은 " + min(arr));
        System.out.println("배열 arr의 최대값은 " + max(arr));

        int xmin[] = minIndexArr(arr);
        System.out.println("배열 arr의 최소값은 " + min(arr));
        System.out.print("인덱스는 {");
        for (int i = 0; i < xmin.length; i++) {
            System.out.print(xmin[i] + " ");
        }
        System.out.println("} 입니다.");
    }
}

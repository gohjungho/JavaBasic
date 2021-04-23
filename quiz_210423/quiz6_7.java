import java.util.Scanner;

class quiz6_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("사람 수: ");
        int person = sc.nextInt();
        System.out.println("점수를 입력하세요.");

        int[] a = new int[person];
        int sum = 0, max = 0, min = a[0]; 
        
        for (int i = 0; i < person; i++) {
            System.out.print(i + 1 + "번의 점수: ");
            a[i]  = sc.nextInt();
            sum += a[i];
            if (max < a[i]) max = a[i];
            if (min > a[i]) min = a[i];
        }

        System.out.println("합계는 " + sum + "입니다.");
        System.out.println("평균은 " + (double)sum / person + "입니다.");
        System.out.println("최고점은 " + max + "입니다.");
        System.out.println("최저점은 " + min + "입니다.");
    }
}

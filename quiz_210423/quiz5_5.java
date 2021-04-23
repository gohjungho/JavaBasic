// 3개의 정수값을 읽어서 합계, 평균 구하기 (cast 연산자 활용)
import java.util.Scanner;

class quiz5_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정숫값 x,y,z의 평균을 구합니다.");
        System.out.print("x값: ");
        int x = sc.nextInt();
        System.out.print("y값: ");
        int y = sc.nextInt();
        System.out.print("z값: ");
        int z = sc.nextInt();
        System.out.println("x,y,z의 합계는 " + (x+y+z) + "입니다.");
        System.out.println("x,y,z의 평균은 " + (double)(x+y+z)/3 + "입니다.");
    }
}

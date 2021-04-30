import java.util.Scanner;

public class quiz15_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 s1: ");
        String s1 = sc.nextLine();
        System.out.print("문자열 s2: ");
        String s2 = sc.nextLine();

        int idx = s1.indexOf(s2); // indexOf:
        if (idx == -1)
            System.out.println("s1안에 s2가 포함되어있지 않습니다.");
        else {
            System.out.println(s1);
            for (int i = 0; i < idx; i++) {
                System.out.print(" ");
            }
            System.out.println(s2);
        }
    }
}

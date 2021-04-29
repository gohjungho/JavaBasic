import java.util.Scanner;

public class quiz07_06 {
    static void printSeason(int m) {
        switch (m) {
        case 12:
        case 1:
        case 2:
            System.out.print("겨울");
        case 3:
        case 4:
        case 5:
            System.out.print("봄");
        case 6:
        case 7:
        case 8:
            System.out.print("봄");
        case 9:
        case 10:
        case 11:
            System.out.print("봄");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 월입니까(1 ~ 12): ");
        int m = sc.nextInt();

        System.out.println("해당 월의 계절은 " + printSeason(m) + "입니다.");

    }
}

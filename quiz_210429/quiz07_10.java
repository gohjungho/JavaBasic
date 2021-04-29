import java.util.Scanner;
import java.util.Random;

public class quiz07_10 {
    static boolean retry() {
        Scanner sc = new Scanner(System.in);
        int cond;
        do {
            System.out.print("다시 한 번?<Yes...1/No...0>: ");
            cond = sc.nextInt();
        } while (cond != 0 && cond != 1);
        return cond == 1;
    }

    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("암산 훈련!!");

        do {
            // 난수 발생
            int x = 100 + rd.nextInt(900); // 3자리수
            int y = 100 + rd.nextInt(900);
            int z = 100 + rd.nextInt(900);
            int p = rd.nextInt(4); // 문제유형

            int answer = 0;
            switch (p) {
            case 0:
                answer = x + y + z;
                break;
            case 1:
                answer = x + y - z;
                break;
            case 2:
                answer = x - y + z;
                break;
            case 3:
                answer = x - y - z;
                break;

            }
            while (true) {
                System.out.print(x + ((p < 2) ? "+" : "-") + y + ((p % 2 == 0) ? "+" : "-") + z + "= ");
                int k = sc.nextInt();
                if (k == answer)
                    break;
                System.out.println("틀렸습니다.");
            }
        } while (retry());
    } // main end
}

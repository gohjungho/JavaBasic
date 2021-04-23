import java.util.Random;
import java.util.Scanner;

class quiz6_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        String[] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        String[] day_list = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
        
        System.out.println("요일명을 영어 약자로 입력하시오.");
        
        int re = 0;
        do {
            while(true) {
                int day = rd.nextInt(7) + 1;

                System.out.print(day_list[day - 1] + ": ");
                String s = sc.next(); 
                
                if (s.equals(days[day - 1])) break;
                System.out.println("틀렸습니다.");
            }
            System.out.print("정답입니다.");
            System.out.print("다시 한 번? 1.. Yes/0... No: ");
            re = sc.nextInt();
        } while (re == 1);
    }
}
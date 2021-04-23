import java.util.Random;
import java.util.Scanner;

class quiz6_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        String[] months = {
            "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", 
            "Aug", "Sep", "Oct", "Nov", "Dec"
        };
        System.out.println("해당 월의 영어 단어를 입력하시오.\n첫 글자는 대문자, 나머지는 소문자로 입력하세요");
                
        int re = 0;
        do {
            int month = rd.nextInt(12) + 1;
            while(true) {
                System.out.print(month + "월 :");
                String s = sc.next();
                
                if (s.equals(months[month-1])) break;
                System.out.println("틀렸습니다.");
            }
            System.out.print("정답입니다.");
            System.out.print("다시 한 번? 1.. Yes/0... No: ");
            re = sc.nextInt();
        } while (re == 1);
    }
}

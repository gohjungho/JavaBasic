import java.util.Scanner;

public class Conditional_Operator {
    public static void main(String[] args) {
        // 삼항연산자를 사용하여 (if 사용 금지)
        // 1이면 1st, 2이면 2nd, 3이면 3rd, 4이면 4th
        // 를 출력하는 프로그램을 작성하시오. 

        int ord; 
        Scanner input = new Scanner(System.in);
        System.out.print("숫자 입력: ");
        ord = input.nextInt();
        String crd = (ord % 10 == 1 & ord % 100 != 11) ? ord + "st" : 
                     (ord % 10 == 2 & ord % 100 != 12) ? ord + "nd" : 
                     (ord % 10 == 3 & ord % 100 != 13) ? ord + "rd" : 
                      ord + "th";
    
        System.out.println(ord + "는 " + crd);
    } 
}

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("두 자리 정수를 하나 입력해주세요.: ");
        String input = sc.nextLine(); // 입력받은 내용을 input에 저장
        int num = Integer.parseInt(input); // 강제로 Integer로 형 변환 

        System.out.println("입력내용: " + input);
        System.out.printf("num = %d%n", num);
    } 
}

import java.util.*;

class FlowEx10 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';

        System.out.print("당신의 점수를 입력하세요.(1~100): ");

        Scanner sc = new Scanner(System.in);
        String tmp = sc.nextLine();
        score = Integer.parseInt(tmp); // 문자열 tmp을 숫자로 변환

        switch(score/10) { // 자릿수 날리기. 일의 자리 버림 
            case 10:
            case 9:
                grade = 'A';
                break; 
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            default:
                grade = 'F';
        } // end of switch
        System.out.println("당신의 학점은 " + grade + "입니다.");
    }
}

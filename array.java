public class array {
    public static void main(String[] args) {
        // 배열 변수를 만들때에는 반드시 길이값이 필요
        String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
        for (int i = 0; i < weeks.length; i++) {
            System.out.println(weeks[i]);
            System.out.println(weeks[7]); // 예외처리 필요
        }
    }
}

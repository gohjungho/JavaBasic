public class ForExam3 {
    // for 문을 이용해 1부터 100까지 숫자 중 짝수만 출력해보세요.
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            } 
        }
    }
}

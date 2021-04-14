public class ExceptionExam3 {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;

        try {
            int k = divide(i, j);
            System.out.println(k);
        } catch(IllegalArgumentException e) {
            System.out.println(e.toString());
        }
    }

    public static int divide(int i, int j) throws IllegalArgumentException {
        // 오류가 발생하기 전 예외에 대해 값을 출력함 
        // if(j == 0) {
        //     System.out.println("두 번째 매개변수는 0이면 안 됩니다.");
        //     return 0;
        // }

        // 강제 에러 발생시키기 
        // 메소드 뒤에 throws IllegalArgumentException를 넣어줘야 함
        // main에 try-catch 삽입 
        if (j == 0) {
            throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
        }
        int k = i / j;
        return k;
    }
}

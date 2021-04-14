public class ExamExam {
    public static void main(String[] args) {
        ExceptionExam1_1 ex = new ExceptionExam1_1();
        // int num = ex.get50thItem(new int[100]);
        // System.out.println("array 배열의 50번째 요소의 값 : " + num);
        // 정상출력 (0) 

        int num = ex.get50thItem(new int[30]);
        System.out.println("array 배열의 50번째 요소의 값 : " + num);
        // 배열을 30칸으로 설정했으나 50번째 요소의 값을 구하고자 했기에 오류 발생 
    }
}

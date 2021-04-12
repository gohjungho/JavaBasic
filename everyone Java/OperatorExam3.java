public class OperatorExam3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;

        //System.out.println(++a - 5); // 1 더하고 -5 계산 
        System.out.println(a++ - 5); // -5 먼저 계산하고 ++ 계산 
        System.out.println(a);
    }
}

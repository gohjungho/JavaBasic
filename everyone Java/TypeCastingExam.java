public class TypeCastingExam {
    public static void main(String[] args) {
        int x = 50000;
        long y = x;
        
        long x2 = 5;
        int y2 = (int) x2; // 명시적(강제) 형변환 
        System.out.println(y2);
    }
}
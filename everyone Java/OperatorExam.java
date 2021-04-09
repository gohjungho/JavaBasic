public class OperatorExam {
    public static void main(String[] args) {
        int i1 = -5;
        int i2 = +i1; // -5
        int i3 = -i1; // 5
        int i4 = ++i3;  // int i4 = ( i3 = i3+1) // i4 = 6, i3 = 6
        int i5 = i3++;  // int i5 = i3;  i3 = i3+1; // i5 = 6, i3 = 7

        System.out.println(i5);
        System.out.println(i3);
    }
}

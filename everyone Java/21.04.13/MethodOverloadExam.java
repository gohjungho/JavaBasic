public class MethodOverloadExam {
    public static void main(String[] args) {
        MyClass2 n = new MyClass2();

        System.out.println(n.plus(4,5));
        System.out.println(n.plus(4,6,7));
        System.out.println(n.plus("hello","world"));
    }
}

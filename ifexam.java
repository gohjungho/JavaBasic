public class ifexam {
    public static void main(String[] args) {

        // int base = 180;
        // int height = 185;
        // boolean isTall = (height > base);

        // if (isTall) {
        //     System.out.println("키가 큽니다.");
        // }

        String a = "hello";
        String b = "java";
        String c = "hello";
        String d = new String("hello");
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a == c);
        System.out.println(a == d);
        System.out.println(a.equals(d)); // a == d와 결과가 다르다
        System.out.println(a);
        System.out.println(d);
        System.out.println(System.identityHashCode(a)); // 실제 저장되어 있는 주소값 찍기
        System.out.println(System.identityHashCode(c)); // a와 c의 주소값이 같다.
        System.out.println(System.identityHashCode(d)); 
        // 그러나 d와는 새 주소를 부여받은 걸 볼 수 있다.
    }
}
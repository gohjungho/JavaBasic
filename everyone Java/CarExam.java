public class CarExam {
    public static void main(String[] args) {
        // str1 str2 without NEW keyword -> hello
        // str3 str4 with NEW keyword -> hello 
        // str1~str4 모든 주소 출력 

        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        String str4 = new String("hello");

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));

        if (str1 == str2) {
            System.out.println("주소가 같습니다.");
        } else {
            System.out.println("주소가 다릅니다.");
        }

        if (str3 == str4) {
            System.out.println("주소가 같습니다.");
        } else {
            System.out.println("주소가 다릅니다.");
        }

        if (str3.equals(str4)) {
            System.out.println("주소가 같습니다.");
        } else {
            System.out.println("주소가 다릅니다.");
        }
    }
}

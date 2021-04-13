public class StringMethodExam {
    public static void main(String[] args) {
        // String str = new String("hello");
        String str = "hello";
        System.out.println(str.length()); // 문자열 길이 세기 
        System.out.println(str.concat(" world")); // 문자열 결합 
        System.out.println(str); // str 객체의 값이 바뀐 것은 아니다. 
        // String는 불변 클래스이다! 
        
        str = str.concat(" world");
        System.out.println(str);

        // str.substring(beginIndex, [endIndex]);
        // (begin ≤ x < end).
        System.out.println(str.substring(3));
        System.out.println(str.substring(3, 6));
    }
}

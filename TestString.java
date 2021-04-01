public class TestString {
    public static void main(String[] args) {
        // 종합 
        String a = "Hello Java";
        System.out.println(a.indexOf("Java"));
        System.out.println(a.replaceAll("Java", "World"));
        System.out.println(a.substring(0, 4));
        System.out.println(a.toUpperCase());
    }
}
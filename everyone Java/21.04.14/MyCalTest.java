public class MyCalTest {
    public static void main(String[] args) {
        Calculator cal = new MyCal();
        cal.plus(3,4);
        int i = cal.plus(5,6);
        System.out.println(i);

        // cal.exec2; 
        // static 메서드는 반드시 인터페이스명.메서드명(); 형식으로 호출해야 한다.
        Calculator.exec2(3,4);
    }
}

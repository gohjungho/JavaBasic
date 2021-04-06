public class Test4 {
    int a; // 객체 변수 a 

    public void vartest() { // (클래스 객체명)
        this.a++;
    }

    public static void main(String[] args) {
        Test4 myTest = new Test4();
        myTest.a = 1;

        myTest.vartest(); // this로 호출 
        System.out.println(myTest.a);
    }
}

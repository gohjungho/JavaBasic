// 객체 변수 사용하기 
// 이 형태는 이해가 쉽지 않다.... 

public class Test3 {

    int a; // 객체 변수 a 

    public void vartest(Test3 test) { // (클래스 객체명)
        test.a++;
    }

    public static void main(String[] args) {
        Test3 myTest = new Test3();
        myTest.a = 1;

        myTest.vartest(myTest);
        System.out.println(myTest.a);
    }
}

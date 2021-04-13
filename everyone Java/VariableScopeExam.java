public class VariableScopeExam {
    int globalScope = 10;
    static int staticVal = 7;

    // value 변수는 scopeTest() 메서드 안에서만 사용 가능
    public void scopeTest(int value) {
        int localScope = 20;

        System.out.println(globalScope);
        System.out.println(localScope);
        System.out.println(value);
    }

    public void scopeTest2(int value2) {
    
        System.out.println(globalScope);
        // System.out.println(localScope);
        // System.out.println(value);
        System.out.println(value2);
    }

    public static void main(String[] args) {
        // System.out.println(globalScope);
        // System.out.println(localScope);
        // System.out.println(value);

        System.out.println(staticVal);

        VariableScopeExam v1 = new VariableScopeExam();
        System.out.println(v1.globalScope); // 객체에 넣어 사용하면 찍을 수 있다. 
        
        VariableScopeExam v2 = new VariableScopeExam();
        v1.globalScope = 10;
        v2.globalScope = 20;
        System.out.println(v1.globalScope);
        System.out.println(v2.globalScope);

        // static은 값을 공유한다. (공유변수) 
        v1.staticVal = 50;
        v2.staticVal = 100;
        System.out.println(v1.staticVal);
        System.out.println(v2.staticVal);
    }
}

// 메소드의 종류는 4개가 있으나 입력과 출력이 모두 있는 형태를 가장 많이 쓴다.

public class method_1 {

    // 가장 기본적인 형태의 메소드 
    public int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        Test myTest = new Test();
        int c = myTest.sum(a, b);

        System.out.println(c);
    }
}

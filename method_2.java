// 입력값이 없는 메소드

public class method_2 {

    // 1. 가장 기본적인 형태의 메소드. 입, 출력 모두 있음
    public int sum(int a, int b) {
        return a + b;
    }

    // 2. 입력값이 없고 출력값만 있는 메소드 
    public String say() {
        return "Hi";
    }

    // 3. 입력은 있고 출력이 없는 메소드 
    public void sum2(int a, int b) {
        System.out.println(a + " " + b + "의 합은 " + (a + b) + "입니다.");
        // return이 없다면 반환값이 없는 것 
        // print로 값을 찍은 것 뿐이지 가지고 나온 것은 아니다. 
    }

    // 4. 입력과 출력이 둘다 없는 메소드 
    public void say2() {
        System.out.println("bye!");
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        method_2 myTest = new method_2(); // 클래스 객체명 = new 클래스();

        int c = myTest.sum(a, b);
        System.out.println(c);

        String d = myTest.say();
        System.out.println(d);

        myTest.sum2(a,b);

        myTest.say2();
    }
}
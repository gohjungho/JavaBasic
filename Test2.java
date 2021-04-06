public class Test2 {
    // .equals 사용하기 
    
    // public void say_nick(String nick) {
    //     if ("fool".equals(nick)) {
    //         return; // 리턴 자료형이 void가 아닌 자료형이 명시되어 있다면 return만 남겨둘 수 없다.
    //     }
    //     System.out.println("나의 별명은 " + nick + " 입니다.");
    // }

    public int vartest(int a) {
        a++;
        return a; // 리턴에 ;만 들어가는 형태는 리턴 자료형이 void인 경우에만 가능하다.
    }

    public static void main(String[] args) {
        int a = 1; 

        Test2 myTest = new Test2();
        a = myTest.vartest(a);
        System.out.println(a);
    }
    // 로컬 변수(지역 변수, local variable)는 메소드 내에서만 쓰인다.
}

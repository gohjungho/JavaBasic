public abstract class Bird {
    public abstract void sing();
    // 중괄호를 열고 닫으면 '구현했다'라고 보기에 중괄호는 생략한다.
    
    public void fly() {
        System.out.println("날다.");
    }

    // 추상 클래스는 부모 클래스로 사용할 수는 있지만, 객체를 생성할 수는 없다.
}

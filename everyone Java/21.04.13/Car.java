public class Car {
    // (자료형) 타입 필드명 
    String name;
    int number;

    public Car(String name) {
        this.name = name;
    }

    public Car() {
        // this.name = "이름없음";
        // this.number = 0;
        this("이름없음", 0); // 여기의 this는 생성자 호출. c2("이름없음", 0)
        // 매개변수가 없는 객체가 만들어졌을 때 호출되어서 
        // 아래 매개변수 두개인 생성자를 재호출
    }

    public Car(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public void run() {
        System.out.println("달리다.");
    }
}

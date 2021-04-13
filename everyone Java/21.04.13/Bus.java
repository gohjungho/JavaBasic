public class Bus extends Car2 {
    int fee;
    public Bus(String name, int number, int fee) {
        // super를 이용해 Car2 클래스의 생성자를 이용하세요. 
        super(name, number);
        this.fee = fee;
    }
}

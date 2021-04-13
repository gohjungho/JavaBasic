public class Car2 {
    String name;
    int number;
    
    public Car2() {
        // this.name = "이름없음";
        // this.number = 0;
        this("이름없음", 0);
    }

    public Car2(String name) {
        // this.name = name;
        // this.number = 0;
        this(name, 0);
    }

    public Car2(String name, int number) {
        this.name = name;
        this.number = number;
    }
}

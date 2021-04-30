public class quiz08_03 {

}

class Car {
    // 클래스 변수
    public String name;
    public String number;
    public int width;
    public int height;
    public int length;
    public double tank;
    public double x;
    public double y;
    public double fuel;
    public double mpg;

    // 생성자
    Car(String name, String number, int width, int height, int length, double tank, double mpg) {
        this.name = name;
        this.number = number;
        this.width = width;
        this.height = height;
        this.length = length;
        this.tank = tank;
        this.mpg = mpg;
    }
}
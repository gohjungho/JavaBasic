public class CarExam4 {
    public static void main(String[] args) {
        Car2 car1 = new Car2();
        Car2 car2 = new Car2("자동차");
        Car2 car3 = new Car2("자동차",1234);
    System.out.println(car1.name +" , "+car1.number);
    System.out.println(car2.name +" , "+car2.number);
    System.out.println(car3.name +" , "+car3.number);
    }
}

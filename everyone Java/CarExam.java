public class CarExam {
    public static void main(String[] args) {
        // Person 클래스에서 String과 int를 매개변수로 받는 생성자를 호출
        MethodOverloadReview car = new MethodOverloadReview();

        car.run();
        // int형 매개변수를 받는 run을 호출
        car.run(100);
    }
}

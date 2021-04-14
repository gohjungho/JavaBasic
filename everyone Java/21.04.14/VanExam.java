public class VanExam {
    public static void main(String[] args) {
        // ToDo Auto-generated method stub 
        Car c = new Van(); // Car 클래스(상위)로 Van 클래스(하위)를 만듦 
        c.run(); 
        // c.ppangppang(); // 부모 타입으로 가지고 있어서 사용할 수는 없다. 
        // 자료형은 Car이지만 생성된 객체는 Van이므로 Van의 메소드를 적용한다. 
        // 이처럼 객체를 찍었을 때에도 하위 클래스의 메소드를 먼저 적용받는다. 

        Van van = (Van) c; // 객체 c를 van으로 형변환. new가 없으므로 객체 생성이 아니다!
        van.run();
        van.ppangppang();
    }
}

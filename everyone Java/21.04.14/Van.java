public class Van extends Car {
    public void run() {
        // super.run(); // 상위 클래스 실행 
        System.out.println("Van의 run 메서드"); // 하위 클래스도 실행
    }

    public void ppangppang() {
        System.out.println("빵빵");
    }
}

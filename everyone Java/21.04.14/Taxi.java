public class Taxi implements Meter {
    // Meter 인터페이스의 start와 stop 메서드를 구현해야 합니다. 
    public void start() {
        System.out.println("운행을 시작합니다.");
    }
    
    public int BASE_FARE = 3000;
    
    public int stop(int distance) {
        int fare = BASE_FARE + distance * 2;
        System.out.println("운행을 종료합니다. 요금은 " + fare + "원입니다.");
        return fare;
    }
}

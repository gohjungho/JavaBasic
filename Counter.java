// Call by value

class Updater {
    // public void update(int count) {
    //     count++;
    // }
    public void update(Counter counter) { // 객체 자체를 전달 받음 
        counter.count++;
    }
}

public class Counter {
    int count = 0; // 객체변수 
    public static void main(String[] args) {
        Counter myCounter = new Counter();
        System.out.println("before update:" + myCounter.count);
        Updater myUpdater = new Updater();
        // myUpdater.update(myCounter.count);
        myUpdater.update(myCounter); // 결과값에 1 출력
        System.out.println("after update:" + myCounter.count);
        // 0 출력 -> 1 출력 

        // 변수로 전달 -> 객체로 전달 (값을 유지할 수 있다.)
    }
}


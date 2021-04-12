package house;

public class Test3 extends Thread {
    int seq;
    public Test3(int seq) {
        this.seq = seq;
    }

    public void run() {
        System.out.println(this.seq + " thread start.");
        try {
            Thread.sleep(1000);
        } catch(Exception e) {

        }
        System.out.println(this.seq + " thread end.");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread t = new Test3(i);
            t.start();
        }
        System.out.println("main end."); 
        
        // Thread에 start와 run()이 정의되어 있다.
        // start()를 호출하면 run()을 자동으로 호출한다. 
    }
}

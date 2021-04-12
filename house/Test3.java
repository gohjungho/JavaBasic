package house;

import java.util.ArrayList;

public class Test3 implements Runnable {
    // Runnable 인터페이스: run 메소드를 구현하도록 강제한다. 
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
        ArrayList<Thread> threads = new ArrayList<Thread>();
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(new Test3(i));
            t.start();
            threads.add(t);
        }

        for (int i = 0; i<threads.size(); i++) {
            Thread t = threads.get(i);
            try {
                t.join();
            } catch (Exception e) {

            }
        }
        System.out.println("main end."); 
        
        // Thread에 start와 run()이 정의되어 있다.
        // start()를 호출하면 run()을 자동으로 호출한다. 
    }
}

import java.util.*;

class RandomEx1 {
    public static void main(String[] args) {
        Random rd = new Random(1);
        Random rd2 = new Random(1); 

        System.out.println("= rand =");
        for(int i = 0; i < 5; i++) 
            System.out.println(i + ":" + rd.nextInt());

        System.out.println();
        System.out.println("= rd2 = ");
        for(int i = 0; i < 5; i++) 
            System.out.println(i + ":" + rd2. nextInt());
    }
}

// import java.util.Scanner;

class quiz5_8 {
    public static void main(String[] args) {
        System.out.println("float        int");
        System.out.println("-----------------");

        float a  = 0.0F;
        for (int i = 0; i <= 1000; i++, a += 0.001F) {
            System.out.printf("%10.7f  %10.7f%n", a, (float)i / 1000);
        }
    }
}

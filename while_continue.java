public class while_continue {
    public static void main(String[] args) {
        int a = 0;
        while (a < 10) {
            a++; // 1, 2, 3, 4
            if (a % 2 == 0) {
                continue;
            }
            System.out.println(a);
        }
    }
}

public class Gugu {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i * j);
                if (j == 9) {
                    System.out.print(""); // 마지막 콤마 없애기 위함
                } else {
                    System.out.print(", "); // 콤마로 구분
                }
                if (j == 9) {
                    System.out.print("\n"); // 단 별로 줄 구분 
                }
            }
        }
    }
}

public class googoodan {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i * j + " "); 
                // 값 사이 한 칸 공백
                // \n를 포함하는 println과 달리 
                // print는 \n 없이 붙여쓴다            
            }
            System.out.println(""); // 줄바꿈
        }
    }
}

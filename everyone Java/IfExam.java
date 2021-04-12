public class IfExam {
    public static void main(String[] args) {
        int x = 50;
        int y = 60;

        // if (x > y) {
        //     System.out.println("x는 y보다 큽니다.");
        //     System.out.println("test 1");
        // }

        // if (x > y) 
        //     // 괄호가 없으면 한 줄만 True case로 인식한다.
        //     System.out.println("x는 y보다 큽니다."); 
        //     System.out.println("test 2");

        if (x == y) {
            System.out.println("x와 y는 같습니다.");
        } else if (x > y) {
            System.out.println("x는 y보다 큽니다.");
        } else {
            System.out.println("x는 y보다 작습니다.");
        }
    }
}

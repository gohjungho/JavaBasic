import java.util.Scanner;

public class StreamTest {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // sc는 객체 이름이므로 어떤 이름이든 무관하다.
        int a = sc.nextInt();
        
        if (a == 1) {
            System.out.println("박영선");
        } else if (a == 2) {
            System.out.println("오세훈");
        } else if (a == 3) {
            System.out.println("허경영");
        } else {
            System.out.println("무효");
        }

        // System.out.println(sc.next()); 
        // 값을 출력하기 위해 next(단어), nextInt(정수), nextLine(라인)가 뒤에 붙어있어야 한다.
    }
}

// 입력을 받아서 1이면 -, 2이면 -, 3이면 -을 
// 각각 출력하는 프로그램 만들기 
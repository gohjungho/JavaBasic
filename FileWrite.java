// import java.io.FileOutputStream; // 파일 생성
// import java.io.FileWriter;
// import java.io.printWriter; 
// import java.io.IOException; // 예외 처리 

import java.io.*; // 편하긴 하나 쓸데없는 것도 가져오기에 좋은 방법은 아니다. 

public class FileWrite {
    public static void main(String[] args) throws IOException {
        // FileOutputStream output = new FileOutputStream("out.txt");
        // FileWriter fw = new FileWriter("out.txt");
        PrintWriter pw = new PrintWriter("out.txt");
        for (int i = 1; i < 11; i++) {
            String data = i + " 번째 줄입니다."; // \r\n은 줄바꿈 
            // fw.write(data);
            pw.println(data);
        }
        pw.close();

        // FileWriter fw2 = new FileWriter("out.txt", true);
        PrintWriter pw2 = new PrintWriter(new FileWriter("out.txt", true)); 
        // true가 txt파일 내의 내용을 지우지 않고 이어쓰게 만들어준다.
        for (int i = 10; i < 21; i++) {
            // String data = i + " 번째 줄입니다. \r\n"; // \r\n은 줄바꿈 
            // fw2.write(data);
            String data = i + " 번째 줄입니다."; 
            pw2.println(data);
        }
        pw2.close();
        // 결과값이 out.txt에 출력된다. 
    }
}


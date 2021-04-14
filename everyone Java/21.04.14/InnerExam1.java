public class InnerExam1 {
    class Cal {
        int value = 0;
        public void plus() {
            value++;
        }
    }

    // 인스턴스 클래스
    public static void main(String[] args) {
        InnerExam1 t = new InnerExam1(); // 객체 하나 생성

        // t.new Cal();
        InnerExam1.Cal cal = t.new Cal(); // 생성한 객체로 이너클래스 객체 생성 

        // 복잡해;; 
        cal.plus();
        System.out.println(cal.value);
    }
}

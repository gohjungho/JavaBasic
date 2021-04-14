public class InnerExam3 {
    public void exec() { // 클래스를 지역변수처럼 사용 
        class Cal {
            int value = 0;
            public void plus() {
                value++;
            }
        }
        // 메인이 아닌 메소드 안에서 직접 객체를 찍고 호출을 한다. 
        Cal cal = new Cal();
        cal.plus();
        System.out.println(cal.value);
    }

    // 지역 중첩 클래스 - 메소드 안의 클래스
    public static void main(String[] args) {
        InnerExam3 t = new InnerExam3();
        t.exec();
    }
}

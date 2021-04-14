public class BizExam {
    public static void main(String[] args) {
        BizService biz = new BizService();
        biz.bizMethod(5);
        try {
            biz.bizMethod(-3);
        } catch (Exception e) { // Exception은 모든 오류를 가리킴 
            e.printStackTrace();
        }
        System.out.println("프로그램 종료");
    }
}

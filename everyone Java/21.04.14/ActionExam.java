public class ActionExam {
    public static void main(String[] args) {
        // Action action = new MyAction()
        // action.exec();

        // 익명 클래스
        // 어렵고만....
        Action action = new MyAction() { 
            @Override 
            public void exec() {
                System.out.println("exec");
            }
        };
        action.exec();
    }
}

public class MethodOverloadReview {
    public class car {
        public void run() {
            System.out.println("차가 달립니다."); 
        }
    }

    // int형 변수를 매개변수로 받는 run 메서드를 추가하자. 
    public void run(int sp) {
        System.out.println("차가 " + sp + "km로 달립니다.");
    }
}

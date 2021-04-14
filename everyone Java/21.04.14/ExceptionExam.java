public class ExceptionExam {
    // try{
    //     수행할 코드, 예외 발생 가능성이 있는 블록
    // } catch(발생할 수 있는 예외 타입 변수명) {
    //     처리할 코드
    // } finally{
    //     예외 발생 여부와 상관없이 무조건 실행하는 블록(생략 가능)
    // }


    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        try {
            int k = i / j;
            System.out.println(k); 
        } catch (ArithmeticException e) {
            // 모든 예외는 Exception 클래스를 상속받는다. 여기에서 받아서 찍는 것! 
            System.out.println("0으로 나눌 수 없습니다." + e.toString()); 
        } catch(NullPointerException e) {
            System.out.println("Null은 처리할 수 없습니다."+e.toString());
        } finally {
            System.out.println("예외와 상관없이 무조건 실행!"); 
        }
        System.out.println("main end!"); 
    }
}

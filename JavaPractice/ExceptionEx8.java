class ExceptionEx8 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0); // 예외 발생!!!
            System.out.println(4);
        } catch (ArithmeticException ae) {
            ae.printStackTrace(); // 예외발생 당시의 호출스택에 있었던 메서드의 정보와 예외 메시지를 출력
            System.out.println("예외 메시지: " + ae.getMessage());
        }
    System.out.println(6);
    }
}

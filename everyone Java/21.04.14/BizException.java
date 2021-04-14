public class BizException extends RuntimeException {
    public BizException(String msg) {
        super(msg); // 메시지를 가져와서 super에 메시지를 보내는 생성자
    }

    public BizException(Exception ex) {
        super(ex); // Exception을 받아들여 해당 예외를 부모 생성자에 넘겨주는 생성자
    }
}

public class AccessObj {
    public int p = 3;
    protected int p2 = 4; 
    // 같은 패키지 내에서만 접근 허용. 단 상속받은 경우에는 접근 허용
    int k = 2; 
    // 제한자 없음. (=default 접근 지정자). 패키지 내에서 접근 허용  
    private int i = 1;
    // 자기 자신만 접근 가능 
}
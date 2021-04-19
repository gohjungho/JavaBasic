public class PrintfEx1 {
    public static void main(String[] args){
        int finger = 10;
        // 5자리의 출력값을 가지는 finger 변수 생성, 출력(오른쪽 정렬. 디폴트) 
        System.out.printf("finger = [%5d]\n", finger); 
        // 5자리의 출력값을 가지는 finger 변수 생성, 출력(왼쪽 정렬)
        System.out.printf("finger = [%-5d]\n", finger); 
        // 5자리의 출력값을 가지면서 빈자리는 0으로 채워주는 변수 생성, 출력 
        System.out.printf("finger = [%05d]\n", finger); 
    }
}

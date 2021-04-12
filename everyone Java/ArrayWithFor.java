public class ArrayWithFor {
    public static void main(String[] args) {
        int[] iarray = new int[100];

        // for 문을 사용해 배열에 값 넣기 
        for (int i = 0; i < iarray.length; i++) {
            iarray[i] = i + 1;
        }

        // 배열 출력 
        for (int i = 0; i < iarray.length; i++) {
            System.out.print(iarray[i] + " ");
        }

        System.out.println();
        System.out.println();
        
        // 전체 누적 합계 
        int sum = 0; // 반드시 for문 바깥에서 초기화 해줘야 한다.
        for (int i = 0; i < iarray.length; i++) {
            sum += iarray[i];
        }
        System.out.println(sum);
    }
}

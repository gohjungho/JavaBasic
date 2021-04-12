public class ForEachExam {
    public static void main(String[] args) {
        int[] iarr = {10,20,30,40,50};

        // for (int i = 0; i < iarr.length; i++) {
        //     int value = iarr[i];
        //     System.out.println(value);
        // }

        // for each 문 
        // 개수를 따로 파악할 필요가 없다.
        for (int value : iarr) {
            System.out.println(value);
        }
    }
}

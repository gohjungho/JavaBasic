public class ArrayExam {
    public static void main(String[] args) {
        // 정수값 100개를 저장할 수 있는 int형 배열
        // int[] array1 = new int[100];

        int[] array2 = new int[]{1,2,3,4};
        int[] array3 = {1,2,3,4}; // 가장 일반적인 방법 

        System.out.println(array3[3]);

        int value = array3[0];
        System.out.println(value);
    }
}

import java.util.Scanner;

public class quiz06_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("학급 수: ");
        int classNum = sc.nextInt();
        int[][] point = new int[classNum][];
        int totNum = 0;
    
        System.out.println();
    
        for(int i = 0; i < point.length; i++) {
            System.out.print((i+1) + "반의 학생 수: ");
            int num = sc.nextInt();
        
            point[i] = new int[num];
            totNum += num;
    
            for(int j = 0; j < point[i].length; j++) {
                System.out.print((i+1) + "반" + (j+1) + "번의 점수: ");
                point[i][j] = sc.nextInt();
            }
        }
        
        System.out.println();
        System.out.println("  반 | 합계  평균");
        System.out.println("-----+------------");
        int total = 0;
    
        for (int i = 0; i < point.length; i++) {
            int sum = 0;
            for (int j = 0; j < point[i].length; j++) {
                sum += point[i][j];
            }
            total += sum;
            System.out.printf("%2d반 | %3d %6.1f\n",i+1,sum, (double)sum/point[i].length);
        }
        System.out.println("-----+------------");
        System.out.printf("  합 | %3d %6.1f\n",total, (double)total/totNum);
    }
}

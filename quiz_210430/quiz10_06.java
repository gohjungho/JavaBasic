public class quiz10_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("실수값: ");
        double x = sc.nextDouble();

        System.out.println("절대값: " + Math.abs(x));
        System.out.println("제곱근: " + Math.sqrt(x));
        System.out.println("면적: " + Math.PI * x * x);

    }
}

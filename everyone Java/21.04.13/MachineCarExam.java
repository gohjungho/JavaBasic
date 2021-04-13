public class MachineCarExam {
    public static void main(String[] args) {
        MachineCar car = new MachineCar();
        if (car instanceof Machine) {
            System.out.println("Car가 Machine을 상속받았습니다.");
        } else {
            System.out.println("Car가 Machine을 상속받지 않았습니다.");
        }
    }
}

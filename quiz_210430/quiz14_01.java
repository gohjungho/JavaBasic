public class quiz14_01 {
    class Headphone implements Wearable {
        public void putOn() {
            System.out.println("헤드폰을 착용했습니다.");
        }

        public void takeOff() {
            System.out.println("헤드폰을 벗었습니다.");
        }

        public void setVolume() {
            System.out.println("볼륨을 조정합니다.");
        }
    }

    class WearableComputer implements Wearable {
        public void putOn() {
            System.out.println("컴퓨터를 실행했습니다.");
        }

        public void takeOff() {
            System.out.println("컴퓨터를 껐습니다.");
        }

        public void reboot() {
            System.out.println("컴퓨터를 재시작합니다.");
        }
    }

    public static void main(String[] args) {

    }
}
public class LedTV implements TV{
    @Override // annotation 
    public void turnOn() {
        // ToDo Auto-generated method stub
        System.out.println("켜다");
    }

    @Override // annotation 
    public void turnOff() {
        // ToDo Auto-generated method stub
        System.out.println("끄다");
    }

    @Override // annotation 
    public void changeVolume(int volume) {
        // ToDo Auto-generated method stub
        System.out.println("볼륨을 조절하다");
    }

    @Override // annotation 
    public void changeChannel(int channel) {
        // ToDo Auto-generated method stub
        System.out.println("채널을 변경하다");
    }
}

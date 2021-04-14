public interface TV {
    public int MIN_VOLUME = 0;
    public int MAX_VOLUME = 100;
    
    // 메서드는 매개변수가 있을 수 있으므로 괄호를 붙여야한다. 
    public void turnOn();
    public void turnOff();
    public void changeVolume(int volume);
    public void changeChannel(int channel);
}

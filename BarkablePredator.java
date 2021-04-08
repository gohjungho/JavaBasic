// interface의 경우 다중 상속이 가능하기에 extends에 여러개가 걸려 있어도 오류가 나지 않는다.
// 일반 클래스의 경우 단일 상속만 가능하다. 

public interface BarkablePredator extends Predator, Barkable {
    // public void bark();
    // public String getFood();
}

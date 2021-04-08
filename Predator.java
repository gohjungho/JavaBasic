// interface는 만드는게 아닌 '구현한다' 라고 한다.
// 동물이 추가될 때마다 새 클래스를 만들어주고 Predator를 물려주자.

// 다중 상속은 불가하지만 인터페이스는 다중 구현이 가능하다. 
// ex) implements Predator, a, b, c,  ... 

// Abstract Class(추상 클래스)
// 추상 클래스는 abstract가 들어가야한다. 
// 메소드에도 들어가야한다. 몸통은 구현하지 않는다. 
public abstract class Predator extends Animal {

    // 이름만 달랑 있는 메소드. 
    // 메소드와 변수의 선언은 하지만 상세하게 구현하지 않는다. 
    // 세부 사항은 각 클래스에 정의해 준다.(인터페이스의 규칙)
    // 인터페이스에 맞물려 있는 클래스들은 전부 각각의 파일로 구현해줘야 한다.
    public abstract String getFood();

    // 추상 클래스의 장점은 인터페이스의 기능과 일반 클래스의 기능을 함께 지닌다.
    // 즉, 하이브리드 
    // 단, 인터페이스에서 클래스로 변경되었으므로 이외에 다른 클래스를 상속받을 수 없다.
    public boolean isPredator() {
        return true;
    }
    
}

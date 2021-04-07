// 메소드 오버라이딩(Method Overriding)
// 상속의 상속, 부모 조부모의 클래스를 사용할 수 있다.
// 부모와 같은 이름의 클래스가 있는 경우 자신의 것을 우선으로 한다.(오버라이딩(덮어쓰기))

public class HouseDog extends Dog{
    // 생성자(Constructor)
    // 생성자의 특징 1. 클래스 명과 동일 2. return값이 없다.
    // 생성자는 new라는 키워드가 사용될 때 호출된다.(생성할 때 자동 호출) 
    public HouseDog(String name) { 
        this.setName(name);
    }

    // 생성자 오버로딩(Constructor Overloading) 
    // 생성자가 이미 있지만 위는 문자형을 받고 아래는 숫자형을 받는 차이가 있다.
    // 인자를 구분해 적합한 것을 호출한다. 
    public HouseDog(int type) {
        if (type == 1) {
            this.setName("yorkshire");
        } else if (type == 2) {
            this.setName("bulldog");
        }
    }

    public void sleep() {
        System.out.println(this.name + " zzz in house");
    }

    // 오버로딩(Method Overloading)
    // 형식만 다른 같은 이름의 클래스가 삽입된 경우. 인수의 유무를 따져 둘을 구분하여 대응한다.
    public void sleep(int hour) {
        System.out.println(this.name + " zzz in house for " + hour + " hours.");
    }

    public static void main(String[] args) {
        HouseDog dog = new HouseDog("happy"); 
        // 위 생성자에 이름을 인수로 받기로 했으므로 happy를 넣어줘야한다.
        HouseDog yorkshire = new HouseDog(2);
        System.out.println(dog.name);
        System.out.println(yorkshire.name);
    }
}

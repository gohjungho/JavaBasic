// 상속을 위해서는 extends 키워드를 사용한다.
// 자식 클래스 extends 부모클래스 

public class Dog extends Animal {
    // default 생성자 
    public Dog() {
        // 아무 기능이 없는 생성자
        // 클래스명과 동일하고 return값이 없다는 특징을 모두 갖췄다.
        // 따로 디폴트 생성자를 넣지 않아도 컴파일러가 자동으로 만들어준다. 
    }

    public void sleep() {
        System.out.println(this.name + " zzz"); 
        // this <- dog, name <- setName, 즉 puppy가 들어감
    }

    
} 
// The public type Dog must be defined in its own file
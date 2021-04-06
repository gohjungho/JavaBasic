// 클래스(class) 매우 중요!!
// 객체 변수 (Instance variable)

public class Animal {
    String name;

    public void setName(String name) {
        this.name = name; // 파이썬의 self와 같다.
    }

    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.setName("boby");
        
        Animal dog = new Animal();
        dog.setName("happy");

        Animal horse = new Animal();
        horse.setName("nabi");

        Animal rabbit = new Animal();
        rabbit.setName("mija");

        System.out.println(cat.name);
        System.out.println(dog.name);
        System.out.println(horse.name);
        System.out.println(rabbit.name);
    }
}

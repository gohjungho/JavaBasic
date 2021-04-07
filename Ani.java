// 클래스(class) 매우 중요!!
// 객체 변수 (Instance variable)

public class Ani {
    String name;

    public void setName(String name) {
        this.name = name; // 파이썬의 self와 같다.
    }

    public static void main(String[] args) {
        Ani cat = new Ani();
        cat.setName("boby");
        
        Ani dog = new Ani();
        dog.setName("happy");

        Ani horse = new Ani();
        horse.setName("nabi");

        Ani rabbit = new Ani();
        rabbit.setName("mija");

        System.out.println(cat.name);
        System.out.println(dog.name);
        System.out.println(horse.name);
        System.out.println(rabbit.name);
    }
}

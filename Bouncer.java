public class Bouncer {
    public void barkAnimal(Barkable animal) { 
        // A instanceof B : A가 B로 만들어진 객체인가?

        // 데이터타입에 Barkable이 들어간 건 bark 메소드를 가져오기 위함 
        
        animal.bark();
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        Crocodile crocodile = new Crocodile();
        Leopard leopard = new Leopard();
        Bouncer bouncer = new Bouncer();

        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);
        bouncer.barkAnimal(crocodile);
        bouncer.barkAnimal(leopard);
    }
}

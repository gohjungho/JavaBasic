public class Tiger extends Predator implements Barkable { 
    // implements로 인해 Predator의 객체에 포함된다.
    // 쉽게 Animal과 Predator에 물려놨다고 생각하자.
    
    public String getFood() {
        return "apple";
    }

    public void bark() {
        System.out.println("어흥");
    }
}

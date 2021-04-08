public class Crocodile extends Predator implements Barkable {
    
    public String getFood() {
        return "strawberry";
    }

    public void bark() {
        System.out.println("쩝쩝");
    }
}

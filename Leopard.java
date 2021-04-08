public class Leopard extends Predator implements Barkable {
    public String getFood() {
        return "orange";
    }

    public void bark() {
        System.out.println("미야옹");
    }
}

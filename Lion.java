public class Lion extends Animal implements Predator { 
    // implements로 인해 Predator의 객체에 포함된다.
    // 쉽게 Animal과 Predator에 물려놨다고 생각하자.
    
    public String getFood() {
        return "banana";
    }
}

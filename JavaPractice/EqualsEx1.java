class EqualsEx1 {
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        if (v1.equals(v2)) // 객체 두 개는 각각 다른 위치
            System.out.println("v1과 v2는 같습니다.");
        else 
            System.out.println("v1과 v2는 다릅니다.");

        v2 = v1; // 둘을 일치화 시켰으므로 

        if (v1.equals(v2)) // 같은 위치를 가리킴 
            System.out.println("v1과 v2는 같습니다.");
        else 
            System.out.println("v1과 v2는 다릅니다.");
    }
}

class Value {
    int value;

    Value(int value) {
        this.value = value;
    }
}

import java.util.HashMap;

public class map {
    public static void main(String[] args) {
    
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("people", "사람");
        map.put("baseball", "야구");
    
        System.out.println(map.get("people"));
    
    }
}

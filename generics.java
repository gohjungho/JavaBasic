import java.util.*;

public class generics {
  public static void main(String[] args) {

    ArrayList<String> aList = new ArrayList<String>();
    aList.add("hello");
    aList.add("java");

    String hello = aList.get(0);
    String java = aList.get(1);

  }
}


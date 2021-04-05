import java.util.*;

public class if_else {
    public static void main(String[] args) {
        // int money = 2000;
        // boolean hasCard = true;

        // if (money >= 3000 | hasCard) {
        //   System.out.println("택시를 타고 가라");
        // }
        // else {
        //   System.out.println("걸어가라");
        // }
        
        boolean hasCard = true;
        ArrayList<String> pocket = new ArrayList<String>();
        pocket.add("paper");
        pocket.add("handphone");
        // pocket.add("money");

        if (pocket.contains("money")) {
          System.out.println("택시를 타고 가라");
        }
        else if (hasCard) {
          System.out.println("택시를 타고 가라");
        }
        else {
          System.out.println("걸어가라");
        }
    }
}

/* 
|, || -> OR 
// 앞이 True인 경우 무조건 True 

| 둘다 전부 따져서 결과 도출 
|| 하나만 따져서 결과 도출 

True | False -> True 
True | True -> True // 1개 확인 
False || True -> True 
False || False -> Falue // 2개 확인 


&, && -> AND 
// 앞이 False인 경우 무조건 False 

& 둘다 전부 따져서 결과 도출 
&& 하나만 따져서 결과 도출 

False & False -> Falue // 1개 확인 
False & True -> Falue 
True && False -> Falue // 2개 확인 
True && True -> True 
*/
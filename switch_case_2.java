// switch/case 응용하기 

public class switch_case_2 {
    public static void main(String[] args) {
        int month = 8;
        String monthString = "";
        switch (month) {
          case 12:
          case 1: 
          case 2: monthString = "Winter";
            break;
          case 3: 
          case 4: 
          case 5: monthString = "Spring";
            break;
          case 6: 
          case 7: 
          case 8: monthString = "Summer";
            break;
          case 9: 
          case 10:
          case 11: monthString = "Fall";
            break;
          default: monthString = "Invalid month";
            break;
        }
        System.out.println(monthString);
    }
}

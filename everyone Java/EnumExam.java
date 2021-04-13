public class EnumExam {
    public static final String MALE="MALE";
    public static final String FEMALE="FEMALE";

    public static final void main(String[] args) {
        String gender1;
        gender1 = EnumExam.MALE;
        gender1 = EnumExam.FEMALE;
        // ‘gender1 = 클래스명 + 마침표 + 상수로 선언해놓은 MALE 혹은 FEMALE’.

        Gender gender2;
        gender2 = Gender.MALE;
        gender2 = Gender.FEMALE;
        // gender2 = "boy"; // type error! 
    }
}

// 열거형 - enum 열거형 이름 { 값1, 값2 }
enum Gender { 
    MALE, FEMALE;
}

public class StringBuffer_insert {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("jump to java");
        sb.insert(0,"Hello ");
        System.out.println(sb.toString());
    }
}

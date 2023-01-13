public class que56 {
    public static int printLength(String str) {
        if (str.length() == 0) {
            return 0;
        }
        return printLength(str.substring(1)) + 1;
    }
    public static void main(String[] args) {
        String str = "";
        System.out.println(printLength(str));
    }
}

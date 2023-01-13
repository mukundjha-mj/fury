public class que55 {
    static String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public static void printDigits(int n) {
        if (n == 0) {
            return;
        }
        int lastdigit = n % 10;
        printDigits(n / 10);
        System.out.println(digits[lastdigit] + " ");
    }
    public static void main(String[] args) {
        printDigits(2020);
    }
}

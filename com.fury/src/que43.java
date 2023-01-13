public class que43 {
    public static boolean checkPalindrom(String fruit) {
        int n = fruit.length();
        for(int i = 0; i < n / 2; i++){
            if (fruit.charAt(i) != fruit.charAt(n - i - 1)) {
                System.out.println("not  palindrom.");   
                return false;
            }
        }
        System.out.println("Yes this is palindrom");
        return true;
    }
    public static void main(String[] args) {
        String fruit =  "racecar";
        checkPalindrom(fruit);
        
    }
}

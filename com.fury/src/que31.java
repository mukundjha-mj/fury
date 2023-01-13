public class que31 {
    public static void maxSumKadans(int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Max Sum : " + ms);

    }

    public static void maxSumKadans2(int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                cs = cs + numbers[i];
                ms = Math.max(cs, ms);
            }
        }
        System.out.println("Max Sum : " + ms);

    }

    public static void main(String[] args) {
        int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int num[] = {-1, -2, -3, -4};
        maxSumKadans(numbers);
        maxSumKadans2(num);
    }
}

public class que30 {
    public static void maxSumPrifix(int numbers[]) {
        int currsum = 0;
        int maxSum = Integer.MIN_VALUE;

        int prefix[] = new int[numbers.length];
        for(int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i - 1] + numbers[i];
        }
        for(int i = 0; i < numbers.length; i++){
            int start = i;
            for(int j = i; j < numbers.length; j++){
                int end = j;
                currsum = start == 0 ? prefix[end] :  prefix[end] - prefix[start-1];
                if (maxSum < currsum) {
                    maxSum = currsum;
                }
            }
        }
        System.out.println("Maxsum : " + maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        maxSumPrifix(numbers);
    }
}

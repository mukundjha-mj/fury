public class que29 {
    public static void maxSubArraySum(int numbers[]) {
        int maxsum = Integer.MIN_VALUE;
        int minsum = Integer.MAX_VALUE;
        int currsum = 0;
        for(int i = 0; i < numbers.length; i++){
            int start = i;
            for(int j = i; j < numbers.length; j++){
                int last = j;
                currsum = 0;
                for(int k = start; k <= last; k++){
                    currsum += numbers[k];
                }
                if(maxsum < currsum){
                    maxsum = currsum;
                }
                if (minsum > currsum) {
                    minsum = currsum;
                }

            }
        }
        System.out.println(" Maximun sum by brute force aproch : " + maxsum);
        System.out.println(" Minimun sum by brute force aproch : " + minsum);
    }
    public static void maxSubArraySumBrut(int num[]) {
        int maxsum = Integer.MIN_VALUE;
        int minsum = Integer.MAX_VALUE;
        int currsum = 0;
        for(int i = 0; i < num.length; i++){
            int start = i;
            for(int j = i; j < num.length; j++){
                int last = j;
                currsum = 0;
                for(int k = start; k <= last; k++){
                    currsum += num[k];
                }
                if(maxsum < currsum){
                    maxsum = currsum;
                }
                if (minsum > currsum) {
                    minsum = currsum;
                }

            }
        }
        System.out.println(" Maximun sum : " + maxsum);
        System.out.println(" Minimun sum : " + minsum);
        
    }
    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        int num[] = {2, 4, 6, 8, 10};
        maxSubArraySum(numbers);
        maxSubArraySumBrut(num);
    }
}

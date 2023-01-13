public class que28 {
    public static void subArray(int numbers[]) {
        int tp = 0;
        for(int i = 0; i < numbers.length; i++){
            int start = i;
            for(int j = i; j < numbers.length; j++){
                int last = j;
                for(int k = start; k <= last; k++){
                    System.out.print(" " + numbers[k] + " ");
                }
                tp++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(" Number Of Total SubArray : " + tp);
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        System.out.print(" Orignal Array : ");
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println(" Pairs In An Array : ");
        subArray(numbers);

    }
}

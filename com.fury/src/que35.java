public class que35 {
    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    // First method
                    // int temp = arr[j];
                    // arr[j] = arr[j + 1];
                    // arr[j + 1] = temp;

                    // Second method
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];

                }
            }
        }

    }

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            // First method

            // int temp = arr[minPos];
            // arr[minPos] = arr[i];
            // arr[i] = temp;

            // Second method

            arr[minPos] = arr[minPos] + arr[i];
            arr[i] = arr[minPos] - arr[i];
            arr[minPos] = arr[minPos] - arr[i];
        }
    }
    public static void insertionSort(int arr[]) {
        for(int i = 0; i <= arr.length - 1; i++){
            int curr = arr[i];
            int prev = i - 1;
            //find
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int [largest + 1];
        for(int i = 0; i < arr.length; i++){
            count[arr[i]]++;
        }
        //sorting
        int j = 0; 
        for(int i = 0; i < count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        countingSort(arr);

        printArr(arr);

    }
}

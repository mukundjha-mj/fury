public class que36 {
    public static void selectionSort(int arr[]) {
        for(int i = 0; i < arr.length - 1; i++){
            int minPos = i;
            for(int j = i + 1; j < arr.length - 1; j++){
                if (arr[minPos] > arr[j]) {
                    arr[minPos] = j;
                }
            }
            arr[minPos] = arr[minPos] + arr[i];
            arr[i] = arr[minPos] - arr[i];
            arr[minPos] = arr[minPos] - arr[i];
        }
    }
    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1};
    }
}

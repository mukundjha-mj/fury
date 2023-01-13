public class que26 {
    public static void reverseArray(int numbers[]) {
        int first = 0, last = numbers.length - 1;
        while (first < last) {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first++;
            last--;
            
        }
    }
    public static void reverseArray2(int numbers[]) {
        int first = 0, last = numbers.length - 1; 
        while (first < last) {
            numbers[first] = numbers[first] + numbers[last];
            numbers[last] = numbers[first] - numbers[last];
            numbers[first] = numbers[first] - numbers[last];
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        System.out.print("Orignal Array : ");
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.print("Reverse Array : ");
        reverseArray2(numbers);

        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

    }
}

public class que53 {
    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }
    public static int facto(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm = facto(n - 1);
        return n * fnm;
    }
    public static int printSum(int n) {
        if (n == 1) {
            return 1;
        }
        int fnm = printSum(n - 1);
        return n + fnm;
    }
    public static int fabo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fibnm1 = fabo(n - 1);
        int fibnm2 = fabo(n - 2);
        return fibnm1 + fibnm2;
    }
    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]){
        return false;
        }
        return isSorted(arr, i + 1);
    }
    public static int firstOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurence(arr, key, i + 1);
    }
    public static int lastOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurence(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }
    public static int pow(int x, int n) {
        if(n == 0){
            return 1;
        }
        return x * pow(x, n - 1);
    }
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfpower = pow(x, n / 2);
        int halfpowersqer = halfpower *halfpower;
        if (n % 2 != 0) {
            halfpowersqer = x * halfpowersqer;
        }
        return halfpowersqer;
    }
    public static int tilingProlb(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return tilingProlb(n - 1) + tilingProlb(n - 2);
    }
    public static void removeDuplicate(String str, int idx, StringBuilder newstr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newstr);
            return;
        }
        char currchar = str.charAt(idx);
        if (map[currchar - 'a'] == true) {
            removeDuplicate(str, idx + 1, newstr, map);
        } else {
            map[currchar - 'a'] = true;
            removeDuplicate(str, idx + 1, newstr.append(currchar), map);
        }

    }
    public static int friendsPair(int n) {
        if(n == 1 || n == 2){
            return n;
        }
        return friendsPair(n - 1) + (n - 1) * friendsPair(n - 2);
    }
    public static void binaryString(int n, int lastpalce, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        binaryString(n - 1, 0, str+"0");
        if (lastpalce == 0) {
            binaryString(n - 1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        String str = "appnnacollege";
        // removeDuplicate(str, 0, new StringBuilder(""), new boolean [26]);
        // System.out.println(friendsPair(3));
        binaryString(3, 0, "");

    }
}

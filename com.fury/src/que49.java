public class que49 {
    public static boolean evenOrNot(int n ) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            return true;
        }
        return false;
    }
    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }
    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static int updateIthBit(int n, int i, int newbit) {
        if (newbit == 0) {
            return clearIthBit(n, i);
        } else {
            return setIthBit(n, i);
        }

    }
    public static int clearLastIthBit(int n , int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }
    public static int clearRangeOfBit(int n, int i, int j) {
        int a = (~0) << (j + 1);
        int b = (1<<i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }
    public static boolean powerOf2OrNot(int n) {
        if ((n&n-1) == 0) {
            return true;
        }
        return false;
    }
    public static int countSetBit(int n) {
        int count = 0;
        while (n > 0) {
            if ((n&1) != 0) {
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static int fastExponentiation(int n, int a) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a; 
            n = n >> 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(fastExponentiation(5, 3));
    }
}

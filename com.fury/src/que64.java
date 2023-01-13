public class que64 {
    public static int girdWay(int i, int j, int n, int m) {
        if (i == n - 1 && j == m - 1) {
            return 1;
        } else if (i == n || j == m){
            return 0;
        } 
        return girdWay(i + 1, j, n, m) + girdWay(i, j + 1, n, m);
    }
    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(girdWay(0, 0, n, m));
    }
}


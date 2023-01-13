// Trapped Rainwater
//     Given n non-negative integer representing an elevation mao where the width of each bar is 1, computer how much water it can trap after rain.

public class que32 {
    public static int traperWater(int height[]) {
        int n = height.length;
        // calculate left max boundary - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0]; 
        for(int i = 1; i < n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        // calculate right max boundary - array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1]; 
        for(int i = n - 2; i >= 0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        // loop
        // waterlevel = min of (maxleft, maxright)
        // trapped water += (waterlevel - height)
        int traperWater = 0;
        for(int i = 0; i < n; i++){
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            traperWater += waterlevel - height[i];
        }
        return traperWater;

    }
    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("Total Trapped Rainwater is : " + traperWater(height));
    }
}

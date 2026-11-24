
public class TrappedWater {

    public static int trappedWater(int[] height, int width) {
        int n = height.length;
        // Calculate the left side of max height using auxiliary array
        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }
        // Calculate the right side of max height using auxiliary array
        int[] rightMax = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        // Loop n times
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            // Calculate the waterLevel using min(rightMax[i], leftMax[i])
            int waterLevel = Math.min(rightMax[i], leftMax[i]);
            // Calculate the trapped water using (waterLevel - height[i]) * width
            trappedWater += (waterLevel - height[i]) * width;
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int[] height = {4,2,0,6,3,2,5};
        System.out.println(trappedWater(height, 1));
    }
}

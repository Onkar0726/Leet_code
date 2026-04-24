public class Container_With_Most_Water{
    public static int maxArea(int[] height) {
        int i =0;
        int j =0;
        int maxArea =0;
        for (i = 0; i < height.length; i++) {
            for (j = i + 1; j < height.length; j++) {
                int h;
                if (height[i] < height[j]) {
                    h = height[i];
                } else {
                    h = height[j];
                }
                int width = j - i;
                int area = h * width;
                if (area > maxArea) {
                    maxArea = area;
                }
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int result = maxArea(height);
        System.out.println("Max Area: " + result);
    }
}
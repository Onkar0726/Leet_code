import java.util.*;

public class threesum {

    public List<List<Integer>> threeSum(int[] nums) {

        int k = 0;
        int j = 0;
        int n = nums.length;

        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n - 2; i++) {

            // Skip duplicate values for i
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            j = i + 1;
            k = n - 1;

            while (j < k) {

                int sum = nums[i] + nums[j] + nums[k];

                if (sum == 0) {

                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    j++;
                    k--;

                    // Skip duplicate values for j
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }

                    // Skip duplicate values for k
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                }

                else if (sum < 0) {
                    j++;
                }

                else {
                    k--;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        threesum obj = new threesum();

        int nums[] = {1, 0, -1, 0, -2, 2};

        List<List<Integer>> result = obj.threeSum(nums);

        System.out.println(result);
    }
}
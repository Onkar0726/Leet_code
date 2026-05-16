import java.util.*;

public class foursum {

    public List<List<Integer>> fourSum(int[] nums, int target) {

        int n = nums.length;

        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i < n; i++) {

            for(int j = i + 1; j < n; j++) {

                int k = j + 1;
                int l = n - 1;

                while(k < l) {

                    long sum = (long)nums[i] + nums[j] + nums[k] + nums[l];

                    if(sum == target) {

                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);

                        if(ans.contains(temp) == false) {

                            ans.add(temp);
                        }

                        k++;
                        l--;
                    }

                    else if(sum < target) {

                        k++;
                    }

                    else {

                        l--;
                    }
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        foursum obj = new foursum();

        int nums[] = {1,0,-1,0,-2,2};

        List<List<Integer>> result = obj.fourSum(nums, 0);

        System.out.println(result);
    }
}
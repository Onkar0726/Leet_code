import java.util.*;
public class que442 {
        public List<Integer> findDuplicates(int[] nums) {
            List<Integer> var1 = new ArrayList<>();
            Arrays.sort(nums);
            int n=nums.length;
            for(int i=1 ;i<=n-1;i++){
                if(nums[i]==nums[i-1]){
                    var1.add(nums[i-1]);
                }

            }
            return var1;
        }
    public static void main(String[] args) {
        que442  s = new que442 ();
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(s.findDuplicates(nums));
    }
    }


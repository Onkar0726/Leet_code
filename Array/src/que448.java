import java.util.*;
public class que448 {
        public List<Integer> findDisappearedNumbers(int[] nums) {
            Arrays.sort(nums);
            List<Integer> var1 = new ArrayList<>();
            int var = 1;
            for (int i = 0; i < nums.length; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                if (nums[i] == var) {
                    var++;
                } else if (nums[i] != var) {
                    var1.add(var);
                    var++;
                    i--;
                }
            }
            while (var <= nums.length) {
                var1.add(var);
                var++;
            }
            return var1;
        }

        public static void main(String[] args) {
            que448  s = new que448 ();
            int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
            System.out.println(s.findDisappearedNumbers(nums));
        }
}

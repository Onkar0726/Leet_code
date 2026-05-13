public class search_insert_position {
    public int search_insert_position(int[] nums, int target) {
        if (target < nums[0]) {
            return 0;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == target) {
                return i;
            } else if (nums[i] < target && nums[i + 1] > target) {
                return i + 1;
            }
        }
        if(nums[nums.length - 1] == target){
            return nums.length - 1;
        }
        return nums.length;
    }

    public static void main(String[] args) {
        search_insert_position obj = new search_insert_position();
        int nums[] = {1};
        int result = obj.search_insert_position(nums,1);
        System.out.println(result);
    }
}

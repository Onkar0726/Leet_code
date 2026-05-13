public class remove_duplicate_element_from_sorted_array {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for(int i = 1; i < nums.length ; i++) {
            if(nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        remove_duplicate_element_from_sorted_array obj =
                new remove_duplicate_element_from_sorted_array();
        int nums[] = {1,1,2};
        int result = obj.removeDuplicates(nums);
        System.out.println(result);
        for(int i = 0; i < result; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
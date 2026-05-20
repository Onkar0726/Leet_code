import java.util.*;
public class SingleNumber {
        public int singleNumber(int[] nums) {
            Arrays.sort(nums);
            if(nums.length==1){
                return nums[0];
            }
            for(int i=0;i<nums.length-1;i++){
                if(nums[i]==nums[i+1]){
                    i++;
                }
                else {
                    return nums[i];
                }

            }
            return nums[nums.length-1];
        }
    public static void main(String[] args) {
        SingleNumber  sn = new SingleNumber ();
        int[] testnumbers = {1,5,3,4,4,1,3};
       int result = sn.singleNumber(testnumbers);
        System.out.println( result);
    }
    }


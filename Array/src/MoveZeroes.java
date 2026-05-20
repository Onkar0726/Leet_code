import java.util.*;
public class MoveZeroes {
        public void moveZeroes(int[] nums) {
            int j=0;
            int i=0;
            int temp=0;
            while(j<nums.length){
                if (nums[j] != 0) {
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    i++;
                }
                j++;

            }
            System.out.println(Arrays.toString(nums));
        }
    public static void main(String[] args) {
        MoveZeroes  mz = new MoveZeroes ();
        int[] testnumbers = {0,5,0,4,0,1,3};
        mz.moveZeroes(testnumbers);

    }
    }


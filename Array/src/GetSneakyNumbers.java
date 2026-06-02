import java.util.*;
public class GetSneakyNumbers {
        public int[] getSneakyNumbers(int[] nums) {
            int  var1[] = new int[2];
            Arrays.sort(nums);
            int n=nums.length;
            int k=0;
            for(int i=1 ;i<=n-1;i++){
                if(nums[i]==nums[i-1]){
                    var1[k]=nums[i-1];
                    k++;
                }

            }

            return var1;
        }
    public static void main(String[] args) {
        GetSneakyNumbers  s = new GetSneakyNumbers ();
        int[] nums = {0,1,0,1};
        System.out.println(Arrays.toString(s.getSneakyNumbers(nums)));
    }
    }

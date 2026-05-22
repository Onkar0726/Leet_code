public class containDuplicate219 {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            for(int i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length && (j - i) <= k;j++){
                    if(nums[i]==nums[j]){
                        return true;
                    }

                }
            }
            return false;
        }
    public static void main(String[] args) {
        containDuplicate219 cd = new containDuplicate219();
        int[] testNumbers = {1,2,3,1,2,3};
        boolean result = cd.containsNearbyDuplicate(testNumbers,2);
        System.out.println("contains duplicate " + result);
    }
    }


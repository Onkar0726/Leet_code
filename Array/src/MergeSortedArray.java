import java.util.*;
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0;i<=n-1;i++){
            nums1[m+i]=nums2[i];
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        MergeSortedArray ms =new MergeSortedArray();

        int m = 3;
        int n = 3;

        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {2,5,6};

        ms.merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));
    }
}
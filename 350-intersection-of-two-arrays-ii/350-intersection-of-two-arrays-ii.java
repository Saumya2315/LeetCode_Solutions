import java.util.*;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);        
        Arrays.sort(nums2);
        int i=0 , j=0 ;
        ArrayList<Integer> result = new ArrayList<Integer>();
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]>nums2[j]){
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                result.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] result1 = new int[result.size()];
        for (int k=0; k<result.size(); k++)
        {
            result1[k] = (Integer)result.get(k);
        }
        return result1;
    }
}
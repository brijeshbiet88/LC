 public int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
     
        for(int i = 0 ; i < nums.length ; i++){
            if(map.containsKey(target-nums[i])) {
            	result[0] = map.get(target-nums[i]);
            	result[1] = i;
            	return result;
            }
            else {
            	map.put(nums[i], i);
            }
        }
		return result;
    }

/*
Similar Problems


package com.twoointers;

import java.util.HashSet;
import java.util.Set;

public class TwoSum {
    public static void main(String[] args) {
        int [] a = {1,2,4,5,6,7,8};
        int target = 10;
        findPairs(a,target);
        findPairsInSorted(a,target);
    }

    
      
    private static void findPairsInSorted(int[] a, int target) {
        int i = 0;
        int j = a.length -1 ;
        while(i < j ){
         int sum = a[i] + a[j];
         if(sum == target){
             System.out.println(a[i]+","+a[j]);
             i++;
             j--;
         }else if(sum < target){
             i++;
         }else {
             j--;
         }
        }
    }


    

    private static void findPairs(int[] a, int target) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0 ; i < a.length ; i++){
            int comp = target - a[i];
            if(set.contains(comp)){
                System.out.println(a[i]+","+comp);
                break;
            }else {
                set.add(a[i]);
            }
        }
    }
}

*/

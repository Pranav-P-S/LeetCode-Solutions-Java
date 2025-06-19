// LeetCode Problem: FindAllNumbersDisappearedInArray 448
// Solution by: @Pranav-P-S

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set =new HashSet<>();
        int count=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:nums){
            set.add(i);
            count++;
        }
        for (int i=1;i<=count;i++) {
                if (!(set.contains(i))) {
                    list.add(i);
                }
                
        }     
        return list;
    }
}

//constant space solution 
/* 
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            int idx = Math.abs(nums[i]) - 1;
            nums[idx] = - Math.abs(nums[idx]);
        }
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) res.add(i+1);
        }
        return res;
    }
}
    
*/
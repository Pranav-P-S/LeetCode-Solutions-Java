// LeetCode Problem: ClimbingStairs 70
// Solution by: @Pranav-P-S

class Solution {
    public int climbStairs(int n) {
        if (n<3) return n;
        int[] mem=new int[n+1];
        mem[0]=0;
        mem[1]=1;
        mem[2]=2;
        for(int i=3;i<n+1;i++){
            mem[i]=mem[i-1]+mem[i-2];
        }
        return mem[n];
    }
}

// LeetCode Problem: TimeNeededToBuyTickets 2073
// Solution by: @Pranav-P-S

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int count=0;
        int point=0;
        int length=tickets.length;
        while(tickets[k]>0){
            point=point%length;
            while(tickets[point]==0){
                point++;
                point=point%length;
            }
            tickets[point]--;
            count++;
            point++;
        }
        return count;
    }
}

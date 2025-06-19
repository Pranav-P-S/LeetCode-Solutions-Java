// LeetCode Problem: MinimumTimeVisitingAllPoints 1266
// Solution by: @Pranav-P-S

class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int length=points.length;
        int time=0;
        int x=points[0][0];
        int y=points[0][1];
        for (int i=1;i<length;i++){
            time+=Math.max(Math.abs(x-points[i][0]),Math.abs(y-points[i][1]));
            x=points[i][0];
            y=points[i][1];
        }
        return time;
    }
}

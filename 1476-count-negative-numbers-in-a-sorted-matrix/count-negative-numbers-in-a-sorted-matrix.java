class Solution {
    public int countNegatives(int[][] grid) {
        int max_count =0;
        int n = grid.length;
        int i =0;
        int j = 0;
        int m = grid[i].length;
      for( i = 0; i<n; i++){
        for(j=0; j<m; j++){
            if(grid[i][j] <0){
                max_count++;
            }
        }
      }
      return max_count;
    }
}
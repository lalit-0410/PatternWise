package DP_2;

public class UniquePath2Tabulation {

    static int solve(int[][] grid) {

        int row = grid.length;
        int col = grid[0].length;

        int[][] dp = new int[row][col];

        if(grid[row-1][col-1]==1)
            return 0;

        dp[row-1][col-1]=1;

        for(int i=row-1;i>=0;i--){

            for(int j=col-1;j>=0;j--){

                if(i==row-1 && j==col-1)
                    continue;

                if(grid[i][j]==1){
                    dp[i][j]=0;
                    continue;
                }

                int down=0;
                int right=0;

                if(i+1<row)
                    down=dp[i+1][j];

                if(j+1<col)
                    right=dp[i][j+1];

                dp[i][j]=down+right;
            }
        }

        return dp[0][0];
    }

    public static void main(String[] args) {

        int[][] grid={
                {0,0,0},
                {0,1,0},
                {0,0,0}
        };

        System.out.println(solve(grid));
    }
}

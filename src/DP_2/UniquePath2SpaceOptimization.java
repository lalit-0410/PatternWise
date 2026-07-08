package DP_2;

public class UniquePath2SpaceOptimization {

    public static int solve(int[][] grid){

        int row = grid.length;
        int col = grid[0].length;

        if(grid[row-1][col-1]==1)
            return 0;

        int[] next = new int[col];

        for(int i=row-1;i>=0;i--){

            int[] curr=new int[col];

            for(int j=col-1;j>=0;j--){

                if(i==row-1 && j==col-1){
                    curr[j]=1;
                    continue;
                }

                if(grid[i][j]==1){
                    curr[j]=0;
                    continue;
                }

                int down=0;
                int right=0;

                if(i+1<row)
                    down=next[j];

                if(j+1<col)
                    right=curr[j+1];

                curr[j]=down+right;
            }

            next=curr;
        }

        return next[0];
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

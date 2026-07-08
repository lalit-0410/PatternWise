package DP_2;

public class UniquePath2Recursion {


        public static int solve(int i, int j, int[][] grid) {

            int m = grid.length;
            int n = grid[0].length;

            if (i >= m || j >= n)
                return 0;

            if (grid[i][j] == 1)
                return 0;

            if (i == m - 1 && j == n - 1)
                return 1;

            int down = solve(i + 1, j, grid);
            int right = solve(i, j + 1, grid);

            return down + right;
        }

        public static void main(String[] args) {

            int[][] grid = {
                    {0,0,0},
                    {0,1,0},
                    {0,0,0}
            };

            System.out.println(solve(0,0,grid));
        }
    }


package org.example.problem;

// https://leetcode.com/problems/island-perimeter/description/
public class Problem463 {
    public Problem463() {
        int[][] grid = new int[][]{{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
        System.out.println(islandPerimeter(grid) == 16);

        grid = new int[][]{{1}};
        System.out.println(islandPerimeter(grid) == 4);

        grid = new int[][]{{1, 0}};
        System.out.println(islandPerimeter(grid) == 4);
    }

    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    perimeter += 4;

                    if (i > 0 && grid[i - 1][j] == 1)
                        perimeter -= 2;

                    if (j > 0 && grid[i][j - 1] == 1)
                        perimeter -= 2;
                }
            }
        }

        return perimeter;
    }
}

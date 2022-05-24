package com.hackerrank.solutions;

public class RatMaze {

	public static void main(String[] args) {
		int maze[][] = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 0, 1, 0, 0 }, { 1, 1, 1, 1 } };

		solveRM(maze, 4);
	}

	static boolean solveRM(int[][] maze, int N) {

		int sol[][] = new int[N][N];

		if (!solveRMUtil(maze, 0, 0, sol, N)) {
			System.out.println("Solution does not exist");
			return false;
		}
		printsolution(sol);
		return true;
	}

	private static void printsolution(int[][] sol) {

		for (int i = 0; i < sol.length; i++) {
			for (int j = 0; j < sol.length; j++) {
				System.out.print(sol[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static boolean solveRMUtil(int[][] maze, int x, int y, int[][] sol, int N) {

		if (x == N - 1 && y == N - 1 && maze[x][y] == 1) {
			sol[x][y] = 1;
			return true;
		}

		if (isSafeMove(maze, x, y, N)) {
			if (sol[x][y] == 1)
				return false;
			
			sol[x][y] = 1;
			
			if (solveRMUtil(maze, x + 1, y, sol, N))
                return true;
 
            if (solveRMUtil(maze, x, y + 1, sol, N))
                return true;
           
            if (solveRMUtil(maze, x - 1, y, sol, N))
                return true;
 
            if (solveRMUtil(maze, x, y - 1, sol, N))
                return true;
            
            sol[x][y] = 0;
            return false;
		}
		
		
        return false;
	}

	private static boolean isSafeMove(int[][] maze, int x, int y, int N) {
		return (x >= 0 && x < N && y >= 0 && y < N && maze[x][y] == 1);
	}

}

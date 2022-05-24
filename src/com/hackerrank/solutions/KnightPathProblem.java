package com.hackerrank.solutions;

public class KnightPathProblem {

	public static void main(String[] args) {
		solveKT();
	}

	private static boolean solveKT() {

		int sol[][] = new int[8][8];

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				sol[i][j] = -1;
			}
		}

		sol[0][0] = 0;

		int row[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
		int col[] = { 1, 2, 2, 1, -1, -2, -2, -1 };

		if (!solveKTUtil(0, 0, 1, sol, row, col)) {
			System.out.println("Solution does not exist");
			return false;
		} else
			printSolution(sol);

		return true;

	}

	private static boolean solveKTUtil(int x, int y, int move, int[][] sol, int[] xmove, int[] ymove) {
		
		if(move == 64)
			return true;
		
		for(int k = 0; k < 8; k++) {
			int nextx = xmove[k] + x;
			int nexty = ymove[k] + y;
			
			if(isSafeMove(nextx, nexty, sol)) {
				sol[nextx][nexty] = move;
				
				if(solveKTUtil(nextx, nexty, move + 1, sol, xmove, ymove))
					return true;
				else
					sol[nextx][nexty] = -1;
			}
		}
		return false;
	}

	private static boolean isSafeMove(int x, int y, int sol[][]) {
		return (x >= 0 && x < 8 && y >= 0 && y < 8 && sol[x][y] == -1);
	}

	private static void printSolution(int[][] sol) {
		for (int x = 0; x < 8; x++) {
			for (int y = 0; y < 8; y++)
				System.out.print(sol[x][y] + " ");
			System.out.println();
		}

	}

}

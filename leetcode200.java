//Leetcode 다시 풀어봄 #200 Number of Island

import java.util.Scanner;

public class hyello {
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		int [][] arr = new int[n][m];
		
		for (int i = 0; i<n; i++)
		{
			for (int j = 0; j<m; j++)
			{
				arr[i][j] = input.nextInt();
			}
		}
		
		int count = 0; 
		for (int i = 0; i<n; i++)
		{
			for (int j = 0; j<m; j++)
			{
				if(arr[i][j] == 1)
				{
					count++;
					dfs(arr,i,j,n,m);
				}
			}
		}
		System.out.println(count);
	}
	public static void dfs(int[][] arr, int currI, int currJ, int n, int m)
	{
		//바운데리
		if( currI < 0 || currI >= n || currJ < 0 || currJ >=m || arr[currI][currJ] != 1) // if조건문 순서가 중요하다 명심할것
		{
			return;
		}
		
		arr[currI][currJ] = 2;
		dfs(arr,currI+1,currJ,n,m); // down
		dfs(arr,currI-1,currJ,n,m); // up
		dfs(arr,currI,currJ+1,n,m); //right
		dfs(arr,currI,currJ-1,n,m); //left
	}

}

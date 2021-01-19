

public class Main
{
		static int max(int a, int b){
		    return a > b ? a : b;
		}
		
		static int knapsack(int w, int wt[], int val[], int n){
		   int dp[][] = new int[n + 1][w + 1];
		   int i = 0;
		   int j = 0;
		   
		   for(i = 0; i <= n ; i++){
		       for(j = 0; j <= w; j++){
		           if(i==0 || w == 0)
		                dp[i][j] = 0;
		            else if(j >= wt[i - 1])
		                dp[i][j] = max( val[i - 1] + dp[i - 1][j - wt[i - 1]], dp[i - 1][j] );
		            else 
		            dp[i][j] = dp[i - 1][w];
		       }
		   }
		   return dp[n][w]; 
		}
		
	public static void main(String[] args) {
		int val[] = new int[] { 60,100,120 };
		int wt[] = new int[] {10,20,30};
		int w = 50;
		int n = val.length;
		System.out.println(knapsack(w,wt,val,n));
	}
}

import java.util.*;
class WaystoDeliver
{
    public static void main(String []args)
    {



        Scanner in=new Scanner(System.in);
        int start_x,start_y,end_x,end_y;
        start_x=in.nextInt();
        start_y=in.nextInt();
        end_x=in.nextInt();
        end_y=in.nextInt();
        int dp[][]=new int[end_x+2][end_y+2];
        dp[start_x+1][start_y+1]=1;
        for(int i=start_x+1;i<=end_x+1;i++)
        {
            for(int j=start_y+1;j<=end_y+1;j++)
            {
                if(i==start_x+1 && j==start_y+1)
                {
                    continue;
                }
                dp[i][j]=(dp[i-1][j]+dp[i][j-1])%10000007;
            }
        }
        if(dp[end_x+1][end_y+1]==0)
        {
            System.out.println(-1);
        }
        else
        {
            System.out.println(dp[end_x+1][end_y+1]);
        }
        for(int []ar:dp)
        {
            for(int i:ar)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}



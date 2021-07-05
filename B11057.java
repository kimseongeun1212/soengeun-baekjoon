import java.util.*;

public class B11057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //입력N
        int mod = 10007;
        int[][] A = new int[n][10];
        for (int i=0;i<10;i++)
            A[0][i] = 1; // 0
        for (int i=1;i<n;i++) { //행
            for (int j=0;j<10;j++) {
                for (int l=0;l<=j;l++) {
                    A[i][j] += A[i-1][j-l];
                    A[i][j] %= mod;
                }
            }
        }
        int temp = A[n-1][0];
        for (int i=1;i<10;i++) {
            temp += A[n-1][i];
            temp %= mod;
        }
        System.out.println(temp);
    }
}

/*
import java.util.Scanner;
public class B11057 {
    private static int N;
    private static int[][] dp = new int[1001][11];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        for(int i = 0; i < 10; i++) {
            dp[1][i] = 1;
        }

        for(int i = 2; i <= N; i++) {
            for (int j = 0; j < 10; j++) {
                 for(int k = 0; k <= j; k++) {
                    dp[i][j] += dp[i-1][k];
                    dp[i][j] %= 10007;
             }
                System.out.println(dp[i][j]);
            }
         }

        int tot = 0;
        for(int i = 0; i < 10; i++) {
            tot += dp[N][i];
        }
        System.out.println(tot%10007);
    }
    }
}*/
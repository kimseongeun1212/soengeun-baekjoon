import java.util.Scanner;

public class B10870 {
    static int[] memo=new int[45];;

    static int fibonacci_memo(int num){
            if (num <= 1) {
                return memo[num];
            }
            else {
                if (memo[num] == -1) {
                    memo[num] = fibonacci_memo(num - 1) + fibonacci_memo(num - 2);
                }
                return memo[num];
            }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();

        for (int i = 0; i < 45; i++) {
            memo[i] = -1;
        }
        memo[0] = 0;
        memo[1] = 1;
        System.out.println(fibonacci_memo(input));
    }

}

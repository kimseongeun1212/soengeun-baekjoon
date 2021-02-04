import java.util.Scanner;

public class baekjoon10809 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] alpha=new int[26];
        String S=sc.nextLine();


        for(int i=0; i<alpha.length; i++){
            alpha[i]=-1;
        }

        for(int i=0; i<S.length(); i++) {
            char ch = S.charAt(i);
            if (alpha[ch - 'a'] == -1) {
                alpha[ch - 'a'] = i;
            }
        }

            for(int i=0; i<alpha.length; i++){
                System.out.print(alpha[i] + " ");
            }
    }
}

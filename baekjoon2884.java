import java.util.Scanner;

public class baekjoon2884 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H=sc.nextInt();
        int M= sc.nextInt();
        if(M>=45){
            M=M-45;
        }else{
            H-=1;
            M = (M + 60) - 45;
        }

        if(H<0)
            H += 24;

        System.out.printf("%d %d\n", H,M);

    }
}

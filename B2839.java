import java.util.Scanner;

public class B2839 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int sum=0;

        while(true){
            if(N%5==0){
                sum+=N/5;
                System.out.println(sum);
                break;
            }else{
                N-=3; //5가 될때까지
                sum++;
            }

            if(N<0){
                System.out.printf("-1");
                break;
            }
        }
        sc.close();
    }
}

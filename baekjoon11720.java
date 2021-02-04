import java.util.Scanner;

public class baekjoon11720 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String num1=sc.next();
        int sum=0;
        for(int i=0; i<num; i++){
            sum += num1.charAt(i)-'0';
        }
        System.out.println(sum);
    }
}

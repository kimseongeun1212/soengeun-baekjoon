import java.util.Scanner;

public class baekjoon1330 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();

        if(A>B){
            System.out.println(">");
        }else{
            String num=A<B?"<":"==";
            System.out.println(num);
        }
        sc.close();

/*        if(A>B){
            System.out.println(">");
        }else if(A<B){
            System.out.println("<");
        }else if(A==B){
            System.out.println("==");
        }
        sc.close();*/
    }
}

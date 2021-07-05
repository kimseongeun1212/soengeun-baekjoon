import java.io.*;
import java.util.Scanner;

public class B1003 {


    public static void main(String[] args) throws IOException {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter sw=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(sc.readLine());
        int num;
        Integer[] num0=new Integer[41];
        Integer[] num1=new Integer[41];
        num0[0]=1; num0[1]=0;
        num1[0]=0; num1[1]=1;

        for(int i=0; i<n; i++) {
            num = Integer.parseInt(sc.readLine());
            for(int j=2; j<=num; j++) {
                num0[j] = num0[j-2] + num0[j-1];
                num1[j] = num1[j-2] + num1[j-1];
            }
            sw.write(num0[num]+ " " +num1[num]+"\n");
        }

        sw.close();
        sc.close();

    }
}


/** 시간 초과난 코드.. 하지만 인텔리에서는 돌아간..
 * public class Main {
 *     static int[] num0=new int[41];
 *     static int[] num1=new int[41];
 *     static int k=0;
 *
 *     static void fibonacci(int n){
 *         if(n==0){
 *             num0[k]++;
 *             return;
 *         } else if(n==1){
 *             num1[k]++;
 *             return;
 *         }else{
 *             fibonacci(n-1);
 *             fibonacci(n-2);
 *         }
 *     }
 *
 *     public static void main(String[] args) {
 *         Scanner sc=new Scanner(System.in);
 *         int n=sc.nextInt();
 *         int num;
 *
 *         for(int i=0; i<n; i++) {
 *             num=sc.nextInt();
 *
 *             fibonacci(num);
 *             System.out.println(num0[i] + " " + num1[i]);
 *             k++;
 *         }
 *     }
 * }
 *
 * **/
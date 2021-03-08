import java.util.Scanner;

public class baekjoon9498 {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        if(0<=num && 100>=num) {
            if (100 >= num && 90 <= num) {
                System.out.println("A");
            } else if (89 >= num && 80 <= num) {
                System.out.println("B");
            } else if (79 >= num && 70 <= num) {
                System.out.println("C");
            } else if (69 >= num && 60 <= num) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        }

        sc.close();
    }
}

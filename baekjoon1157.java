import java.util.Scanner;

public class baekjoon1157 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String alpha=sc.nextLine().toUpperCase(); //입력된 소문자가 있다면 대문자로 바꿔줌
        int MAX=0;
        char answer = '?';
        int[] num=new int[26];

        for(int i=0; i<alpha.length();i++){
            num[alpha.charAt(i)-65]++; //A는 0 B는 1 ... 순서대로 들갈수있게 'A'를 빼줌
            if (MAX < num[alpha.charAt(i) - 65]) {
                MAX = num[alpha.charAt(i) - 65];
                answer = alpha.charAt(i);
            } else if (MAX == num[alpha.charAt(i) - 65]) {
                answer = '?';
            }
        }
        System.out.println(answer);
    }
}

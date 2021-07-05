import java.util.*;
import static java.lang.Math.abs;

public class Bhansu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int suu = 0;

        for (int i = 1; i <= num; i++) { //150 100
            int tmp = i;
            int count = 1;
            while (tmp%10==0)
                count++; //
            if (count == 3) { //세자리수
                int tmp2 = i;
                int z = tmp2 % 10;
                int y = (tmp2 / 10) % 10;
                int x = tmp2 / 100;
                if (Math.abs(y - x) == Math.abs(y - z)) {
                    suu++;
                    if ((x == z && (x != y || z != y)))
                        suu--;
                }
            }
            else if (count == 1 || count == 2)
                suu++;
        }
        System.out.println(suu);
    }
}

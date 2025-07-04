package Pattern;

import java.util.Scanner;

public class zero_one_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=1;i<=a;i++){
            int start = (i%2==0) ? 1: 0;
            for(int j=1;j<=i;j++){
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();

        }
    }
}

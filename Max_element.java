import java.util.Scanner;

public class Max_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int ans = Math.max(a,b);
        int fa = Math.max(ans,c);
        System.out.println(fa);
    }
}

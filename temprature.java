import java.util.Scanner;

public class temprature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a<15 || b<15 || c<15){
            System.out.println("temp is cold");
        }
        if(a>15 && a<30 || b>15 && b<30 || c>15 && c<30){
            System.out.println("temp is warm");
        }
        if(a>40 || b>40 || c>40){
            System.out.println("temp is hot");
        }
    }
}

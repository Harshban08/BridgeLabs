import java.util.*;
class Main1{
	public static void main(String [] args){
	Scanner sc= new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	
	int largest = Math.max(a,Math.max(b,c));
	
	System.out.println("largest number is"+largest);
	}
}
		

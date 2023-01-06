import java.util.Scanner;
public class Ex4 {

    public static void main (String[] args) {
    	int first,second;
    	Scanner A=new Scanner(System.in);
    	System.out.print("Enter first number = ");
    	first=A.nextInt();
    	System.out.print("Enter second number = ");
    	second = A.nextInt();
    	int sum= first+second;
    	int div= first-second;
    	System.out.println("Sum="+sum);
    	System.out.println("Division="+div);
    	
    }
    
}
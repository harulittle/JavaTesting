import java.util.Scanner;
public class java2 {

   public static void main (String[] args) {
   	Scanner scan=new Scanner(System.in);
   	System.out.println ("Enter Your Mark");
   	int mark=scan.nextInt();
   	if(mark>=40 && mark<=100)
   	{
   		System.out.println ("Pass");
   	}
   	else
   		System.out.println ("Fail");
   		
   		
}
}
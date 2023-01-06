import java.util.Scanner;
public class java1 {

  public static void main (String[] args) {
  	int mark;
  	Scanner scan=new Scanner(System.in);
  	System.out.print ("Enter Your Mark");
  	mark=scan.nextInt();
  	if(mark>=40)
  		System.out.println ("Pass");
}
}
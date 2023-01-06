import java.util.Scanner;
public class Ex8 {
	public static void main (String[] args) {
		int length,width,area;
		Scanner A= new Scanner(System.in);
		System.out.print ("length=");
		length=A.nextInt();
		System.out.print ("Width=");
		width=A.nextInt();
		area=length*width;
		System.out.println ("Area = " +area+"meter square");
    }

    
    
}
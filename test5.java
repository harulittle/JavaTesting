import java.util.Scanner;
 public class Cha3 {
    
    public static void main(String[] args) {
    	int marks;
    	Scanner A= new Scanner(System.in);
    	System.out.print("Enter Your Marks = ");
    	marks=A.nextInt();
    	if(marks>=80 && marks<=100)
    	{System.out.println ("Distinction" );
    	}
        else if (marks>=65 && marks<80)
        {System.out.println ("Pass with Credit");
        }
        else if (marks>=40 && marks<65)
        {System.out.println ("Pass");
        }
        else
        {System.out.println ("Fail");
        }
    }
}
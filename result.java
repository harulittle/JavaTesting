import java.util.Scanner;
public class Ex1 {

 public static void main (String[] args) 
 	{int marks;
 	System.out.println ("Please enter your marks");
 	Scanner A=new Scanner(System.in);
 	marks=A.nextInt();
 	String result;
 	if (marks>=80&&marks<=100)
 	{	result="Distinction";}
 	else if(marks>=65&&marks<80)
 	{result="Pass with credit";
 	}
 	else if(marks>=40&&marks<65)
 	{result="Pass";}
 	else
 	{result="Fail";}
 	System.out.println (result);
}
    
}
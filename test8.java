public class Ex1 {

   public static void main (String[] args) {
   	int[]A={70,35,100,40,80,90,50,70,45,28};
   	
   	System.out.println ("Data");
    Array(A);
    System.out.println ("Total value=" +Sum(A));
    Average(A);	
   }
   public static void Array(int[]A)
   {for(int i=0;i<A.length;i++)
   	System.out.println ("A["+i+"]="+A[i]);
   		
   }
   public static int Sum(int[]A)
   {int sum=0;
   for(int x:A)
   {sum+=x;
   }
   return sum;
   }
   public static void Average(int []A)
   {int Avg;
   Avg=Sum(A)/A.length;
   System.out.println ("Average=" +Avg);
   }
   public static void searchno(int[]A)
   
   
    
}
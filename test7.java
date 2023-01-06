public class Eg4 {

   public static void main (String[] args) {
   	int[]A={1,2,3,4,5};
   	System.out.println ("Before Calling");display(A);
   	Updatemethod(A);
   	System.out.println ("After calling");display(A);
   	
   }
   public static void Updatemethod(int[]B)
   {for(int i=0;i<B.length;i++)
   	B[i]=B[i]+10;
   }
   public static void display(int[]A)
   {for(int i=0;i<A.length;i++)
   	System.out.println ("A["+i+"]="+A[i]);
   }
    
}
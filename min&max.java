public class Ex6 {

   public static void main (String[] args) {
   	int average=0;
   	int max=0; int min=0;
   	int[]A={9,8,3,1,4};
   	int sum=0;
   	
   	max=A[0];  min =A[0];
 	for( int b=0;b<5;b++)	 	
 	{sum+=A[b];
 average	=sum/A.length;
 		
 	if (max<A[b] )
 	 max=A[b];
 	else if( min>A[b] )
 		min=A[b];
 	
 	}	System.out.println ("Average="+ average); 
 		System.out.println ("Summation of five integers="+sum);
 	System.out.println ("Max is " + max);
 	System.out.println ("Min is " +min);
}
    
    
}
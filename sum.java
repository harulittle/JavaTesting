public class example3 {
public static void main (String[] args) {
	int sum=0;
	int nums[]={1,2,3,4,5,6,7,8,9,10};
	for(int x: nums)
	{
		sum+=x;
	}
	System.out.println ("Summation of 10 elements " + sum);
}
    
}
public class Array {
    
    public static void main(String[] args) {
       int a[]={2,4,6,8,10};
       int b[]=new int[5];
       int i;
       for(i=0;i<5;i++)
       {System.out.println ("a["+i+"]"+a[i]+"\t");
       }
       System.out.println ();
       b=a;
       for(i=0;i<5;i++)
       {b[i]=a[i]*2;
       System.out.println ("b["+i+"]"+b[i]+"\t");
       }
       
       
       
    }
}
public class j3 {

   public static void main (String[] args)throws Exception {
   	System.out.println ("Enter Sex");
   	char sex=(char)System.in.read();
   	switch(sex)
   	{
   		case 'M':
   		case'm':System.out.println ("You are Male");break;
   		case 'F':
   			case 'f':System.out.println ("You are Female");break;
   			default:
   				System.out.println ("Wrong Sex");
   		
   	}
}
    
}
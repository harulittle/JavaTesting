public class Ex3 {

    public static void main (String[] args) 
    	{
    
    	int cost=0;
    	int extraunit=0;
    	int unit=300;
    	if (unit<=500)
    	{cost=(unit*2)+5;
    	}
    	else if (unit>500 && unit<=1000)
    	{if (unit>500)
    		extraunit=(unit-500);
    		cost=(500*4)+(extraunit-2);
    	}
    	System.out.println (cost);
}
    
}
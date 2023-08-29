public class hightolow
{
	public static void main(String[] args)
	{
	   int a=3045,b=20,c=1000;
	   if(a>b && a>c && b>c)
	   {
	       System.out.println(a+ " "+b+" "+c);
	   }
	   else 
	   if(a>c && a>b && c>b)
	   {
	       System.out.println(a+ " "+c+" "+b); 
	   }
	   if(b>c && b>a && c>a)
	   {
	       System.out.println(b+ " "+c+" "+a);
	   }
	   else 
	   if(b>c && b>a && a>c)
	   {
	       System.out.println(b+ " "+a+" "+c);	 
	   }
	   if(c>a && c>b && a>b)
	   {
	       System.out.println(c+ " "+a+" "+b);	  
	   }
	   else
	   if(c>a && c>b && b>a)
	   {
	       System.out.println(c+ " "+b+" "+a);	  
	   }
	   
	   
	}
}
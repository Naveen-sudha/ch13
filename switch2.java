class switch2
{
	public static void main(String args[])
	{
	 int x=101;
	 char ch='b';
	 switch(2)
	    {
	     case 1:if (x%2==0)
	             {
	                System.out.println("even");
	             }
	             else
	                System.out.println("odd");
	             break;
         case 2:if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                {
                    System.out.println("vowel");
                }
                else
                    System.out.println("consonent");
                
	    }
	 }
}
class ifswap
{
	public static void main (String args[])
	{
		int a=225,b=5;
		if(a%b>=0)
		{
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println(a +" "+ b);
		}
		else
		{
			System.out.println(a +" "+b);
		}
	}
}
	
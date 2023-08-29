class cube
{
	public static void main (String args[])
	{
	int a=92;
	double b=Math.cbrt(a);
	if(a%b==0)
	{
		System.out.println(a +" is a perfect cube");
	}
	else
	{
		System.out.println(a +" is not a perfect cube");
	}
	}
}
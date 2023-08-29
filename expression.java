class expression
{
	public static void main (String args[])
	{
	int b=30;
	int a=3;
	int c=5;
 	double d=Math.pow(b,2)-(4*a*c);
	double x= (-b+(Math.sqrt(d)))/(2*a);
	double y= (-b-(Math.sqrt(d)))/(2*a);
	System.out.println(x+" "+y);
	}
}

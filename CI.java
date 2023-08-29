class CI
{
	public static void main (String args[])
	{
		int p=20000;
		int r=6;
		int t=3;
		double a=p*(Math.pow(1+(r/100.0),t));
		double ci=a-p;
		int x,intrest;
		x=(int)a;
		intrest=(int)ci;
		System.out.println("final = "+x);
		System.out.println("intrest = "+intrest);
	}
}
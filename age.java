class  age
{
	public static void main (String args[])
	{
	int birthyear=2002;
	int presentyear=2023;
	int  age =presentyear-birthyear;
	int months=age*12;
	int totaldays = age*365;
	int hours=totaldays*24;
	long minutes=hours*60;
	long seconds=minutes*60;
	System.out.println("age = "+age);
	System.out.println("months = "+months);
	System.out.println("totaldays = "+totaldays);
	System.out.println("hours = "+hours);
	System.out.println("minutes = "+minutes);
	System.out.println("seconds="+seconds);
	}
}
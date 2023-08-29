class productifelse
{
	public static void main (String args[])
	{
		String Name="Orange";
		int price=55;
		int quantity=5;
		int total=price*quantity;
		double discount;
		System.out.println("Total = "+total);
	
	if(total>200) 
	{
		discount=(10.0/100*total);
	}
	else
	{
		discount=(5.0/100*total);
	}
		double Finalvalue=total-discount;
		System.out.println("Discount ="+discount);
		System.out.println("Final = "+Finalvalue);
	}
}


class acer
{
	public static void main (String[] args)
	{
		String productname="Acer Smart LED TV";
		double originalprice=39999;
		double discount=40/100.0*originalprice;
		double cost=originalprice-discount;
		double warrantyextend=1872;
		int packagingfee=100;
		int oldtvexchange=4500;
		double totalprice=cost+packagingfee-oldtvexchange+warrantyextend;
		double gst=18/100.0*totalprice;
		double finalcost=totalprice+gst;
		System.out.println("Product Name       =  "+productname);
		System.out.println("Original Price        =  "+originalprice);
		System.out.println("Discount                =  "+discount);
		System.out.println("Cost                       =  "+cost);
		System.out.println("Warrantyextend     =  "+warrantyextend);
		System.out.println("Packaging Fee       =  "+packagingfee);
		System.out.println("Old TV exchange  =  "+oldtvexchange);
		System.out.println("Total Price             =  "+totalprice);
		System.out.println("GST                       =  "+gst);
		System.out.println("Final Cost              =  "+finalcost);
	}
}

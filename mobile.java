class mobile
{
	public static void main (String args[])	
	{
		String mobile="APPLE iPhone 14 (Blue,128 GB)";
		int originalprice=79900;
		double discountprice=14/100.0*originalprice;
		int packagingfee=99;
		double cost=originalprice-discountprice+packagingfee;
		double cashback=5/100.0*cost;
		double totalcost=cost-cashback;
		double finalcost=totalcost-7000;
		double supercoins=2/100.0*finalcost;
		System.out.println("Mobile Name = "+mobile);
 		System.out.println("Original price = "+originalprice);
		System.out.println("Discount Price= "+discountprice);
		System.out.println("Packaging Fee = "+packagingfee);
		System.out.println("Total Cost = "+cost);
		System.out.println("Cash Back = "+cashback);
		System.out.println("Final Cost = "+finalcost);
		System.out.println("Super Coins = "+supercoins);
		}
}
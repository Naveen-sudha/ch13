class Dmart
{
	public static void main (String args[])
	{
	    System.out.println();
		System.out.println("                     DMART");
		System.out.println("             Avenue Supermarts LTD");
		System.out.println("              KPHB Kukutpally,HYD");
		System.out.println("---------------------------------------------");
		System.out.println("            GSTIN : 23SPDOFKHGKA8K2");
		System.out.println("            FSSAI NO.23948667199912");
		System.out.println("---------------------------------------------");
		System.out.println("  Bill No : 2939388344    Bill Dt:21/08/2023");
		System.out.println("  CUSTOMER : RAM          MOB : 89Q84938990");
		System.out.println("---------------------------------------------");
		
		int bags=2500;
		int soaps=150;
		int bottels=380;
		int almond=1140;
		int oven=6800;
		int rice=2400;
		int books=350;
		int diarymilk=450;
		int cups=330;
		
		System.out.println("  Particulars      Qty   N/Rate      Value");
		System.out.println("---------------------------------------------");
		System.out.println("  1.BAGS           4     625        "+bags);
		System.out.println("  2.SOAPS          3     50         "+soaps);
		System.out.println("  3.BOTTELS        4     95         "+bottels);
		System.out.println("  4.ALMOND         2     570        "+almond);
		System.out.println("  5.OVEN           1     6800       "+oven);
		System.out.println("  6.RICE           2     2400       "+rice);
		System.out.println("  7.BOOKS          7     350        "+books);
		System.out.println("  8.DIARY MILK     2     225        "+diarymilk);
		System.out.println("  9.CUPS           3     450        "+cups);
		System.out.println("---------------------------------------------");
		int total=bags+soaps+bottels+almond+oven+rice+books+diarymilk+cups;
        System.out.println("  ITEMS : 9                 TOTAL : "+total);
        System.out.println("---------------------------------------------");
        
        double discount=total/100*10;
        double cgst=total/100*4.5;
        System.out.print("  DISCOUNT : "+discount);
        System.out.println("         CGST : "+cgst);
        double amount=total-discount+cgst;
        System.out.println("  AMOUNT(Including All Taxes)    : "+amount);
        System.out.println("---------------------------------------------");
        System.out.println("                 Thank you");
        System.out.println("                Visit Again!");
        System.out.println(" This is computer generated invoice and hence ");
        System.out.println("         no signature is required");
        System.out.println("---------------------------------------------");
        System.out.println("                 *** *** ***                 ");
        
        
	}
}

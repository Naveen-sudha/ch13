class scholar
{
public static void main (String args[])
{
int s1=60,s2=90,s3=90,s4=80,s5=100;
int total=s1+s2+s3+s4+s5;
char section;
int scholarship,donation;
String destination;
double percentage=(total/500.0)*100;
double fee=85000;
if(percentage>80)
	{
		section='A';
		scholarship=10000;
		donation=0;
		destination="Certified";
	}
else
	{
		section='B';
		scholarship=0;
		donation=15000;
		destination="Failed";
	}
		double amount=fee-scholarship+donation;
		System.out.println("Percentage = "+percentage);
		System.out.println("Fee to be paid = "+amount);
		System.out.println("He belongs to "+section+" section and "+destination);
}
}
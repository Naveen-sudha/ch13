class steel
{
public static void main (String args[])
	{
	int hardness=10;
	double carbon_content=0.6;
	int tensile_strength=5800;

	if (hardness>50 && carbon_content<0.7 && tensile_strength>5600)
		System.out.println("Grade = "+10);
	else
	if(hardness>50 && carbon_content<0.7 )
		System.out.println("Grade = "+9);
	else
	if(carbon_content<0.7 && tensile_strength>5600)
		System.out.println("Grade = "+8);
	else
	if (hardness>50 && tensile_strength>5600)
		System.out.println("Grade = "+7);
	else
	if (hardness>50 || carbon_content<0.7 || tensile_strength>5600)
		System.out.println("Grade = "+6);
	else
		System.out.println("Grade = "+5);
	}
}
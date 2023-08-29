class cpsm
{
	public static void main(String[] args) 
	{
	    char ch ='o';
	    int ascii=(int)ch;
	    if(ascii>=65 && ascii<=90)
	        if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
	        {
		    System.out.println("CAPITAL VOWEL");
	        }
	        else
	        {
	        System.out.println("CAPITAL CONSONENT");
	        }
	   else 
	   if(ascii>=97 && ascii<=122)
	        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	        {
		    System.out.println("SMALL VOWEL");
	        }
	        else
	        {
	        System.out.println("SMALL CONSONENT");
	        }
	}  
}

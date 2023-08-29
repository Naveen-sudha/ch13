class swaping
{
	public static void main (String args[])
	{
		String box1="Apples";
		String box2="Oranges";
		System.out.println(box1+" "+box2);
		box1=box2.concat(box1);
		System.out.println(box1);
	}
}
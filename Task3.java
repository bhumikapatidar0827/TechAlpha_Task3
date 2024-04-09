class Task3
{
	public static void main(String ar[])
	{
		String x="00000123789";
		String y="";
		int a=0;
		System.out.println("String --> "+x);
		for(int i=0;i<x.length();i++)
		{
			char b=x.charAt(i);
			if(b!='0')
			{
				a=i;
				break;
			}
		}
		y=x.substring(a,x.length());
		System.out.println("After removing 0's --> "+y);
	}
}
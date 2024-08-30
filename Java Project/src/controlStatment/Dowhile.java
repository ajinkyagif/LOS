package controlStatment;

public class Dowhile {
public static void main(String []args)
{
	int i = 0;
	do
	{
		System.out.println(i);
		i = i+4;
	}
	while(i<=10);
	System.out.println();
	System.out.print("Value of i: "+i);
}
}

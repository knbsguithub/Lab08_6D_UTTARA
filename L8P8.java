/*8) Take an array as input to a method. Return the second biggest 
number as output from the method.*/

public class L8P8
{
	public static void main(String[] args)
	{
		int[] arr1 = {-10,-60,-45,-30,-60};
		System.out.println(L8P8.SecBiggest(arr1));
	}
	public static int SecBiggest(int[] arr1)
	{
		int Secmax=Integer.MIN_VALUE,max=Integer.MIN_VALUE;
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]>max)
			{
				Secmax=max;
				max=arr1[i];
			}
			else if(arr1[i]>Secmax && arr1[i]!=max)
				Secmax=arr1[i];
		}
		return Secmax;
	}
}
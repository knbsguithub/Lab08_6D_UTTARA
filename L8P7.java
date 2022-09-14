/*7) Code a method to accept 2 int arrays as parameter. It should return 
the biggest value amongst the 2 arrays.*/

public class L8P7
{
	public static void main(String[] args)
	{
		int[] arr1 = {-10,-20,-45};
		int[] arr2 = {15,95,35};
		L8P7.biggest(arr1,arr2);
	}
	public static void biggest(int[] arr1,int[] arr2)
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]>max)
				max=arr1[i];
		}
		System.out.println("The biggest number is :" + max);
		for(int i=0;i<arr2.length;i++)
		{
			if(arr2[i]>max)
				max=arr2[i];
		}
		System.out.println("The biggest number is :" + max);
	}
}
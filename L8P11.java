/*11) WAM to accept two double arrays. The method should return 
another array with the values added in the corresponding indices of the 
two input arrays (add the 0th element of both the arrays and store in the 
0th index of the output array)*/

public class L8P11
{
	public static void main(String[] args)
	{
		double[] arr1={10.11,20.14,30.74};
		double[] arr2={23.5,22.7,25.71};
		double[] sum=new double[arr1.length];
		for(int i=0;i<arr1.length;i++)
		{
			sum[i]=arr1[i]+arr2[i];
		}
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(sum[i]);
		}
	}
}
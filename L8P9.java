public class L8P9
{
	public static void main(String[] args)
	{
		int[] arr1 = {10,20,45};
		int[] arr2 = {15,95,35};
		L8P9.average(arr1,arr2);
	}
	public static void average(int[] arr1,int[] arr2)
	{
		int sum1=0;
		double avg=0;
		for(int val:arr1)
		{
			sum1=sum1+val;
		}
		for(int val:arr2)
		{
			sum1=sum1+val;
		}
		avg=(double)sum1/(arr1.length+arr2.length);
		System.out.println("THE AVERAGE OF TWO ARRAY:"+avg);
	}
}
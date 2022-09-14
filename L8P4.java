/*4) Create an int array with 10 literals in it. Loop over the array and add 
all the values to a long sum variable. Do this with for-each and normal 
for. Also do the same looping over the array from length-1 to 0 indices.*/

import java.util.*;
public class L8P4
{
	public static void main(String[] args)
	{
		int[] arr=new int[10];
		long sum1=0,sum2=0;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("arr["+i+"]:");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			sum1=sum1+arr[i];
		}
		System.out.println("USING FOR LOOP");
		System.out.println("THE SUM OF THE ARRAY IS:"+sum1);
		for(int val:arr)
		{
			sum2=sum2+val;
		}
		System.out.println("USING FOR EACH LOOP");
		System.out.println("THE SUM OF THE ARRAY IS:"+sum2);
	}
}
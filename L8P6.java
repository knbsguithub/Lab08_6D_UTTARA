/*6)Code an add() method that will add all the numbers given and return 
the result (use array of ints as param to the add() method). See 
AddArrayElements.java if you have a doubt.*/
import java.util.*;
public class L8P6
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the Size of the array:");
		n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter array numbers:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("arr["+i+"]:"+arr[i]);
			arr[i]=sc.nextInt();
		}
		System.out.println(L8P6.add(arr));
	}
	public static long add(int[] arr)
	{
		long sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		return sum;
	}
}
/*3) Create an array of ints with size 10. Insert 10 random integer values 
between 0-100 into it (using a for loop). Print out its value to the console 
using the length variable (in another for loop) and for-each loop.*/
import java.util.Random; 
public class L8P3
{
	public static void main(String[] args)
	{
		int[] arr=new int[10];
		Random ran = new Random();
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=ran.nextInt(100);
		}
		
		System.out.println("USING FOR EACH LOOP");
		for(int each:arr)
		{
			System.out.println(each);
		}
	}
}

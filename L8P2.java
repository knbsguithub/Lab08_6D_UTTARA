/*2) Create an array of ints with size 10. Insert 10-1 integer numbers into it 
(using a for loop). Print out its value to the console using the length 
variable (in another for loop) and for-each loop.*/

public class L8P2
{
	public static void main(String[] args)
	{
		int[] arr1 = new int[10];
		for(int i=0;i<10;i++)
		{
			arr1[i]=arr1.length-i;
		}
		
		System.out.println("USING FOR LOOP");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println("arr["+i+"]:"+arr1[i]);
		}
		
		System.out.println("USING FOR EACH LOOP");
		for(int each:arr1)
		{
			System.out.println(each);
		}
	}
}
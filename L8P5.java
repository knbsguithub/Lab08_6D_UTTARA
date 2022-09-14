/*5) Create a method called public static void test(int[] arr). Create literal 
array {10,20,30,40} in main(). Invoke test() and pass this literal array as 
parameter. Print out its value to the console using the length variable (in 
another for loop) and for-each loop in test().*/

public class L8P5
{
	public static void test(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("arr["+i+"]:"+arr[i]);
		}
		System.out.println();
		System.out.println("USING FOR EACH LOOP");
		for(int each:arr)
		{
			System.out.println(each);
		}
	}
	public static void main(String[] args)
	{
		int[] arr={10,20,30,40};
		L8P5.test(arr);
	}
}
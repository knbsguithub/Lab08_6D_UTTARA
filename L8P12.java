/*12) WAM to accept an array of ints and return the number of 
palindromes within it. Feel free to reuse the code/method written earlier 
to identify whether a number is a palindrome.*/

import java.util.*;
public class L8P12
{
	public static void main(String[] args)
	{
		int[] arr=new int[3];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("arr["+i+"]:");
			arr[i]=sc.nextInt();
		}
		isPalindrome(arr);
	}
	
	public static void isPalindrome(int[] arr)
	{
		int reversedNum = 0, remainder;
		int originalNum = 0,count=0;
		for(int i=0;i<arr.length;i++)
		{
			originalNum = arr[i];
			while (arr[i] != 0) 
			{
			  remainder = arr[i] % 10;
			  reversedNum = reversedNum * 10 + remainder;
			  arr[i] /= 10;
			}
			if (originalNum == reversedNum)
			{
				System.out.println(" is Palindrome.");
				reversedNum = 0;
				originalNum = 0;
				count++;
			}
			else 
			{
				System.out.println(" is not Palindrome.");
				reversedNum = 0;
				originalNum = 0;
			}
		}
		System.out.println("No of palindromes are "+ count);
	}
}
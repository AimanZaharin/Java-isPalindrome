// NOR AIMAN ZAHARIN BIN NOOR AZWAN

import java.util.Scanner;

public class CaseStudyOne {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a word to determine if it's a palindrome: ");
		String word = input.nextLine();
		
		int first = 0;
		
		int last = word.length() - 1;
		
		boolean isPalindrome = true;
		
		while(first < last)
		{
			if(word.charAt(last) != word.charAt(first))
			{
				isPalindrome = false;
				break;
			}
			
		first++;
		last--;
		}
		
		if(isPalindrome)
			System.out.println(word + " is a Palindrome");
		
		else
			System.out.println(word + " is not a Palindrome");
	}

}

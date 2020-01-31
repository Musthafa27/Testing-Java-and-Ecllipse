package ArrayTest;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
System.out.println("Enter string to reverse:");
        
       
        String reverse = "HelloWorld";
        int rev = reverse.length();
        System.out.println(rev);
        String Final = "";
        
        for(int i = rev-1; i>=0; i--)
        {
            Final = Final+reverse.charAt(i);
        }
        System.out.println(Final);
	}
}   
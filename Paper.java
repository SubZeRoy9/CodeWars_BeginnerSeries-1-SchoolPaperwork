/* Your classmates asked you to copy some paperwork for them. You know that there are 'n' classmates and the paperwork has 'm' pages.
 * Your task is to calculate how many blank pages do you need. If n < 0 or m < 0 return 0.*/

import java.util.Scanner;

public class Paper {

	public static void main(String[] args) {
		int numClassmates;
		int numPages;
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello, Please enter the number of classmates...");
		numClassmates = scan.nextInt();
		System.out.println("Please enter the number of pages...");
		numPages = scan.nextInt();
		System.out.println(paperWork(numClassmates, numPages) + " blank pages needed.");


	}
	
	public static int paperWork(int n, int m) {
	    int s;
	    s = n * m;
	    
	    if (n < 0||m < 0) {
	      return s = 0;
	    }
	    else {
	    
	    return s;
	  }
	 }
	}

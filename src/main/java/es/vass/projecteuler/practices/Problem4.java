package es.vass.projecteuler.practices;

public class Problem4 {

	/**
	 * 
	 * 	A palindromic number reads the same both ways. 
	 *  The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
		Find the largest palindrome made from the product of two 3-digit numbers.
	 * @return
	 */
	public Integer doExcercise(Integer a) {
		
		for(Integer i=a;i<=a;i--) {
			if(i.toString().length()==3) {
				if(isPalindromic(a*i)) {
					System.out.println("The largest palindrome made from the product of two 3-digit numbers is "+ a*i + " = "+a+"x"+i);
					break;
				}
			}else {
				return doExcercise(a-1);
			}
		}
		return 0;
	}
	
	private boolean isPalindromic(Integer number) {
		String numberString = number.toString();
		String reverseNumber = new StringBuilder(numberString).reverse().toString();
		return reverseNumber.equals(numberString);
	}
	
	
	public static void main(String args[]) {
		Problem4 solve = new Problem4();
		solve.doExcercise(999);
		//System.out.println(solve.findPalindromic(999, 999));
	}
}

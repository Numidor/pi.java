/*
 * Find Pi to Nth decimal, where N is the input number=
 */

import java.math.BigDecimal;
import java.util.Scanner;

public class Pi {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		BigDecimal b1 = new BigDecimal(22.0);
	    BigDecimal b2 = new BigDecimal(7.0);
		
		System.out.println("To how many decimal places do you want to print Pi?");
		int n = input.nextInt();
		
		if(n < 32627)
			System.out.println(b1.divide(b2, n, BigDecimal.ROUND_UP));
		else
			System.out.println("Limit exceeded !!!");
	}
}
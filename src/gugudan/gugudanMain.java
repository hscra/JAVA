package gugudan;

import java.util.Scanner;

public class gugudanMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int k = scanner.nextInt();
		//System.out.println(k);
		
		for(int i=0; i<k;i++) {
			int[] result= gugudan.calculate(i+1);
			gugudan.print(result);
		}
		scanner.close();
	}
}


// obsolete method on stack ?
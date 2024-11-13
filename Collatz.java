// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int upTo = Integer.parseInt(args[0]);
		boolean verbose = args[1].equals("v");

		for(int i = 1; i <= upTo; i++){
			int count = 2;
			int num = i;
			if (verbose)  //print the first number
					System.out.print(num + " ");

			if(num % 2 == 0) //runs for the first time in case upTo = 1
				num = num/2;
			else
				num = num*3 + 1;
			if (verbose) 
				System.out.print(num + " ");

			while(num != 1){	//runs until num == 1 
				if(num % 2 == 0)
					num = num/2;
				else
					num = num*3 + 1;
				
				count++;
				if (verbose) 
					System.out.print(num + " ");
			}
			
			if(verbose)
				System.out.println("(" + count + ")");
		}

		System.out.println("Every one of the first " + upTo + " hailstone sequences reached 1.");
	}
}

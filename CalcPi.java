// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) {  
		int times = Integer.parseInt(args[0]);
		double sum = 0;
		int num = 1;
		for(int i = 1; i <= times; i++){
			if(i%2 != 0)	//keeps track of + and -. if i is odd +1/num, if even -1/num
				sum = sum + (1.0/num);
			else 
				sum = sum - (1.0/num);
			num += 2;
		}

		System.out.println("pi according to Java: " + Math.PI);  //prints the actual value of pi
		System.out.println("pi, approximated:     " + sum*4);  //prints the approximation of pi

	}
}

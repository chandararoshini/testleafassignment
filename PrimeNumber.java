package weekone;

public class PrimeNumber {
	public static void main(String[] args) {
		int i, p=13;
		boolean f=false;
		for(i=2;i<=p/2;i++) {
			if(p%i==0)
				f=true;
		}
		if(!f)
			System.out.println(p + " is a Prime number");
		else
			System.out.println(p + " is not a prime number");
	}
}


public class O3 {
	public static void main (String[] args) {
		 long resultatFakultet = beregnFakultet(5);
		 System.out.println("Resultatet er " + resultatFakultet);
	 	}
 
public static long beregnFakultet(int n) {
	 if (n < 1) {
		 return n;
	 }
	 
	 return n * beregnFakultet(n - 1);
 	}
}

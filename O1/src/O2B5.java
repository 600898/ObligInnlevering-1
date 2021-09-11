
public class O2B5 {
	public static void main (String[] args) {
		int[] karakterer = { 
				10, 20, 30, 40, 50, 60, 70, 80, 90};
	for (int poengNo : karakterer) {
		char karakterKalkulert = kalkulasjon(poengNo);
		System.out.println("Karakter fra poengsum " + poengNo + karakterKalkulert);
	}
	}
	
	public static char kalkulasjon(int totalPoeng) {	
		
		if(totalPoeng < 0 || totalPoeng > 100) {
			throw new Error("Ugyldig poengsum " + totalPoeng);
		}
		
	char karakter = 'A';
	
	if(totalPoeng < 89) {
		karakter = 'B';
	}
	else if (totalPoeng < 79) {
		karakter = 'C';
	}
	else if (totalPoeng < 59) {
		karakter = 'D';
	}
	else if (totalPoeng < 49) {
		karakter = 'E';
	}
	else if (totalPoeng < 39) {
		karakter = 'F';
	}
	
	return karakter;
	}
}

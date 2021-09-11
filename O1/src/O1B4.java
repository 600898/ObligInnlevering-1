
public class O1B4 {
	public static void main (String[] args) {
		final int inntekt = 200000;
		
		double trinnskatt;
		
	if (inntekt < 184800) {
		trinnskatt = 0;
	}
	else if (inntekt > 184800 && inntekt < 260100) {
		trinnskatt = 1.7;
	}
	else if (inntekt > 184800 && inntekt < 651250) {
		trinnskatt = 1.7;
	}
	else if (inntekt > 184800 && inntekt < 1021550) {
		trinnskatt = 1.7;
	}
	else { trinnskatt = 16.2;
	}
		
	System.out.println("Før trinnskatt er inntekta: " + inntekt);
	
	System.out.println("Trinnskatten er " + trinnskatt);
	
	System.out.println("Etter trinnskatt er inntekta " + inntekt * trinnskatt / 100);
	
}
}

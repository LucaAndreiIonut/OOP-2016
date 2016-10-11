package Assignmentunu;

public class Problematrei {
	public static long Palindrom(long n) {
		long invers = 0, auxiliar = 0;
		auxiliar = n;
		while (auxiliar != 0) {
			invers = invers * 10 + auxiliar % 10;
			auxiliar = auxiliar / 10;
		}
		if (invers == n)
			return 0;
		else
			return 1;
	}

	public static void main(String[] args) {
		long NumberOne, NumberTwo, Maxim = 0, Produs = 1;
		for (NumberOne = 100; NumberOne <= 999; NumberOne++) {
			for (NumberTwo = 100; NumberTwo <= 999; NumberTwo++) {
				Produs = NumberOne * NumberTwo;
				if ((Palindrom(Produs) == 0) && (Produs > Maxim))
					Maxim = Produs;
			}

		}
		System.out.println("Numarul palindrom maxim este " + Maxim);
	}
}



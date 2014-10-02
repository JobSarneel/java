// Importeer de Scanner klasse

import java.util.Scanner;

public class DayOfWeek {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Instantieer een nieuw Scanner object		
		
		Scanner input = new Scanner(System.in);
		
		// Vraag gebruiker het jaar, de maand en de dag van de maand in te voeren: jaar, maand en dag.
		
		System.out.print("Voer het jaartal in, bijvoorbeeld '1978': ");		
		int jaar = input.nextInt(); 
		
		System.out.print("Voer de maand in, 1 voor januari, 4 voor april, etc.: ");
		int maand = input.nextInt();
		
		System.out.print("Voer de dag van de maand in (1-31): ");
		int dag = input.nextInt();		
		
		// Bereken q: = dag
		
		int q = dag;
		
		// Bereken m: = maand als de maand niet januari of februari is, anders m = maand+12 en jaar = jaar-1
		
		int m = maand;
		
		if (m < 3) {
			m = m + 12;
			jaar = jaar - 1;
		}
		
		// bereken j, de eeuw = jaar / 100
		
		int j = jaar / 100;
		
		// bereken k, het jaar van de eeuw: = jaar % 100
		
		int k = jaar % 100;
		
		// bereken h, de numerieke waarde van de dag van de week: h = (q + (26*(m + 1))/10 + k + k/4 + j/4 + 5*j)%7
		
		int h = (q + (26 * (m + 1)) / 10 + k + (k / 4) + (j / 4) + (5 * j)) % 7;
		
		// Geef de naam van de dag met een switch statement
		
		switch (h) {
		case 0: System.out.println(dag + "-" + maand + "-" + jaar + " valt op een zaterdag."); break;
		case 1: System.out.println(dag + "-" + maand + "-" + jaar + " valt op een zondag."); break;
		case 2: System.out.println(dag + "-" + maand + "-" + jaar + " valt op een maandag."); break;
		case 3: System.out.println(dag + "-" + maand + "-" + jaar + " valt op een dinsdag."); break;
		case 4: System.out.println(dag + "-" + maand + "-" + jaar + " valt op een woensdag."); break;
		case 5: System.out.println(dag + "-" + maand + "-" + jaar + " valt op een donderdag."); break;
		case 6: System.out.println(dag + "-" + maand + "-" + jaar + " valt op een vrijdag."); break;
		}

	}

}

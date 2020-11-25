package stackandqueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueGame {
	public static void main(String[] args) {
		// queue za dvata igraci, first za prviot, second za vtoriot
		Queue<String> first = new LinkedList<String>();
		Queue<String> second = new LinkedList<String>();

		// broj na crveni kartichki za prviot
		int totalRedFirst = 0;
		// broj na crveni kartichki za vtoriot
		int totalRedSecond = 0;

		// kartichki na prviot
		String[] array = { "R1", "R1", "R1", "R1" };// "R1", "R1", "R1", "T1" };
		
		for (String string : array) {
			// broime R1 kartichki
			if (string.equals("R1")) {
				totalRedFirst++;
				// System.out.println("Total red 1: " + totalRedFirst);
			}
			// dodavame elementi vo queue
			// System.out.println("Element for adding in 1: " + string);
			first.add(string);
		}

		// kartichki na vtoriot
		String[] array2 = { "R2", "R2", "T2", "R2" };

		for (String string : array2) {
			if (string.equals("R2")) {
				totalRedSecond++;
				// System.out.println("Total red 2: " + totalRedSecond);
			}
			// stavime elementite od nizata vo redicata
			// System.out.println("Element for adding in 2: " + string);
			second.add(string);
		}

		// pobednik e onoj koj shto prv kje gi izvadi site R karti od svojata redica :)

		// paralelno vadime elementi od 2te redici
		// 1. dali elementot e red element
		// 2. dali brojacot e 0 (dali imame pobednik)

		String winner = "";
		//flag za koga prviot stignal do 0
		boolean flag = false;
		while (!first.isEmpty() && !second.isEmpty()) {
			// == koristime za primitivni promenlivi int, double
			// equals za sporedba na objketi - String e klasa!!!
			System.out.println("First " + first.peek());
			if (first.poll().equals("R1")) {
				totalRedFirst--;
				System.out.println(totalRedFirst);
			}

			if (totalRedFirst == 0) {
				winner = "R1";
				//prviot stignal do 0
				flag = true;
				// sme nashle pobednik i ja zavrshuvame igrata
				//break;
			}

			// vadime od vtorata redica i proveruvame za R2 i namaluvame brojac
			System.out.println("Second " + second.peek());
			if (second.poll().equals("R2")) {
				totalRedSecond--;
				System.out.println(totalRedSecond);
			}

			if (totalRedSecond == 0) {
				//ako prviot stignal do 0 i jas sum stignal do 0 vo ista iteracija togash e neresheno
				//bidejkji i dvajcata sme stignale do 0 vo ista iteracija
				if(flag) {
					winner = "Draw";
				}else {
					winner = "R2";
				}
				// sme nashle pobednik i ja zavrshuvame igrata
				//break;
			}

		}

		System.out.println("Winner is: " + winner);

	}
}

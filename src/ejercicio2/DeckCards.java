package ejercicio2;

import java.util.ArrayList;

public class DeckCards {

	public static void main(String[] args) {

		String[] suits = { "Spades", "Diamonds", "Club", "Heart" };
		String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

		ArrayList<Card> deck = new ArrayList<Card>();
		//crea una baraja de cartas

		for (int i = 0; i < suits.length; i++) {
			//añade las cartas a la baraja
			for (int j = 0; j < values.length; j++) {
				Card card = new Card(suits[i], values[j]);
				deck.add(card);
			}
		}

		for (int i = 0; i < deck.size(); i++) {
			// mezcla/eligue las cartas de la baraja 
			int j = (int) Math.floor(Math.random() * i);
			Card tmp = deck.get(i);
			deck.set(i, deck.get(j));
			deck.set(j, tmp);
		}
		//muestra las primeras 5 cartas de la baraja
		for (int i = 0; i < 5; i++) {
			System.out.println(deck.get(i));
		}

	}

}

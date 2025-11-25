package ejercicio2;

public class Card {

	public String suit;//palos
	public String value;//valores
	
	public Card (String suit, String value) {
		this.suit = suit;//palos
		this.value = value;//valores
	}
	
	public String toString () {//transforma el palo y el valor en un string
		return (this.suit+"-"+this.value); //retorna el palo y el valor
	}
}

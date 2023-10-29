import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;
import pokemons.*;


public class Main {
	public static void main(String[] args) {
		Sawk p1 = new Sawk("Innocence", 1);
		Granbull p2 = new Granbull("Reus", 1);

		Battle b = new Battle();
		b.addAlly(p1);
		b.addFoe(p2);
		b.go();
	}
}
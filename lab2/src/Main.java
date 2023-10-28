import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;
import pokemons.Sawk;


public class Main {
	public static void main(String[] args) {
		Sawk s1 = new Sawk("Innocence", 1);
		Pokemon p1 = new Pokemon("Творец", 1);
		Battle b = new Battle();
		b.addAlly(s1);
		b.addFoe(p1);
		b.go();
	}
}
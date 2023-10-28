package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import attacks.Bulldoze;

public class Sawk extends Pokemon {

	public Sawk(String name, int level) {
		super(name, level);

		super.setType(Type.FIGHTING);
		super.setStats(75, 125, 75, 30, 75, 85);

		Bulldoze bulldoze = new Bulldoze(60, 100);

		super.setMove(bulldoze);
	}
}
package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import attacks.physical.*;
import attacks.special.*;
import attacks.status.*;


public class Sawk extends Pokemon {

	public Sawk(String name, int level) {
		super(name, level);

		super.setType(Type.FIGHTING);
		super.setStats(75, 125, 75, 30, 75, 85);

		Swagger swag = new Swagger();
		Rest rest = new Rest();
		Bulldoze bulldoze = new Bulldoze();
		FocusEnergy focEn = new FocusEnergy();

		super.setMove(swag);
		super.setMove(rest);
		super.setMove(bulldoze);
		super.setMove(focEn);
	}
}
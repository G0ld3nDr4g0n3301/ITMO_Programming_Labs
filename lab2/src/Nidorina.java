package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import attacks.physical.*;
import attacks.special.*;
import attacks.status.*;

public class Nidorina extends NidoranF {
	public Nidorina(String name, int level) {
		super(name, level);

		super.setType(Type.POISON);
		super.setStats(70, 62, 67, 55, 55, 56);

		Flatter flt = new Flatter();
		super.addMove(flt);
	}
}
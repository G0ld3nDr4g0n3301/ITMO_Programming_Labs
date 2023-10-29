package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import attacks.physical.*;
import attacks.special.*;
import attacks.status.*;

public class NidoranF extends Pokemon {
	public NidoranF(String name, int level) {
		super(name,level);

		super.setType(Type.POISON);
		super.setStats(55, 47, 52, 40, 40, 41);

		Scratch scr = new Scratch();
		Blizzard bliz = new Blizzard();

		super.addMove(scr);
		super.addMove(bliz);
	}
}
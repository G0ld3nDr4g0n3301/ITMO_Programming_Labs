package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import attacks.physical.*;
import attacks.special.*;
import attacks.status.*;

public class Nidoqueen extends Nidorina {
	public Nidoqueen(String name, int level) {
		super(name,level);

		super.setType(Type.POISON);
		super.setType(Type.GROUND);
		super.setStats(90,92,87,75,85,76);

		Flamethrower flThr = new Flamethrower();
		super.addMove(flThr);
	}
}
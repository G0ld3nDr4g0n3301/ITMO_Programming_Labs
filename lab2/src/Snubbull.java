package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import attacks.physical.*;
import attacks.special.*;
import attacks.status.*;

public class Snubbull extends Pokemon {

	public Snubbull(String name, int level) {
		super(name,level);

		super.setType(Type.FAIRY);
		super.setStats(60,80,50,40,40,30);

		Facade fac = new Facade();
		Lick lick = new Lick();
		Bulldoze bull = new Bulldoze();

		super.addMove(fac);
		super.addMove(lick);
		super.addMove(bull);
	}

}
package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import attacks.physical.*;
import ru.ifmo.se.pokemon.Type;

public class Granbull extends Snubbull {
	public Granbull(String name, int level) {
		super(name,level);
	
		super.setType(Type.FAIRY);
		super.setStats(90,120,75,60,60,45);

		RockSlide rockSlide = new RockSlide();
		super.addMove(rockSlide);
	}
}
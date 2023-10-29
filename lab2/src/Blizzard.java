package attacks.special;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Stat;
import utils.Random;

public class Blizzard extends SpecialMove {

	public Blizzard() {
		super(Type.ICE, 110, 70);
	}

	@Override
	protected void applyOppEffects(Pokemon p) {
		
		if(Random.chance(0.1)) {
			Effect.freeze(p);
		}
	}

	@Override
	protected String describe() {
		return "does Blizzard";
	}
}
package attacks.physical;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;
import utils.Random;

public class Lick extends PhysicalMove {
	public Lick() {
		super(Type.GHOST, 30, 100);
	}

	@Override
	protected void applyOppEffects(Pokemon p) {
		if(Random.chance(0.3)) {
			Effect.paralyze(p);
		}
	}

	@Override
	protected String describe() {
		return "does Lick";
	}
}
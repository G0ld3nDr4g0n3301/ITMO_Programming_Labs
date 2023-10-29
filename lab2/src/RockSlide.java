package attacks.physical;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;
import utils.Random;

public class RockSlide extends PhysicalMove {
	public RockSlide() {
		super(Type.ROCK, 75, 90);
	}

	@Override
	protected void applyOppEffects(Pokemon p) {

		if(Random.chance(0.3)) {
			Effect.flinch(p);
		}
	}

	@Override
	protected String describe() {
		return "does Rock Slide";
	}
}
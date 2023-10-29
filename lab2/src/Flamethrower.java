package attacks.special;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;
import utils.Random;

public class Flamethrower extends SpecialMove {
	public Flamethrower() {
		super(Type.FIRE, 90, 100);
	}

	@Override
	protected void applyOppEffects(Pokemon p) {
		if(Random.chance(0.1)) {
			Effect.burn(p);
		}
	}

	@Override
	protected String describe() {
		return "does Flamethrower";
	}

}
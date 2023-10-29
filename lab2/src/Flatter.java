package attacks.status;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Stat;
import utils.Random;

public class Flatter extends StatusMove {

	public Flatter() {
		super(Type.DARK, 0, 100);
	}

	@Override
	protected void applyOppEffects(Pokemon p) {
		Effect e = new Effect().stat(Stat.SPECIAL_ATTACK, 1);
		p.addEffect(e);
		Effect.confuse(p);
	}

	@Override
	protected String describe() {
		return "does Flatter";
	}
}
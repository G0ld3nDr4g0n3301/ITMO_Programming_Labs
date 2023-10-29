package attacks.status;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Stat;
import utils.Random;

public class Swagger extends StatusMove{
	public Swagger() {
		super(Type.NORMAL, 0, 85);
	}

	@Override
	protected void applyOppEffects(Pokemon p) {
		Effect e = new Effect().stat(Stat.ATTACK, 2);
		p.addEffect(e);
		Effect.confuse(p);
	}

	@Override
	protected String describe() {
		return "does Swagger";
	}
}
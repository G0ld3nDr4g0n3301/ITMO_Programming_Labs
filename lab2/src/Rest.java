package attacks.status;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Status;
import utils.Random;

public class Rest extends StatusMove {
	public Rest() {
		super(Type.PSYCHIC, 0, 0);
	}

	@Override
	protected boolean checkAccuracy(Pokemon atk, Pokemon def) {
		return true;
	}

	@Override
	protected void applySelfEffects(Pokemon p) {
		Effect e = new Effect().condition(Status.SLEEP).turns(2);
		p.addEffect(e);
		p.setMod(Stat.HP, -6);
	}

	@Override
	protected String describe() {
		return "does Rest";
	}

}
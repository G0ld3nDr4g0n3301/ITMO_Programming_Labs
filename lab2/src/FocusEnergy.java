package attacks.status;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Stat;
import utils.Random;

public class FocusEnergy extends StatusMove {

	public FocusEnergy() {
		super(Type.NORMAL, 0, 0);
	}

	@Override
	protected boolean checkAccuracy(Pokemon atk, Pokemon def) {
		return true;
	}

	@Override
	protected void applySelfEffects(Pokemon p) {
		Effect e = new Effect().stat(Stat.SPEED, 5);
		p.addEffect(e);
	}

	@Override
	protected String describe(){
		return "does Focus Energy";
	}
}
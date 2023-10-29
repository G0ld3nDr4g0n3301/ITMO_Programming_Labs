package attacks.physical;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import utils.Random;

public class Bulldoze extends PhysicalMove {

	public Bulldoze() {
		super(Type.GROUND, 60,100);
	}

	@Override
	protected void applyOppEffects(Pokemon p) {
		Effect e = new Effect().stat(Stat.SPEED, -1);
		p.addEffect(e);
	}

	@Override
	protected String describe() {
		return "does Bulldoze";
	}

}
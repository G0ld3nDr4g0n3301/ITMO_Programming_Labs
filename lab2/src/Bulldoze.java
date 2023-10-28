package attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import utils.Random;

public class Bulldoze extends PhysicalMove {

	public Bulldoze(double power, double accuracy) {
		super(Type.GROUND, power, accuracy);
	}

	@Override
	protected void applyOppEffects(Pokemon p) {
		super.applyOppEffects(p);

		Effect e = new Effect().stat(Stat.SPEED, -1);
		p.addEffect(e);
	}

	@Override
	protected String describe() {
		return "does Bulldoze";
	}

}
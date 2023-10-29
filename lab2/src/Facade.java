package attacks.physical;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Status;

public class Facade extends PhysicalMove {

	public Facade() {
		super(Type.NORMAL,70,100);
	}

	@Override
	protected void applySelfEffects(Pokemon p) {

		if ( (p.getCondition() == Status.BURN) || (p.getCondition() == Status.POISON) || (p.getCondition() == Status.PARALYZE)) {
			Effect e = new Effect().turns(1).stat(Stat.ATTACK, 2);
			p.addEffect(e);
		}
	}

	@Override
	protected String describe() {
		return "does Facade";
	}
}
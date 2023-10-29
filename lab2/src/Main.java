import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;
import pokemons.*;


public class Main {
	public static void main(String[] args) {
		Sawk p1 = new Sawk("Innocence", 1);
		Snubbull p2 = new Snubbull("Procuratorum", 1);
		Granbull p3 = new Granbull("Reus", 1);

		NidoranF a1 = new NidoranF("Monstrus", 1);
		Nidorina a2 = new Nidorina("Sanctus", 1);
		Nidoqueen a3 = new Nidoqueen("Deus", 1);

		Battle b = new Battle();
		b.addAlly(p1);
		b.addAlly(p2);
		b.addAlly(p3);
		b.addFoe(a1);
		b.addFoe(a2);
		b.addFoe(a3);
		b.go();
	}
}
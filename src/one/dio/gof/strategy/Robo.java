package one.dio.gof.strategy;

public class Robo {

	private Comportamento comp;

	public void setComp(Comportamento comp) {
		this.comp = comp;
	}

	public void mover() {
		comp.mover();
		
	}
}

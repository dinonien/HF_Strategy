package Duck;

import FlugVerhalten.FlugVerhalten;
import QuakVerhalten.QuakVerhalten;

public abstract class Ente {
	FlugVerhalten flugverhalten;
	QuakVerhalten quakverhalten;
	
	public Ente(){		
	}
	
	public void tuFliegen() {
		flugverhalten.fliegen();
	}
	
	public void tuQuaken() {
		quakverhalten.quacken();
	}
	
	public void schwimmen() {
		System.out.println("Alle Enten schwimmen");
	}
	
	public void setFlugVerhalten(FlugVerhalten fv){
		this.flugverhalten = fv;
	}
	
	public void setQuakVerhalten(QuakVerhalten qv) {
		this.quakverhalten = qv;
	}
	
}


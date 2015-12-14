package Duck;

import FlugVerhalten.FliegtGarNicht;
import QuakVerhalten.Quaken;

public class ModellEnte extends Ente {

	public ModellEnte() {
		flugverhalten = new FliegtGarNicht();
		quakverhalten = new Quaken();
	}

}

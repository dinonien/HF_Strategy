package Duck;

import FlugVerhalten.FliegtMitFluegeln;
import QuakVerhalten.Quaken;

public class StockEnte extends Ente {
	
	public StockEnte() {
		quakverhalten = new Quaken();
		flugverhalten = new FliegtMitFluegeln();
	}

}
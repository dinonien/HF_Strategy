package Simulator;

import Duck.StockEnte;
import FlugVerhalten.FliegtRaketenGetrieben;
import Duck.Ente;
import Duck.ModellEnte;

public class MiniEntenSimulator {
	public static void main(String[] args) {
		Ente mallard = new StockEnte();
		mallard.tuFliegen();
		mallard.tuQuaken();
		System.out.println("____");
		Ente modell = new ModellEnte();
		modell.tuFliegen();
		modell.setFlugVerhalten(new FliegtRaketenGetrieben());
		modell.tuFliegen();
		
	}
}

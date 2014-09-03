package app;

import utils.IOSimulator;
import utils.InputOutput;

public class Irrigation {


	private void UscitaEVZonaSudOvest(boolean v) {
		io.DOPut(ZoneSouthWest, v);
	}

	private void UscitaEVZonaNord(boolean v) {
		io.DOPut(ZoneNorth, v);
	}

	private void UscitaEVZonaNordEst(boolean v) {
		io.DOPut(ZoneNorthEast, v);
	}

	private void UscitaEVZonaSudEst(boolean v) {
		io.DOPut(ZoneSouthEast, v);
	}

	private void UscitaEVGocciolanteOvest(boolean v) {
		io.DOPut(UndergroundWest, v);
	}

	private void UscitaEVGocciolanteEst(boolean v) {
		io.DOPut(UndergroundEast, v);
	}

	public static void main(String[] args) {
	}

}

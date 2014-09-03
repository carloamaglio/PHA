package utils;

import app.Irrigation.DigitalOutput;

public class IOConfig {

	private InputOutput io = new IOSimulator();

	final DigitalOutput ZoneSouthWest;
	final DigitalOutput ZoneNorth;
	final DigitalOutput UndergroundWest;
	final DigitalOutput UndergroundEast;
	final DigitalOutput ZoneNorthEast;
	final DigitalOutput ZoneSouthEast;
	final DigitalOutput XMasLight;
	final DigitalOutput GateLight;

	final DigitalOutput GateOpen;
	final DigitalOutput GateClose;
	final DigitalOutput Debug;
	final DigitalOutput Activity;

	private Irrigation() {
		ZoneSouthWest = new DigitalOutput(io, 0);
		ZoneNorth = new DigitalOutput(io, 1);
		UndergroundWest = new DigitalOutput(io, 2);
		UndergroundEast = new DigitalOutput(io, 3);
		ZoneNorthEast = new DigitalOutput(io, 4);
		ZoneSouthEast = new DigitalOutput(io, 5);
		XMasLight = new DigitalOutput(io, 6);
		GateLight = new DigitalOutput(io, 7);

		GateOpen = new DigitalOutput(io, 8);
		GateClose = new DigitalOutput(io, 9);
		Debug = new DigitalOutput(io, 10);
		Activity = new DigitalOutput(io, 31);
	}

}

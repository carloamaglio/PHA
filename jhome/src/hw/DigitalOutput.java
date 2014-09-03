package hw;

import utils.InputOutput;

public class DigitalOutput {
	private final InputOutput io;
	private final int position;
	private DigitalOutput(InputOutput io, int position) {
		this.io = io;
		this.position = position;
	}
}

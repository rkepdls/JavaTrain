package T20230510.a4;

import java.util.Random;

public class ComputerPlayer extends Player {
	private static Random rand;
	static {
		rand = new Random();
	}

	public int nextHand() {
		return rand.nextInt(3);
	}

	public int nextInt(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
}

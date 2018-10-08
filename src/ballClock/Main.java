package ballClock;

public class Main {

	public static void main(String[] args)
	{
		clock clock = new clock(30, 720);
		clock.run(clock.getRunTime());
	}
}

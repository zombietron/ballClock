package ballClock;

public class clock {
	
	chute _oneMinute  = new chute("oneMinute");
	chute _fiveMinute = new chute("fiveMinute");
	chute _hour = new chute("hour");
	chute _queue = new chute("queue");
	int runTime;
	

	public clock(int numberOfMarbles, int time)
	{
		runTime = time;
		
		for(int i =0; i<numberOfMarbles; i++)
		{
			Marble added = new Marble(i);
			_queue.addMarble(added);
			System.out.println("added marble " + added.getMarbleNumber());

		}
		System.out.println(_queue.getMarbleNoDelete(0).getMarbleNumber());
	}
	
	public int getRunTime()
	{
		return runTime;
	}
	
	public void run(int time)
	{

		for(int i = 0; i<time; i++)
		{
			Marble trackMarble = _queue.getMarble(0);
			System.out.println("marble  " + trackMarble.getMarbleNumber() + " is on the track");

			
		if(_oneMinute.size()<4)
		{
			_oneMinute.addMarble(trackMarble);
			System.out.println("added marble to one Minute Chute");
		}
		else if(_fiveMinute.size()<11)
		{
			_fiveMinute.addMarble(trackMarble);
			for(int j = 4; j>0; j--)
			{
				Marble transMarble = _oneMinute.getMarble(j-1);
				System.out.println("marble " + transMarble.getMarbleNumber() + " added back to queue");
				_queue.addMarble(transMarble);
			}
			for(int j = 0;j<=_queue.size()-1;j++)
			{
				System.out.println("queue order" + _queue.getMarbleNoDelete(j).getMarbleNumber());
			}
			System.out.println("added marble to five minute chute, chute has " + _fiveMinute.size() + " marbles");
			System.out.println("_oneMinuteChuteSize is " + _oneMinute.size());
		}
		else if(_hour.size()<11)
		{
			_hour.addMarble(trackMarble);
			for(int v = 4; v>0; v--)
			{
				_queue.addMarble(_oneMinute.getMarble(v-1));
			}
			for(int k = 11; k>0; k--)
			{
				_queue.addMarble(_fiveMinute.getMarble(k-1));
			}

			
			System.out.println("added marble to _hourQueue");
			System.out.println("hour queue has " + _hour.size() + " marbles");
			System.out.println("one minute size is " + _oneMinute.size());
			System.out.println("five minute size is " + _fiveMinute.size());
		}
		else
		{
			for(int n = 4; n>0; n--)
			{
				_queue.addMarble( _oneMinute.getMarble(n-1));
			}


			for(int n = 11; n>0; n--)
			{
				_queue.addMarble( _fiveMinute.getMarble(n-1));
			}

			for(int n = 11; n > 0; n--)
			{
				_queue.addMarble(_hour.getMarble(n-1));
				

			}

			_queue.addMarble(trackMarble);
			for(int p = 0; p<=_queue.size()-1; p++)
			{
				System.out.println(_queue.getMarbleNoDelete(p).getMarbleNumber());
			}
			System.out.println("Your Queue has " + _queue.size() + " balls");

			return;
			
		}
		}
		

	}
	
	public void runTwelve()
	{
		for(int i = 0; i<=1000; i++)
		{
			Marble trackMarble = _queue.getMarble(0);
			
		if(_oneMinute.size()<4)
		{
			_oneMinute.addMarble(trackMarble);
		}
		else if(_fiveMinute.size()<11)
		{
			_fiveMinute.addMarble(trackMarble);
			for(int j = 4; j>0; j--)
			{
				_queue.addMarble( _oneMinute.getMarble(j-1));
			}
		}
		else if(_hour.size()<11)
		{
			_hour.addMarble(trackMarble);
			for(int k = 11; k>0; k--)
			{
				_queue.addMarble(_fiveMinute.getMarble(k-1));
			}
		}
		else
		{
			for(int l = 4; l>0; l--)
			{
				_queue.addMarble(_oneMinute.getMarble(l-1));
			}
			for(int m = 11; m> 0; m--)
			{
				_queue.addMarble(_fiveMinute.getMarble(m-1));
				
			}
			for(int n = 11; n > 0; n--)
			{
				_queue.addMarble(_hour.getMarble(n-1));
				System.out.println("it's 12 o'clock");
			}
			for(int p = 0; p<_queue.size()-1; p++)
			{
				System.out.println(_queue.getMarbleNoDelete(p).getMarbleNumber());
			}
			System.out.println("queue has " + _queue.size() + " marbles");
			return;
			}
		}
	
	

}
}

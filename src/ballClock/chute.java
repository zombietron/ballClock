package ballClock;
import java.util.*;

public class chute {

	 ArrayList<Marble> chute;
	 boolean isEmpty;
	 
	 //constructor
	public chute(String name)
	{
		String chuteName = name;
		chute = new ArrayList();
		System.out.println("Created new ArrayList with name" + name + " and size"  + chute.size());
	}
	


	public Marble getMarble(int index)
	{
		if(chute.get(index)!=null)
		return chute.remove(index);
		else return null;
	}
	
	public Marble getMarbleNoDelete(int index)
	{
		return chute.get(index);
	}

	// add marble to the next available spot starting at the bottom of the ArrayList Chute. 
	
	public boolean addMarble(Marble marble)
	{
		chute.add(	marble);
		return true;
	}
	

	
	// grab the next marble for the clock starting at the top of the chute
	
	public Marble getNextInQueue()
	{
		if(chute.get(0)!=null)
		{
			return chute.remove(0);
			
		}
		else {return null;}
	}
	
	//get marble from designated index inside of the arraylist, return null if no marble is present


	// empty	 the arrayList
	public void empty()
	{
		chute.clear();
	}
	
	public int size()
	{
		return chute.size();
	}
	
	public void trimToSize()
	{
		chute.trimToSize();
	}

	public void ensureMin()
	{
		chute.ensureCapacity(1);
	}
	
	public void setEmpty(boolean bool)
	{
		this.isEmpty = true;
	}
	
	public boolean isEmpty()
	{
		return this.isEmpty;
	}


}

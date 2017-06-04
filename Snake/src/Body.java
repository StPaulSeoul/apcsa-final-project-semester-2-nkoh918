
public class Body 
{
	
	static int[] positionx = new int[(400*400)/(20*20)];
	static int[] positiony = new int[(400*400)/(20*20)];
	
	public static int length = 0;
	
	public static int getpositionx(int index)
	{
		return positionx[index];
	}
	
	public static int getpositiony(int index)
	{
		return positiony[index];
	}

}

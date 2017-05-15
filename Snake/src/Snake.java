public class Snake
{
	int pixeltotal = Board.getpixeltotal;
	public int[] x = new int[pixeltotal];
	public int[] y = new int[pixeltotal];
	
	public int joint = 0;
	
	public int getSnakeX(int i)
	{
		return x[i];
	}
	
	public int getSnakeY(int i)
	{
		return y[i];
	}
	
	public boolean moveleft = false;
	public boolean moveright = false;
	public boolean moveup = false;
	public boolean movedown = false;
	
	public void movement()
	{
		for(int i = joint; i>0 ; i--)
		{
			x[i] = x[i-1];
			y[i] = y[i-1];
		}
		
		if(moveleft == true) x[0] = x[0]-(Board.getpixelsize);
		if(moveright == true) x[0] = x0] + Board.getpixelsize;
		if(moveup == true) y[0] = y[0] + Board.getpixelsize;
		if(movedown == true) y[0] = y[0] - Board.getpixelsize;
		
		
	}
	
}
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Board extends JPanel 
{
	public final static int width = 500;
	public final static int height = 400;
	public final static int pixelsize = 10;
	
	public Snake snake = new Snake();
	public Food food = new Food();
	
	public boolean gamerunning = true;
	
	public Board(){
		
		setPreferredSize(new Dimension(width,height));
		setBackground(Color.white);
	}
	
	void draw(Graphics graphics)
	{
		if(gamerunning)
		{
			graphics.setColor(Color.red);
			graphics.fillRoundRect(food.getx(), food.gety(), pixelsize, pixelsize, 2, 2);
			
		}
	}
	
}
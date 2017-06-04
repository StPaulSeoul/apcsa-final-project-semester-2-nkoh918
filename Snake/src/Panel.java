import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel extends JFrame
{
	public boolean inprogress = true;
	
	Panel()
	{
		Container ContentPane;
		setTitle("Snake");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		setVisible(true);
		setResizable(false);
		ContentPane = getContentPane();
		APanel panel = new APanel();
		setLocation(200,400);	
		ContentPane.add(panel, BorderLayout.CENTER);
		
		
		//addKeyListener(new KeyListener());
	}
	
	class APanel extends JPanel
	{
		public void paint(Graphics graphics)
		{
			if(inprogress == true)
			{
				int positionx = (int) (Math.random() * (400-30));
				int positiony = (int) (Math.random() * (400-30));
				graphics.setColor(Color.green);
				graphics.fillRoundRect(positionx, positiony, 20, 20, 10, 10);
				
				int i = 0;
				while(i<Body.length)
				{
						graphics.setColor(Color.blue);
						graphics.fillRoundRect(Body.getpositionx(i), Body.getpositiony(i), 20, 20, 10, 10);
						i++;
				}
			}
			
		}
	}
	
	public void snake()
	{
		JLabel[] snake = new JLabel[5];
		for(int i = 0; i<snake.length; i++)
		{
			graphics.setColor(Color.red);
			snake[i] = Graphics.
					
		}
	}
	
	public static void main(String[] args)
	{
		new Panel();
	}
}

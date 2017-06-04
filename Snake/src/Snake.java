import javax.swing.JFrame;

public class Snake extends JFrame
{
	Snake()
	{
		add(new Panel());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Snake");
		setLocation(200,200);
	}
	
	public static void main(String[] args)
	{
		
			JFrame f = new Snake();
			f.setVisible(true);
		
	}
}

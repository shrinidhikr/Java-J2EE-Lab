import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class SwingLights extends JFrame{
	JRadioButton red = new JRadioButton("Red Light");
	JRadioButton yellow = new JRadioButton("Yellow Light");
	JRadioButton green = new JRadioButton("Green Light");
	ButtonGroup bg = new ButtonGroup();
	JLabel result = new JLabel("Select a traffic light",JLabel.CENTER);
	public SwingLights()
	{
		super("Traffic Lights");
		setLayout(new GridLayout(0,1));
		result.setFont(new Font("Sans-Serif", Font.BOLD, 30));
		bg.add(red);
		bg.add(yellow);
		bg.add(green);
		add(red);
		add(yellow);
		add(green);
		add(result);
		red.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent iet)
			{
				if(iet.getStateChange()==1)
				{
					result.setText("Stop");
					result.setForeground(Color.RED);
				}
			}
			});
		yellow.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent iet)
			{
				if(iet.getStateChange()==1)
				{
					result.setText("Ready");
					result.setForeground(Color.YELLOW);
				}
			}
			});
		green.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent iet)
			{
				if(iet.getStateChange()==1)
				{
					result.setText("Go");
					result.setForeground(Color.GREEN);
				}
			}
			});
	}
	
	public static void main(String args[])
	{
		SwingLights sl = new SwingLights();
		sl.setSize(400,400);
		sl.setVisible(true);
		sl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

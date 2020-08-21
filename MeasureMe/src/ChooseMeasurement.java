

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChooseMeasurement extends JFrame implements ActionListener
{
    public static void main (String args[])
    {
        ChooseMeasurement content = new ChooseMeasurement ();
        
        JFrame window = new JFrame ("Choose A Measurment");
        window.setContentPane(content);
        window.setBackground(Color.DARK_GRAY);
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize (1200,700);
        window.setLocation (100,100);
        window.setVisible (true);
    }
    JPanel title;
    JPanel button;
    JPanel nextt;
    public ChooseMeasurement ()
    {
    	title = new JPanel ();
    	title.setBackground(Color.DARK_GRAY);

        JLabel Instruction = new JLabel ("Choose A Measurement");
        Instruction.setFont(new Font ("Century Gothic", Font.BOLD, 28));
        Instruction.setForeground(new Color (138, 242, 156));
        title.add(Instruction);
        add(title);
    	
        button = new JPanel ();
    	button.setBackground(Color.DARK_GRAY);
    	
        JRadioButton area = new JRadioButton ("Area");
        area.setForeground(Color.WHITE);
        area.setFont(new Font ("Century Gothic", Font.BOLD, 15));
        area.setOpaque (true);
        area.setBorderPainted (false);
        area.setActionCommand("area");
        area.addActionListener (this);
        area.setBackground(Color.DARK_GRAY);
        
        JRadioButton perimeter = new JRadioButton ("Perimeter");
        perimeter.setForeground(Color.WHITE);
        perimeter.setOpaque (true);
        perimeter.setBorderPainted (false);
        perimeter.setActionCommand("perimeter");
        perimeter.addActionListener (this);
        perimeter.setFont(new Font ("Century Gothic", Font.BOLD, 15));
        perimeter.setBackground(Color.DARK_GRAY);
        
        JRadioButton volume = new JRadioButton ("Volume");
        volume.setForeground(Color.WHITE);
        volume.setFont(new Font ("Century Gothic", Font.BOLD, 15));
        volume.setOpaque (true);
        volume.setBorderPainted (false);
        volume.setActionCommand("volume");
        volume.addActionListener (this);
        volume.setBackground(Color.DARK_GRAY);
        
        JRadioButton surfacearea = new JRadioButton ("Surface Area");
        surfacearea.setForeground(Color.WHITE);
        surfacearea.setFont(new Font ("Century Gothic", Font.BOLD, 15));
        surfacearea.setOpaque (true);
        surfacearea.setBorderPainted (false);
        surfacearea.setActionCommand("surfacearea");
        surfacearea.addActionListener (this);
        surfacearea.setBackground(Color.DARK_GRAY);
        
        ButtonGroup group = new ButtonGroup ();
        group.add(surfacearea);
        group.add(volume);
        group.add(perimeter);
        group.add(area);
        
        button.add(surfacearea);
        button.add(volume);
        button.add(perimeter);
        button.add(area);
        add(button);
        
        setLayout(new BorderLayout());
        add(title,BorderLayout.NORTH);  
        add(button,BorderLayout.CENTER);

    }
    public void actionPerformed (ActionEvent e)
    {
        if ((e.getActionCommand().equals("area")))
        {
        		AreaShapes frame = new AreaShapes();
            	frame.setVisible(true);
            	frame.setSize(1200, 700);
            	frame.setLocation(100, 100);
        	
        }
        if ((e.getActionCommand().equals("perimeter")))
        {
        		PerimeterShapes frame = new PerimeterShapes();
            	frame.setVisible(true);
            	frame.setSize(1200, 700);
            	frame.setLocation(100, 100);
        }
        if ((e.getActionCommand().equals("volume")))
        {
        	
        		VolumeShapes frame = new VolumeShapes();
            	frame.setVisible(true);
            	frame.setSize(1200, 700);
            	frame.setLocation(100, 100);
        	
        }
        if ((e.getActionCommand().equals("surfacearea")))
        {
        	
        		SurfaceAreaShapes frame = new SurfaceAreaShapes();
            	frame.setVisible(true);
            	frame.setSize(1200, 700);
            	frame.setLocation(100, 100);
        	
        }
    }
    
}
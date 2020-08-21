


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JPanel implements ActionListener
{
    public static void main (String args[])
    {
        Main content = new Main ();
        JFrame window = new JFrame ("Main");
        JButton button;
        JLabel logo;
        
        JPanel panel = new JPanel ();
        button = new JButton ("Start");
        panel.setLayout(null);
        panel.setBackground(Color.DARK_GRAY);
        button.setBounds(550, 550, 100, 30);
        button.setFont(new Font ("Century Gothic", Font.BOLD, 15));
        button.setBackground(new Color (138, 242, 156));
        button.setActionCommand("opt1");
        button.addActionListener(content);
        logo = new JLabel (createImageIcon ("/A/measurementlogo.png"));
        logo.setBounds(350, 30, 500, 500);
    	panel.add (logo); 
        panel.add(button);
        
        window.add(panel);
        //setLayout(null);
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize (1200,700);
        window.setLocation (100,100);
        window.setVisible (true);
    }
    public Main ()
    {

    }
    public void actionPerformed (ActionEvent e)
    {
        if (e.getActionCommand().equals ("opt1"))
        {
        	ChooseMeasurement frame = new ChooseMeasurement();
        	frame.setVisible(true);
        	frame.setSize(1200, 700);
        	frame.setLocation(100, 100);
        	
        }
    }
    protected static ImageIcon createImageIcon (String path)
    {
    	java.net.URL imgURL = Main.class.getResource(path);
    	if (imgURL != null)
    	{
    		return new ImageIcon (imgURL);
    	}
    	else
    	{
    		System.err.println ("Couldn't find file:" + path);
               return null;

    	}
    }

}
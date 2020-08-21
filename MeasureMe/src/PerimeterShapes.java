
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PerimeterShapes extends JFrame implements ActionListener
{
    public static void main (String args[])
    {
        PerimeterShapes content = new PerimeterShapes ();
        
        JFrame window = new JFrame ("Choose A Shape");
        window.setContentPane(content);
        window.setBackground(Color.DARK_GRAY);
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize (1200,700);
        window.setLocation (100,100);
        window.setVisible (true);
    }
    JPanel title;
    JPanel buttonleft;
    JPanel buttoncenter;
    JPanel buttonright;
    public PerimeterShapes ()
    {

    	title = new JPanel ();
    	title.setBackground(Color.DARK_GRAY);

        JLabel Instruction = new JLabel ("Choose A Shape");
        Instruction.setFont(new Font ("Century Gothic", Font.BOLD, 28));
        Instruction.setForeground(new Color (138, 242, 156));
        title.add(Instruction);
        add(title);
    	
        buttonleft = new JPanel ();
    	buttonleft.setBackground(Color.DARK_GRAY);
    	buttonleft.setPreferredSize(new Dimension (300, 600));
        add(buttonleft);
        
        buttoncenter = new JPanel ();
    	buttoncenter.setBackground(Color.DARK_GRAY);
    	buttoncenter.setPreferredSize(new Dimension (600, 600));
    	
    	JLabel s = new JLabel ("                                     Shapes                                    ");
    	s.setFont(new Font ("Century Gothic", Font.BOLD, 20));
        s.setForeground(new Color (138, 242, 156));
    	
        JRadioButton Rectangle = new JRadioButton ("Rectangle");
        Rectangle.setForeground(Color.WHITE);
        Rectangle.setFont(new Font ("Century Gothic", Font.BOLD, 15));
        Rectangle.setOpaque (true);
        Rectangle.setBorderPainted (false);
        Rectangle.setActionCommand("Rectangle");
        Rectangle.addActionListener (this);
        Rectangle.setBackground(Color.DARK_GRAY);
        
        JRadioButton Circle = new JRadioButton ("Circle");
        Circle.setForeground(Color.WHITE);
        Circle.setOpaque (true);
        Circle.setBorderPainted (false);
        Circle.setActionCommand("Circle");
        Circle.addActionListener (this);
        Circle.setFont(new Font ("Century Gothic", Font.BOLD, 15));
        Circle.setBackground(Color.DARK_GRAY);
        
        JRadioButton Square = new JRadioButton ("Square");
        Square.setForeground(Color.WHITE);
        Square.setFont(new Font ("Century Gothic", Font.BOLD, 15));
        Square.setOpaque (true);
        Square.setBorderPainted (false);
        Square.setActionCommand("Square");
        Square.addActionListener (this);
        Square.setBackground(Color.DARK_GRAY);
        
        JRadioButton Triangle = new JRadioButton ("Triangle");
        Triangle.setForeground(Color.WHITE);
        Triangle.setFont(new Font ("Century Gothic", Font.BOLD, 15));
        Triangle.setOpaque (true);
        Triangle.setBorderPainted (false);
        Triangle.setActionCommand("Triangle");
        Triangle.addActionListener (this);
        Triangle.setBackground(Color.DARK_GRAY);
        
        JRadioButton Trapezoid = new JRadioButton ("Trapezoid");
        Trapezoid.setForeground(Color.WHITE);
        Trapezoid.setOpaque (true);
        Trapezoid.setBorderPainted (false);
        Trapezoid.setActionCommand("Trapezoid");
        Trapezoid.addActionListener (this);
        Trapezoid.setFont(new Font ("Century Gothic", Font.BOLD, 15));
        Trapezoid.setBackground(Color.DARK_GRAY);
        
        JRadioButton Parallelogram = new JRadioButton ("Parallelogram");
        Parallelogram.setForeground(Color.WHITE);
        Parallelogram.setFont(new Font ("Century Gothic", Font.BOLD, 15));
        Parallelogram.setOpaque (true);
        Parallelogram.setBorderPainted (false);
        Parallelogram.setActionCommand("Parallelogram");
        Parallelogram.addActionListener (this);
        Parallelogram.setBackground(Color.DARK_GRAY);
        
        JRadioButton Pentagon = new JRadioButton ("Pentagon");
        Pentagon.setForeground(Color.WHITE);
        Pentagon.setFont(new Font ("Century Gothic", Font.BOLD, 15));
        Pentagon.setOpaque (true);
        Pentagon.setBorderPainted (false);
        Pentagon.setActionCommand("Pentagon");
        Pentagon.addActionListener (this);
        Pentagon.setBackground(Color.DARK_GRAY);
        
        JRadioButton Hexagon = new JRadioButton ("Hexagon");
        Hexagon.setForeground(Color.WHITE);
        Hexagon.setOpaque (true);
        Hexagon.setBorderPainted (false);
        Hexagon.setActionCommand("Hexagon");
        Hexagon.addActionListener (this);
        Hexagon.setFont(new Font ("Century Gothic", Font.BOLD, 15));
        Hexagon.setBackground(Color.DARK_GRAY);
        
        JRadioButton Heptagon = new JRadioButton ("Heptagon");
        Heptagon.setForeground(Color.WHITE);
        Heptagon.setFont(new Font ("Century Gothic", Font.BOLD, 15));
        Heptagon.setOpaque (true);
        Heptagon.setBorderPainted (false);
        Heptagon.setActionCommand("Heptagon");
        Heptagon.addActionListener (this);
        Heptagon.setBackground(Color.DARK_GRAY);
        
        JRadioButton Octagon = new JRadioButton ("Octagon");
        Octagon.setForeground(Color.WHITE);
        Octagon.setFont(new Font ("Century Gothic", Font.BOLD, 15));
        Octagon.setOpaque (true);
        Octagon.setBorderPainted (false);
        Octagon.setActionCommand("Octagon");
        Octagon.addActionListener (this);
        Octagon.setBackground(Color.DARK_GRAY);
        
        JRadioButton Nonagon = new JRadioButton ("Nonagon");
        Nonagon.setForeground(Color.WHITE);
        Nonagon.setOpaque (true);
        Nonagon.setBorderPainted (false);
        Nonagon.setActionCommand("Nonagon");
        Nonagon.addActionListener (this);
        Nonagon.setFont(new Font ("Century Gothic", Font.BOLD, 15));
        Nonagon.setBackground(Color.DARK_GRAY);
        
        JRadioButton Decagon = new JRadioButton ("Decagon");
        Decagon.setForeground(Color.WHITE);
        Decagon.setFont(new Font ("Century Gothic", Font.BOLD, 15));
        Decagon.setOpaque (true);
        Decagon.setBorderPainted (false);
        Decagon.setActionCommand("Decagon");
        Decagon.addActionListener (this);
        Decagon.setBackground(Color.DARK_GRAY);
        
        ButtonGroup group = new ButtonGroup ();
        group.add(Rectangle);
        group.add(Circle);
        group.add(Square);
        group.add(Triangle);
        group.add(Trapezoid);
        group.add(Parallelogram);
        group.add(Pentagon);
        group.add(Hexagon);
        group.add(Heptagon);
        group.add(Octagon);
        group.add(Nonagon);
        group.add(Decagon);

        buttoncenter.add(s);
        buttoncenter.add(Rectangle);
        buttoncenter.add(Circle);
        buttoncenter.add(Square);
        buttoncenter.add(Triangle);
        buttoncenter.add(Trapezoid);
        buttoncenter.add(Parallelogram);
        buttoncenter.add(Pentagon);
        buttoncenter.add(Hexagon);
        buttoncenter.add(Heptagon);
        buttoncenter.add(Octagon);
        buttoncenter.add(Nonagon);
        buttoncenter.add(Decagon);
        add(buttoncenter);

        buttonright = new JPanel ();
        buttonright.setBackground(Color.DARK_GRAY);
        buttonright.setPreferredSize(new Dimension (300, 600));
        add(buttonright);
        
        setLayout(new BorderLayout());
        add(title,BorderLayout.NORTH);  
        add(buttonleft,BorderLayout.WEST);
        add(buttoncenter,BorderLayout.CENTER);
        add(buttonright,BorderLayout.EAST);

    }
    public void actionPerformed (ActionEvent e)
    {
    	if (e.getActionCommand().equals("Circle"))
    	{
    		P_C frame = new P_C();
        	frame.setVisible(true);
        	frame.setSize(1200, 700);
        	frame.setLocation(100, 100);
    	}
    	if (e.getActionCommand().equals("Triangle"))
    	{
    		P_T frame = new P_T();
        	frame.setVisible(true);
        	frame.setSize(1200, 700);
        	frame.setLocation(100, 100);
    	}
    	if (e.getActionCommand().equals("Square"))
    	{
    		P_S frame = new P_S();
        	frame.setVisible(true);
        	frame.setSize(1200, 700);
        	frame.setLocation(100, 100);
    	}
    	if (e.getActionCommand().equals("Rectangle"))
    	{
    		P_R frame = new P_R();
        	frame.setVisible(true);
        	frame.setSize(1200, 700);
        	frame.setLocation(100, 100);
    	}
    	if (e.getActionCommand().equals("Pentagon"))
    	{
    		P_P frame = new P_P();
        	frame.setVisible(true);
        	frame.setSize(1200, 700);
        	frame.setLocation(100, 100);
    	}
    	if (e.getActionCommand().equals("Hexagon"))
    	{
    		P_Hex frame = new P_Hex();
        	frame.setVisible(true);
        	frame.setSize(1200, 700);
        	frame.setLocation(100, 100);
    	}
    	if (e.getActionCommand().equals("Heptagon"))
    	{
    		P_Hept frame = new P_Hept();
        	frame.setVisible(true);
        	frame.setSize(1200, 700);
        	frame.setLocation(100, 100);
    	}
    	if (e.getActionCommand().equals("Octagon"))
    	{
    		P_O frame = new P_O();
        	frame.setVisible(true);
        	frame.setSize(1200, 700);
        	frame.setLocation(100, 100);
    	}
    	if (e.getActionCommand().equals("Nonagon"))
    	{
    		P_N frame = new P_N();
        	frame.setVisible(true);
        	frame.setSize(1200, 700);
        	frame.setLocation(100, 100);
    	}
    	if (e.getActionCommand().equals("Decagon"))
    	{
    		P_D frame = new P_D();
        	frame.setVisible(true);
        	frame.setSize(1200, 700);
        	frame.setLocation(100, 100);
    	}
    	if (e.getActionCommand().equals("Trapezoid"))
    	{
    		P_Tr frame = new P_Tr();
        	frame.setVisible(true);
        	frame.setSize(1200, 700);
        	frame.setLocation(100, 100);
    	}
    	if (e.getActionCommand().equals("Parallelogram"))
    	{
    		P_Pa frame = new P_Pa();
        	frame.setVisible(true);
        	frame.setSize(1200, 700);
        	frame.setLocation(100, 100);
    	}
        
    }
    
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SurfaceAreaShapes extends JFrame implements ActionListener
{
    public static void main (String args[])
    {
        SurfaceAreaShapes content = new SurfaceAreaShapes ();
        
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
    public SurfaceAreaShapes ()
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
    	buttonleft.setPreferredSize(new Dimension (400, 600));
    	
    	JLabel prism = new JLabel ("                                    Prisms                                    ");
    	prism.setFont(new Font ("Century Gothic", Font.BOLD, 20));
        prism.setForeground(new Color (138, 242, 156));
    	
        JRadioButton tp = new JRadioButton ("Triangular Prism");
        tp.setForeground(Color.WHITE);
        tp.setFont(new Font ("Century Gothic", Font.BOLD, 15));
        tp.setOpaque (true);
        tp.setBorderPainted (false);
        tp.setActionCommand("triangularprism");
        tp.addActionListener (this);
        tp.setBackground(Color.DARK_GRAY);
        
        JRadioButton rp = new JRadioButton ("Rectangular Prism");
        rp.setForeground(Color.WHITE);
        rp.setOpaque (true);
        rp.setBorderPainted (false);
        rp.setActionCommand("rectangularprism");
        rp.addActionListener (this);
        rp.setFont(new Font ("Century Gothic", Font.BOLD, 15));
        rp.setBackground(Color.DARK_GRAY);
        
        JRadioButton c = new JRadioButton ("Cube");
        c.setForeground(Color.WHITE);
        c.setFont(new Font ("Century Gothic", Font.BOLD, 15));
        c.setOpaque (true);
        c.setBorderPainted (false);
        c.setActionCommand("cube");
        c.addActionListener (this);
        c.setBackground(Color.DARK_GRAY);
        
        JRadioButton pp = new JRadioButton ("Pentagonal Prism");
        pp.setForeground(Color.WHITE);
        pp.setFont(new Font ("Century Gothic", Font.BOLD, 15));
        pp.setOpaque (true);
        pp.setBorderPainted (false);
        pp.setActionCommand("pentagonalprism");
        pp.addActionListener (this);
        pp.setBackground(Color.DARK_GRAY);
        
        JRadioButton hp = new JRadioButton ("Hexagonal Prism");
        hp.setForeground(Color.WHITE);
        hp.setFont(new Font ("Century Gothic", Font.BOLD, 15));
        hp.setOpaque (true);
        hp.setBorderPainted (false);
        hp.setActionCommand("hexagonalprism");
        hp.addActionListener (this);
        hp.setBackground(Color.DARK_GRAY);
        
        ButtonGroup group1 = new ButtonGroup ();
        group1.add(tp);
        group1.add(rp);
        group1.add(c);
        group1.add(pp);
        group1.add(hp);
        
        buttonleft.add(prism);
        buttonleft.add(tp);
        buttonleft.add(rp);
        buttonleft.add(c);
        buttonleft.add(pp);
        buttonleft.add(hp);
        add(buttonleft);
        
        buttoncenter = new JPanel ();
    	buttoncenter.setBackground(Color.DARK_GRAY);
    	buttoncenter.setPreferredSize(new Dimension (400, 600));
    	
    	JLabel cs = new JLabel ("                                   Circular Shapes                                    ");
    	cs.setFont(new Font ("Century Gothic", Font.BOLD, 20));
        cs.setForeground(new Color (138, 242, 156));
    	
        JRadioButton s = new JRadioButton ("Sphere");
        s.setForeground(Color.WHITE);
        s.setFont(new Font ("Century Gothic", Font.BOLD, 15));
        s.setOpaque (true);
        s.setBorderPainted (false);
        s.setActionCommand("sphere");
        s.addActionListener (this);
        s.setBackground(Color.DARK_GRAY);
        
        JRadioButton cy = new JRadioButton ("Cylinder");
        cy.setForeground(Color.WHITE);
        cy.setOpaque (true);
        cy.setBorderPainted (false);
        cy.setActionCommand("cylinder");
        cy.addActionListener (this);
        cy.setFont(new Font ("Century Gothic", Font.BOLD, 15));
        cy.setBackground(Color.DARK_GRAY);
        
        JRadioButton co = new JRadioButton ("Cone");
        co.setForeground(Color.WHITE);
        co.setFont(new Font ("Century Gothic", Font.BOLD, 15));
        co.setOpaque (true);
        co.setBorderPainted (false);
        co.setActionCommand("cone");
        co.addActionListener (this);
        co.setBackground(Color.DARK_GRAY);
        
        ButtonGroup group2 = new ButtonGroup ();
        group1.add(s);
        group1.add(cy);
        group1.add(co);

        buttoncenter.add(cs);
        buttoncenter.add(s);
        buttoncenter.add(cy);
        buttoncenter.add(co);
        add(buttoncenter);
        
        buttonright = new JPanel ();
        buttonright.setBackground(Color.DARK_GRAY);
        buttonright.setPreferredSize(new Dimension (400, 600));
    	
    	JLabel pyramids = new JLabel ("                                    Pyramids                                    ");
    	pyramids.setFont(new Font ("Century Gothic", Font.BOLD, 20));
    	pyramids.setForeground(new Color (138, 242, 156));
        
        JRadioButton spy = new JRadioButton ("Square Pyramid");
        spy.setForeground(Color.WHITE);
        spy.setOpaque (true);
        spy.setBorderPainted (false);
        spy.setActionCommand("squarepyramid");
        spy.addActionListener (this);
        spy.setFont(new Font ("Century Gothic", Font.BOLD, 15));
        spy.setBackground(Color.DARK_GRAY);
        
        JRadioButton ppy = new JRadioButton ("Pentagonal Pyramid");
        ppy.setForeground(Color.WHITE);
        ppy.setFont(new Font ("Century Gothic", Font.BOLD, 15));
        ppy.setOpaque (true);
        ppy.setBorderPainted (false);
        ppy.setActionCommand("pentagonalpyramid");
        ppy.addActionListener (this);
        ppy.setBackground(Color.DARK_GRAY);
        
        JRadioButton hpy = new JRadioButton ("Hexagonal Pyramid");
        hpy.setForeground(Color.WHITE);
        hpy.setFont(new Font ("Century Gothic", Font.BOLD, 15));
        hpy.setOpaque (true);
        hpy.setBorderPainted (false);
        hpy.setActionCommand("hexagonalpyramid");
        hpy.addActionListener (this);
        hpy.setBackground(Color.DARK_GRAY);
        
        ButtonGroup group3 = new ButtonGroup ();
        group3.add(spy);
        group3.add(ppy);
        group3.add(hpy);
        
        buttonright.add(pyramids);
        buttonright.add(spy);
        buttonright.add(ppy);
        buttonright.add(hpy);
        add(buttonright);
        
        setLayout(new BorderLayout());
        add(title,BorderLayout.NORTH);  
        add(buttonleft,BorderLayout.WEST);
        add(buttoncenter,BorderLayout.CENTER);
        add(buttonright,BorderLayout.EAST);

    }
    public void actionPerformed (ActionEvent e)
    {
    	if (e.getActionCommand().equals("triangularprism"))
    	{
    		SA_TP frame = new SA_TP();
        	frame.setVisible(true);
        	frame.setSize(1200, 700);
        	frame.setLocation(100, 100);
    	}
    	if (e.getActionCommand().equals("cone"))
    	{
    		SA_Co frame = new SA_Co();
        	frame.setVisible(true);
        	frame.setSize(1200, 700);
        	frame.setLocation(100, 100);
    	}
    	if (e.getActionCommand().equals("cube"))
    	{
    		SA_CU frame = new SA_CU();
        	frame.setVisible(true);
        	frame.setSize(1200, 700);
        	frame.setLocation(100, 100);
    	}
    	if (e.getActionCommand().equals("cylinder"))
    	{
    		SA_CY frame = new SA_CY();
        	frame.setVisible(true);
        	frame.setSize(1200, 700);
        	frame.setLocation(100, 100);
    	}
    	if (e.getActionCommand().equals("hexagonalprism"))
    	{
    		SA_HP frame = new SA_HP();
        	frame.setVisible(true);
        	frame.setSize(1200, 700);
        	frame.setLocation(100, 100);
    	}
    	if (e.getActionCommand().equals("hexagonalpyramid"))
    	{
    		SA_HPY frame = new SA_HPY();
        	frame.setVisible(true);
        	frame.setSize(1200, 700);
        	frame.setLocation(100, 100);
    	}
    	if (e.getActionCommand().equals("pentagonalprism"))
    	{
    		SA_PP frame = new SA_PP();
        	frame.setVisible(true);
        	frame.setSize(1200, 700);
        	frame.setLocation(100, 100);
    	}
    	if (e.getActionCommand().equals("pentagonalpyramid"))
    	{
    		SA_PPY frame = new SA_PPY();
        	frame.setVisible(true);
        	frame.setSize(1200, 700);
        	frame.setLocation(100, 100);
    	}
    	if (e.getActionCommand().equals("rectangularprism"))
    	{
    		SA_RP frame = new SA_RP();
        	frame.setVisible(true);
        	frame.setSize(1200, 700);
        	frame.setLocation(100, 100);
    	}
    	if (e.getActionCommand().equals("sphere"))
    	{
    		SA_Sph frame = new SA_Sph();
        	frame.setVisible(true);
        	frame.setSize(1200, 700);
        	frame.setLocation(100, 100);
    	}
    	if (e.getActionCommand().equals("squarepyramid"))
    	{
    		SA_SPY frame = new SA_SPY();
        	frame.setVisible(true);
        	frame.setSize(1200, 700);
        	frame.setLocation(100, 100);
    	}  
    }
    
}
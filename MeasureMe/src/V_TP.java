

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class V_TP extends JFrame implements ActionListener
{
    public static void main (String args[])
    {
        V_TP content = new V_TP ();
        
        JFrame window = new JFrame ("Volume - Triangular Prism");
        window.setContentPane(content);
        window.setBackground(Color.DARK_GRAY);
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize (1200,700);
        window.setLocation (100,100);
        window.setVisible (true);
    }
    JPanel title;
    JPanel data;
    JPanel calculation;
    JPanel diagram;
    JPanel answer;
    JLabel calc;
    JLabel output;
    JTextField a2;
    JTextField b2;
    JTextField c2;
    JTextField h2;
    public V_TP ()
    {
    	title = new JPanel ();
    	title.setBackground(Color.DARK_GRAY);

        JLabel Instruction = new JLabel ("Volume - Triangular Prism");
        Instruction.setFont(new Font ("Century Gothic", Font.BOLD, 28));
        Instruction.setForeground(new Color (138, 242, 156));
        title.add(Instruction);
        add(title);
    	
        data = new JPanel ();
        data.setBackground(Color.DARK_GRAY);
        data.setPreferredSize(new Dimension (400, 600));
        
        JLabel input = new JLabel ("                           Enter the values:                           ");
        input.setFont(new Font ("Century Gothic", Font.BOLD, 20));
        input.setForeground(new Color (138, 242, 156));
        data.add(input);
        
        JLabel a1 = new JLabel ("Value a: ");
        a1.setFont(new Font ("Century Gothic", Font.PLAIN, 15));
        a1.setForeground(new Color (138, 242, 156));
        data.add(a1);
        a2 = new JTextField (28);
        data.add(a2);
        
        JLabel b1 = new JLabel ("Value b: ");
        b1.setFont(new Font ("Century Gothic", Font.PLAIN, 15));
        b1.setForeground(new Color (138, 242, 156));
        data.add(b1);
        b2 = new JTextField (28);
        data.add(b2);
        
        JLabel c1 = new JLabel ("Value c: ");
        c1.setFont(new Font ("Century Gothic", Font.PLAIN, 15));
        c1.setForeground(new Color (138, 242, 156));
        data.add(c1);
        c2 = new JTextField (28);
        data.add(c2);
        
        JLabel h1 = new JLabel ("Value h: ");
        h1.setFont(new Font ("Century Gothic", Font.PLAIN, 15));
        h1.setForeground(new Color (138, 242, 156));
        data.add(h1);
        h2 = new JTextField (28);
        data.add(h2);
        
        JButton calculate = new JButton ("Start Calculation");
        calculate.setFont(new Font ("Century Gothic", Font.BOLD, 15));
        calculate.setBackground(new Color (138, 242, 156));
        calculate.setActionCommand("calculate");
        calculate.addActionListener(this);
        data.add(calculate);
        add(data);
      
        diagram = new JPanel ();
        diagram.setBackground(Color.DARK_GRAY);
        diagram.setPreferredSize(new Dimension (400, 600));
        
        JLabel label = new JLabel ("Diagram");
        label.setFont(new Font ("Century Gothic", Font.BOLD, 20));
        label.setForeground(new Color (138, 242, 156));
        diagram.add(label);
        JLabel image = new JLabel (createImageIcon ("V/V_TriangularPrism.png"));
        diagram.add(image);
        
        add(diagram);
        
        calculation = new JPanel ();
        calculation.setBackground(Color.DARK_GRAY);
        calculation.setPreferredSize(new Dimension (400, 600));
        
        JLabel info = new JLabel ("                                             Calculation                                             ");
        info.setFont(new Font ("Century Gothic", Font.BOLD, 20));
        info.setForeground(new Color (138, 242, 156));
        calculation.add(info);
        
        calc = new JLabel ("This is where the calculations will occur.");
        calc.setFont(new Font ("Century Gothic", Font.PLAIN, 15));
        calc.setForeground(new Color (138, 242, 156));
        calculation.add(calc);
        
        add(calculation);
        
        answer = new JPanel ();
        answer.setBackground(Color.DARK_GRAY);
        answer.setPreferredSize(new Dimension (400, 100));
        
        output = new JLabel ("");
        output.setFont(new Font ("Century Gothic", Font.BOLD, 15));
        output.setForeground(new Color (138, 242, 156));
        answer.add(output);
        
        add(answer);
       
        setLayout(new BorderLayout());
        add(title,BorderLayout.NORTH); 
        add(answer,BorderLayout.SOUTH);
        add(data,BorderLayout.WEST);
        add(diagram,BorderLayout.EAST);
        add(calculation,BorderLayout.CENTER);
    }
    public void actionPerformed (ActionEvent e)
    {
    	if (e.getActionCommand().equals("calculate"))
    	{
    		double a = Double.parseDouble(a2.getText());
    		double b = Double.parseDouble(b2.getText());
    		double c = Double.parseDouble(c2.getText());
    		double h = Double.parseDouble(h2.getText());
    		if (a>0 && b>0 && c>0 && h>0)
    		{
    			double v = 0.25*h*Math.sqrt((-(a*a*a*a)+(2*((a*b)*(a*b)))+(2*((a*c)*(a*c)))-(b*b*b*b)+(2*((b*c)*(b*c)))-(c*c*c*c)));
    		    double answer = Math.round(v);
    		    
    		    calc.setText("<html>Here are the calculations: <br> <br>  V = " + v +" </html>");
    			
    			output.setText("The rounded Volume for this Shape is " + answer + " units squared.");
    		}
    		else 
    		{
    			calc.setText("This is where the calculations will occur.");
    			output.setText("Make sure all the values are entered. They must all be positive numbers)");
    		}
    	}
        
    }
    protected static ImageIcon createImageIcon (String path)
    {
    	java.net.URL imgURL = V_TP.class.getResource(path);
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
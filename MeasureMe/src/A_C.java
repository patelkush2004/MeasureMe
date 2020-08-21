

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class A_C extends JFrame implements ActionListener
{
    public static void main (String args[])
    {
        A_C content = new A_C ();
        
        JFrame window = new JFrame ("Area - Circle");
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
    JTextField r2;

    public A_C ()
    {
    	title = new JPanel ();
    	title.setBackground(Color.DARK_GRAY);

        JLabel Instruction = new JLabel ("Area - Circle");
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
        
        JLabel r1 = new JLabel ("Value r: ");
        r1.setFont(new Font ("Century Gothic", Font.PLAIN, 15));
        r1.setForeground(new Color (138, 242, 156));
        data.add(r1);
        r2 = new JTextField (28);
        data.add(r2);
        
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
        JLabel image = new JLabel (createImageIcon ("/A/A_Circle.png"));
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
    		double r = Double.parseDouble(r2.getText());
    		
    			if (r>0)
    			{
    				double area = Math.round(r*r*Math.PI);
    				calc.setText("<html>Here are the calculations: <br> <br> A = PI*r^2 <br> <br> A = PI(" + r + "*" + r + ") <br><br> A =" + area + " </html>");
    				output.setText("The rounded Area for this Shape is " + area + " units squared.");
        		}
        		else 
        		{
        			calc.setText("This is where the calculations will occur.");
        			output.setText("Make sure all the values are entered. They must all be positive numbers");
        		}
    			
    	}
        
    }
    protected static ImageIcon createImageIcon (String path)
    {
    	java.net.URL imgURL = A_C.class.getResource(path);
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
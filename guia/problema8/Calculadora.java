import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Calculadora extends JPanel {
    JTextField n1,n2;
    JButton sum,minus,mul,div;
    JLabel res;
    public Calculadora(){
	
	n1 = new JTextField("numero 1");
	n2 = new JTextField("numero 2");
    
	sum = new JButton("+");
	minus = new JButton("-");
	mul = new JButton("*");
	div = new JButton("/");
	
	res = new JLabel("0");

	setLayout(new FlowLayout());

	add(n1);
	add(n2);

	add(sum);
	add(minus);
	add(mul);
	add(div);

	add(res);
    
	sum.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		float a = Float.parseFloat(n1.getText());
		float b = Float.parseFloat(n2.getText());
		float c = a+b;
		res.setText(String.valueOf(c));

	    }
	});
 
	minus.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		float a = Float.parseFloat(n1.getText());
		float b = Float.parseFloat(n2.getText());
		float c = a-b;
		res.setText(String.valueOf(c));

	    }
	});
 
	mul.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		float a = Float.parseFloat(n1.getText());
		float b = Float.parseFloat(n2.getText());
		float c = a*b;
		res.setText(String.valueOf(c));

	    }
	});
 
	div.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		float a = Float.parseFloat(n1.getText());
		float b = Float.parseFloat(n2.getText());
		float c = a/b;
		res.setText(String.valueOf(c));

	    }
	});




    }
}




import javax.swing.*;
import java.awt.event.*;
import java.awt.GridLayout;
import java.awt.*; 

public class Problema4 extends JFrame implements ActionListener
{

 private JTextField txtfld1;
 private JLabel lbl1,lbl2;
 private JButton btn;
 private int dias,horas;
 private String s = new String();

 public Problema4()
 {

  setLayout(null);

  txtfld1 = new JTextField();
  txtfld1.setBounds(10,17,100,30);
  add(txtfld1);

  lbl1 = new JLabel("Dias");
  lbl1.setBounds(260,17,150,20);
  add(lbl1);

  lbl2 = new JLabel("Horas");
  lbl2.setBounds(410,17,150,20);
  add(lbl2);
  
 
  btn = new JButton("Submit");
  btn.setBounds(560,17,100,30);
  add(btn);
  btn.addActionListener(this);

 }

 public void actionPerformed(ActionEvent evBoton){
  if(evBoton.getSource() == btn)
  {
    String texto1 = txtfld1.getText();
    horas = Integer.parseInt(texto1) / 60;
    s = "" + horas + "horas";
    lbl2.setText(s);
    dias = horas / 24;
    s = "" + dias + "dias";
    lbl1.setText(s);
  }
} 

 public static void main(String args[]){
  Problema4 calc1 = new Problema4();
  calc1.setBounds(0,0,750,150);
  calc1.setVisible(true);
  calc1.setResizable(false);
  calc1.setLocationRelativeTo(null);
  calc1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
 }
}
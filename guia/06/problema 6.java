import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Problema6ap extends Applet implements ActionListener{ 

 private TextField txtfld1,txtfld2;
 private Label lbl1;
 private Button btn;

public void init() {
  
  txtfld1 = new TextField();
  txtfld1.setBounds(10,17,100,30);
  add(txtfld1);

  txtfld2 = new TextField();
  txtfld2.setBounds(120,17,150,30);
  add(txtfld2);

  btn = new Button("Submit");
  btn.setBounds(280,17,150,30);
  add(btn);
  btn.addActionListener(this);

  lbl1 = new Label("Son iguales?");
  lbl1.setBounds(440,17,100,30);
  add(lbl1);
  setBounds(0,0,750,150);
  setVisible(true);
 }

 public void actionPerformed(ActionEvent e){
  if(e.getSource() == btn)
  {
    String texto1 = txtfld1.getText();
    String texto2 = txtfld2.getText();
      if(texto1.equals(texto2))
            lbl1.setText("Son iguales");
      else
            lbl1.setText("No son iguales");
  }
} 

 
}
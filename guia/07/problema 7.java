import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Problema7ap extends Applet implements ActionListener{ 

 private LocalDateTime locaDate = LocalDateTime.now();
 private TextField txtfld1;
 private Label lbl1;
 private Button btn;
 private int annio = locaDate.getYear();;

public void init() {

  txtfld1 = new TextField();
  txtfld1.setBounds(10,17,100,30);
  add(txtfld1);

  btn = new Button("Submit");
  btn.setBounds(280,17,150,30);
  add(btn);
  btn.addActionListener(this);

  lbl1 = new Label("Moriras en el año");
  lbl1.setBounds(440,17,100,30);
  add(lbl1);
  setBounds(0,0,750,150);
  setVisible(true);
 }

 public void actionPerformed(ActionEvent e){
  if(e.getSource() == btn)
  {
    String texto1 = txtfld1.getText();
    int edad=Integer.parseInt(texto1);
    edad=77-edad;
    annio= annio+edad;
    lbl1.setText("El anio de tu muerte es: "+annio);
  }
} 

 
}
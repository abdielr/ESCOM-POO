import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Problema9ap extends Applet implements ActionListener {
    
    private TextField txtfld1,txtfld2,txtfld3;
    private Label lbl1;
    private Button btn;

    public void init() {

        txtfld1 = new TextField();
        txtfld1.setBounds(110,17,150,20);
        add(txtfld1);

        txtfld2 = new TextField();
        txtfld2.setBounds(260,17,150,20);
        add(txtfld2);

        txtfld3 = new TextField();
        txtfld3.setBounds(410,17,150,20);
        add(txtfld3);

        lbl1 = new Label("El mayor es");
        lbl1.setBounds(10,17,100,30);
        add(lbl1);

        btn = new Button("Submit");
        btn.setBounds(560,17,100,30);
        add(btn);
        btn.addActionListener(this);

        setBounds(0,0,750,150);
        setVisible(true);
  
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn){
            String texto1 = txtfld1.getText();
            String texto2 = txtfld2.getText();
            String texto3 = txtfld3.getText();
            double i,j,k;
            i=Integer.parseInt(texto1);
            j=Integer.parseInt(texto2);
            k=Integer.parseInt(texto3);
            

            if (i > j) {
                if (i > k) {
                    lbl1.setText("El mayor es: " + i);                                             
                } else {
                    lbl1.setText("El mayor es: " +k);     
                }
            } else if (j > k) {
                lbl1.setText("El mayor es: " +j);
            } else {
                lbl1.setText("El mayor es: " +k);
            }
        }
    }

}
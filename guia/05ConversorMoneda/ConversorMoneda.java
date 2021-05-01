import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class ConversorMoneda extends Applet implements ActionListener {
    Button btnDolar, btnPesos;
    TextField txtFactor, txtCantidad;
    
    public void init() {
        btnDolar = new Button("Pesos a Dolares");
        btnPesos = new Button("Dolares a Pesos");
        txtFactor = new TextField();
        txtCantidad = new TextField();
        btnDolar.addActionListener(this);
        btnPesos.addActionListener(this);
        add(txtCantidad); add(btnDolar); add(btnPesos); add(txtFactor);
    }

    public void actionPerformed(ActionEvent e) {
        int cantidad = Integer.parseInt(txtCantidad.getText());
        int factor = Integer.parseInt(txtFactor.getText());
        Button btn = (Button) e.getSource();
        if (btn == btnDolar)
            txtCantidad.setText("" + cantidad/factor);
        else
            txtCantidad.setText("" + cantidad*factor);
    }
}
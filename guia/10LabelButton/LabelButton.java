import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class LabelButton extends Applet implements ActionListener {
    Button btnManzana, btnLimon, btnNaranja;
    Label l;

    public void init() {
        btnManzana = new Button("Manzana");
        btnLimon = new Button("Limon");
        btnNaranja = new Button("Naranja");
        l = new Label();
        btnManzana.addActionListener(this);
        btnNaranja.addActionListener(this);
        btnLimon.addActionListener(this);
        l.setSize(80, 20);
        add(btnManzana); add(btnLimon); add(btnNaranja); add(l);
    }

    public void actionPerformed(ActionEvent e){
        Button btn = (Button) e.getSource();
        l.setText(btn.getLabel());
    }
}
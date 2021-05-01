import java.applet.Applet;
import java.awt.Graphics;
  
// HelloWorld class extends Applet
public class Main extends Applet {
    public void init(){
	Calculadora c = new Calculadora();
	add(c);
    }
}

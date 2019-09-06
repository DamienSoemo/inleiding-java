package h04;
import java.awt.*;
import java.applet.*;

public class Tekenen3 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.yellow);
        g.setColor(Color.red);
        g.fillRect(20,30,120,30);
        g.setColor(Color.white);
        g.fillRect(20,60,120,30);
        g.setColor(Color.BLUE);
        g.fillRect(20,90,120,30);
        g.setColor(Color.white);
        g.fillRect(15,30,5,150);
    }
}


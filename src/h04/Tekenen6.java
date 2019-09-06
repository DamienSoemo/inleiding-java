package h04;

import java.awt.*;
import java.applet.*;

public class Tekenen6 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.fillRoundRect(150, 20, 80, 160, 50, 50);
        g.setColor(Color.red);
        g.fillArc(170, 40, 40, 40, 0, 360);
        g.setColor(Color.yellow);
        g.fillArc(170, 80, 40, 40, 0, 360);
        g.setColor(Color.green);
        g.fillArc(170, 120, 40,40 , 0, 360);
        g.setColor(Color.black);
        g.fillRect(180,160,20,80);
    }
}

package h04;

import java.awt.*;
import java.applet.*;

public class Tekenen2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawRect(40, 80, 80, 100);
        g.drawRect(45, 130, 30, 50);
        g.drawRect(85, 130, 30, 30);
        g.drawLine(40, 80, 80, 40);
        g.drawLine(80, 40, 120, 80);

    }
}
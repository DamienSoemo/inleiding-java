package h04;

import java.awt.*;
        import java.applet.*;

public class Tekenen extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(200, 30, 30, 200);
        g.drawLine(200, 30, 370, 200);
        g.drawLine(30, 200, 370, 200);
    }
}
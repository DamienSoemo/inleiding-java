package h11;

import java.awt.*;
import java.applet.*;


public class Herhaling1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int teller;
        int x = 0;

        for (teller = 0; teller < 11; teller++) {
            x += 20;
            g.drawLine(x, 40, x, 300);
            g.drawString("" + teller, x, 35);
        }
    }
}
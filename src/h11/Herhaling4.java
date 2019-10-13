package h11;

import java.applet.Applet;
import java.awt.*;

public class Herhaling4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {

        int teller = 1;
        int y = 10;
        int x = 80;


        while (teller < 11) {
            y += 20;
            g.drawString("" + teller* 3, x, y);
            teller++;

        }
    }


}
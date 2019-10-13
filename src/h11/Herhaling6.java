package h11;

import java.applet.Applet;
import java.awt.*;

public class Herhaling6 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {

        int teller;
        int x = 0;
        int y = 0;
        int x2 = 40;
        int y2 = 40;

        for (teller = 0; teller < 5; teller++) {

            x +=3;
            y +=3;
            x2 -= 6;
            y2 -= 6;

            g.drawOval(x, y, x2, y2);
        }


    }
}
package h11;

import java.applet.Applet;
import java.awt.*;

public class Herhaling8 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {

        int teller;
        int y = 0;
        int x = 0;
        int y2 = 500;
        int x2 = 500;

        for (teller = 0; teller < 100; teller++) {

            x += 8;
            y += 8;
            x2 -= 4;
            y2 -= 4;
            g.drawOval(x2, y2, x, y);

        }

    }
}


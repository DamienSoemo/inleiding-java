package h11;

import java.awt.*;
import java.applet.*;

public class Herhaling2 extends Applet {


    public void init() {
    }

    public void paint(Graphics g) {
        int teller;
        int x = 0;

        for (teller = 10; teller < 21; teller++) {
            x += 20;
            g.drawString("" + teller, x, 35);
        }
    }
}


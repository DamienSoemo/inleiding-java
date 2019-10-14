package h06;

import java.awt.*;
import java.applet.*;


public class Getallen2 extends Applet {
    int a;
    int b;
    int c;
    int d;
    int uitwerking;
    int uitwerking2;
    int uitwerking3;

    public void init() {

        a = 60;
        b = 24;
        c = 365;
        d = 60;
        uitwerking = a * d;
        uitwerking2 = a * b * d;
        uitwerking3 = a * b * c * d;

    }

    public void paint(Graphics g) {

        g.drawString("Een uur heeft  " + uitwerking +
                " secondes.", 50, 60);

        g.drawString("Een dag heeft  " + uitwerking2 + " secondes.", 50, 80);

        g.drawString("Een jaar heeft  " + uitwerking3 + " secondes.", 50, 100);

    }

}
package h06;

import java.awt.*;
import java.applet.*;


public class Getallen1 extends Applet {
    int getal1;
    int getal2;
    int uitkomst;

    public void init() {
        getal1 = 113;
        getal2 = 4;
        uitkomst = getal1 / getal2;
    }

    public void paint(Graphics g) {
        g.drawString("Jan: " + uitkomst, 20, 20);
        g.drawString("Ali:" + uitkomst, 20, 40);
        g.drawString("Jeanetta:" + uitkomst, 20, 60);
        g.drawString("Damiën:" + uitkomst, 20, 80);

    }

}
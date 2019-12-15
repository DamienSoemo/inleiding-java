package h13;

import java.awt.*;
import java.applet.*;

public class Methodes2 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {

        setSize(500, 400);

        int x, y, width, height;

        y= 25;
        width = 50;
        height = 25;

        g.setColor(Color.red);
        g.fillRect(50, 75, 400, 200);

        for (int Stenen = 0; Stenen < 4; Stenen++) {
            x = 50;
            y += 25;
            for (int MeerStenen = 0; MeerStenen < 8; MeerStenen++) {
                g.setColor(Color.red);
                g.fillRect(x, y, width, height);
                g.setColor(Color.white);
                g.drawRect(x, y, width, height);
                x += width;


            }

            x = 25;
            y += 25;
            for (int kolom = 0; kolom < 8; kolom++) {
                g.setColor(Color.red);
                g.fillRect(x, y, width, height);
                g.setColor(Color.white);
                g.drawRect(x, y, width, height);
                x += width;

            }
        }
    }
}

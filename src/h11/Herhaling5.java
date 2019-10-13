package h11;

import java.applet.Applet;
import java.awt.*;

public class Herhaling5 extends Applet {


    public void init() {

    }

    public void paint(Graphics g) {

        int teller = 0;
        int y = 20;
        int x = 20;


        while (teller < 6) {
            g.drawRect(20,y,20,x);
            g.drawRect(40, y*2, 20, x);
            g.drawRect(60, y*3, 20, x);
            g.drawRect(80, y*4, 20, x);
            g.drawRect(100, y*5, 20, x);

        }

    }


}

package h11;

import java.applet.Applet;
import java.awt.*;

public class Herhaling3 extends Applet {

    public void init() {

    }



    public void paint(Graphics g) {

        int y = 0;
        int S1 = 0;
        int S2 = 1;
        int som = S1 + S2;





        for(int teller=0; teller<20; teller++){

            y += 20;
            g.drawString(som + "",50,y);
            S1 = S2;
            S2 = som;
            som = S1 + S2;

        }

    }

}
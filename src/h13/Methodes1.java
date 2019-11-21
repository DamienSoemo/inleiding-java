package h13;

import java.applet.Applet;
import java.awt.*;

public class Methodes1 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {

      tekenDriehoek(20,200,200,20,20,20);

    }

    void tekenDriehoek(int x1, int y1, int x2, int y2, int x3, int y3) {

        getGraphics().drawLine(x1,y1,x2,y2);
        getGraphics().drawLine(x2,y2,x3,y3);
        getGraphics().drawLine(x1,y1,x3,y3);

    }

}

package h04;

import java.awt.*;
import java.applet.*;

public class Tekenen7 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {

    setBackground(Color.white);
    g.setColor(Color.black);
    g.drawRoundRect(20,20,100,100,10,10);
g.setColor(Color.black);
    g.fillArc(40,40 ,25,25, 0,360);
g.setColor(Color.black );
    g.fillArc(80,80,25,25,0,360);
g.setColor(Color.black);
g.fillArc(80,40,25,25,0,360);
g.setColor(Color.BLACK);
g.fillArc(40,80,25,25,0,360);

 }
}
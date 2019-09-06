package h04;

import java.awt.*;
import java.applet.*;

public class Tekenen8 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
setBackground(Color.white);
      g.setColor(Color.BLACK);
       g.drawLine(20,40,120,40);
       g.setColor(Color.black);
       g.drawString("Lijn", 60,60);
       g.drawRect(20,80,100,60);
        g.drawString("rechthoek",45,160);
        g.drawRoundRect(20, 180, 100,60,20,20);
        g.drawString("Afgeronde driehoek", 20, 260);
        g.setColor(Color.magenta);
        g.fillRoundRect(140,80,160,60,0,0);
        g.setColor(Color.black);
        g.drawArc(140,80,160,60,0,360);
        g.drawString("Gevulde rechthoek met ovaal",140,160);
        g.setColor(Color.magenta);
        g.fillArc(320,80,160,60,0,60);
        g.setColor(Color.BLACK);
        g.drawArc(320,80,160,60,0,360);
        g.drawString("Taartpunt met ovaal er omheen", 320, 160);
        g.setColor(Color.magenta);
        g.fillArc(140,180,160,60,0,360);
       g.setColor(Color.BLACK);
        g.drawString("Gevulde ovaal",180,260);
        g.drawOval(370,180,60,60);
        g.drawString("Cirkel",385,260);



    }
}
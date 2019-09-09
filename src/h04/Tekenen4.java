package h04;

import java.awt.*;
import java.applet.*;

public class Tekenen4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.drawLine(60,190,225,190);
        g.drawLine(60,170,225,170);
        g.drawLine(60,150,225,150);
        g.drawLine(60,130,225,130);
        g.drawLine(60,110,225,110);
        g.drawLine(60,90,225,90);
        g.setColor(Color.yellow);
        g.fillRect(60,150,40,40);
        g.setColor(Color.red);
        g.fillRect(120,90,40,100);
        g.setColor(Color.BLUE);
        g.fillRect(180,110,40,80);
        g.setColor(Color.black);
        g.drawString("Valerie",60, 215);
        g.setColor(Color.black);
        g.drawString("Jeroen",120,215);
        g.setColor(Color.black);
        g.drawString("Hans",180, 215);
        g.setColor(Color.BLACK);
        g.drawString("0Kg",25,190);
        g.setColor(Color.black);
        g.drawString("20Kg",20,170);
        g.setColor(Color.black);
        g.drawString("40Kg",20, 150);
        g.setColor(Color.black);
        g.drawString("60Kg",20,130);
        g.setColor(Color.black);
        g.drawString("80Kg",20, 110);
        g.drawString("100kg",15,90);
        g.drawLine(60,90,60,190);
    }


}
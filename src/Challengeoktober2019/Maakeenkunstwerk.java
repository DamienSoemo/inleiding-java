package Challengeoktober2019;

import java.applet.Applet;
import java.awt.*;

public class Maakeenkunstwerk extends Applet {

    public void init() {


    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.black);
        g.fillRect(300,320,60,100);
        g.setColor(Color.yellow);
        g.fillRect(440,400,60,100);
        g.setColor(Color.white);
        g.fillRect(180,350,240,150);
        g.setColor(Color.blue);
        g.fillRect(20,350,140,150);
        g.setColor(Color.white);
        g.fillRect(20,180,140,150);
        g.setColor(Color.white);
        g.fillRect(20,10,140,150);
        g.setColor(Color.red);
        g.fillRect(180,10,320,320);
    }

}

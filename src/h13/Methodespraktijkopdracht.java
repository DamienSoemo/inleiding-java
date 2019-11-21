package h13;

import java.applet.Applet;
import java.awt.*;

public class Methodespraktijkopdracht extends Applet{

    int x1 = 50;
    int y1 = 50;

    public void init() {


        setSize(1000, 850);

    }

    public void paint(Graphics g) {
        x1 = 150;
        for (int a = 0; a < 3; a++) {
            for (int b = 0; b < 5; b++) {
                tekenstam(g, x1, y1, 40, 100);

                x1 += 150;
            }

            x1 = 150;
            y1 += 250;

        }
    }

    void tekenstam( Graphics g, int x1, int y1, int width, int height){
        g.setColor(Color.yellow);
        g.fillRect( x1, y1 + height, width, height);
        g.setColor(Color.green);
        g.fillOval(x1 - width, y1, width * 3, height);

    }
}

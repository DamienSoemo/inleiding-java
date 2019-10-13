package h11;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Herhalingpraktijkopdracht extends Applet {

    TextField input1;
    Button oke;
    int getal;
    int pm = 0;

    public void init() {

        input1 = new TextField("", 10);
        oke = new Button("ok");
        oke.addActionListener(new OkListener());
        add(input1);
        add(oke);
    }

    public void paint(Graphics g) {

        if(pm == 1) {
            int x = 10;
            int y = 60;
            g.drawString("Tafel van "+getal, x, y);

            for(int i = 1; i < 11; i++) {
                y += 15;
                g.drawString(i+" x "+getal+" = "+(getal*i), x, y);

            }

        }

        else
            g.drawString("Tik een getal in", 30, 60);
    }


    class OkListener implements ActionListener {

        public void actionPerformed(ActionEvent a) {
            int tempgetal = Integer.parseInt(input1.getText());

            getal = tempgetal;
            pm = 1;
            repaint();

        }
    }
}


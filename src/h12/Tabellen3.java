package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Tabellen3 extends Applet {

    Button knopOke;
    TextField tekstvak;
    String[] cijfers = { "1","2","3","4","5","6","7","8","9","10"};

    public void init() {
        Arrays.sort(cijfers);

        tekstvak = new TextField("", 5);
        add(tekstvak);

        knopOke = new Button("Oke");
        knopOke.addActionListener(new KnopListenerOke());
        add(knopOke);
    }

    public void paint(Graphics g) {

        for(int teller = 0; teller < cijfers.length; teller ++) {
            g.drawString("" + cijfers [teller], 50, 20 * teller + 20);
        }

    }








    private class KnopListenerOke implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }
}



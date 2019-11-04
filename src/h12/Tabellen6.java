package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tabellen6 extends Applet {

    TextField label;
    Button OkKnop;
    int hoeveelheid;

    boolean gevonden = false;
    boolean geklikt = false;

    double[] cijfers = {1, 2, 2, 2, 3 ,4, 4, 5, 7, 8, 8, 9, 10, 10};

    public void init() {

        label = new TextField(10);
        label.addActionListener(new labelListener());
        add(label);

        OkKnop = new Button("Ok");
        OkKnop.addActionListener(new OkListener());
        add(OkKnop);

    }

    public void paint(Graphics g) {

        if (geklikt) {
            if (gevonden) {

                g.drawString("De waarde is " + hoeveelheid + " keer gevonden", 100, 50);
            } else {

                g.drawString("De waarde komt niet voor.", 20, 80);
            }
        }
    }

    class OkListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            geklikt = true;

            String s = label.getText();
            int Textin = Integer.parseInt(s);


            int teller = 0;
            hoeveelheid = 0;
            while (teller < cijfers.length) {
                if (cijfers[teller] == Textin) {
                    gevonden = true;
                }
                if (cijfers [teller] == Textin){
                    hoeveelheid +=1;
                }
                teller++;
            }
            repaint();

        }
    }

    class labelListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {


        }
    }
}
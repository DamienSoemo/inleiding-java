package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tabellen5 extends Applet {

    TextField tf;
    Button button;
    boolean isGevonden;

    int index;
    int[] getallen = new int[]{4, 6, 8, 5, 55, 60};

    public void init() {
        tf = new TextField(10);
        add(tf);

        button = new Button("Oke");
        button.addActionListener((ActionListener) this);
        add(button);


    }


    public void paint(Graphics g) {

        if (isGevonden) {
            g.drawString("De waarde is gevonden op index" + index, 50, 60);
        } else {
            g.drawString("De waarde is niet gevonden", 50, 60);
        }

    }

    public void actionPerformed(ActionEvent e) {
        int input = Integer.parseInt(tf.getText());

        for (int i = 0; i < getallen.length; i++) {
            if (getallen[i] == input) {
                isGevonden = true;
                index = i;
            }


        }
        repaint();

    }


}

package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tabellen4 extends Applet implements ActionListener {

    TextField tf;
    Button button;
    boolean isGevonden;
    boolean isGeklikt;

    int index;

    int[] getallen = new int[]{4, 6, 8, 5, 55, 60};

    public void init() {
      tf = new TextField(10);
      add(tf);

      button = new Button("Oke");
      button.addActionListener( this);
      add(button);

    }

    public void paint(Graphics g) {
        if (isGeklikt)
        if (isGevonden) {
            g.drawString("De waarde is gevonden op index" + index, 50, 60);
        }else{
            g.drawString("De waarde is niet gevonden", 50, 60);
        }

    }

    public void actionPerformed(ActionEvent e) {
         isGevonden = false;
        int input = Integer.parseInt(tf.getText());
         isGeklikt = true;
        for (int i = 0; i < getallen.length; i++) {
            if (getallen[i] == input) {
                isGevonden = true;
                index = i;
            }


            }
          repaint();
        }

    }



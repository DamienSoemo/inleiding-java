package h08;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Knt1 extends Applet {
    // Globaal
    TextField tekstvak;
    Button KnopOke;
    Button KnopReset;
    String message;


    public void init() {


        tekstvak = new TextField(20);
        tekstvak.addActionListener(new KnopOkelisterner());
        add(tekstvak);

        KnopOke = new Button("Oke");
        KnopOke.addActionListener(new KnopOkelisterner());
        add(KnopOke);

        KnopReset = new Button("Reset");
        KnopReset.addActionListener(new KnopResetlisterner());
        add(KnopReset);

        message = "Er is nog niets getypt.";

    }

    public void paint(Graphics g) {
        g.drawString(message, 20, 40);

    }

    class KnopOkelisterner implements ActionListener {


        public void actionPerformed(ActionEvent e) {
            message = tekstvak.getText();
            repaint();
        }
    }

    class KnopResetlisterner implements ActionListener {


        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
        }
    }

}
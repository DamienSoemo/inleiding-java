package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Kntpraktijkopdracht extends Applet {
    TextField tekstvak;
    TextField tekstvak2;
    Label label;
    double getal;
    Button knopkeer;
    Button knopdelen;
    Button knopmin;
    Button knopplus;

    public void init() {

        tekstvak = new TextField("", 10);
        label = new Label("");
        add(label);
        add(tekstvak);

        tekstvak2 = new TextField("", 10);
        label = new Label("");
        add(label);
        add(tekstvak2);

        Button knopkeer = new Button("*");
        knopkeerListener kk = new knopkeerListener();
        knopkeer.addActionListener(kk);
        add(knopkeer);

        Button knopdelen = new Button("/");
        knopdelenListener kd = new knopdelenListener();
        knopdelen.addActionListener(kd);
        add(knopdelen);

        Button knopmin = new Button("-");
        knopminListener km = new knopminListener();
        knopmin.addActionListener(km);
        add(knopmin);

        Button knopplus = new Button("+");
        knopplusListener kp = new knopplusListener();
        knopplus.addActionListener(kp);
        add(knopplus);

    }

    public void paint(Graphics g) {

    }

    class knopkeerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double vak1 = Double.parseDouble(tekstvak.getText());
            double vak2 = Double.parseDouble(tekstvak2.getText());
            getal = (vak1 * vak2);
            tekstvak.setText("" + getal);
            tekstvak2.setText("");
            repaint();
        }
    }


    class knopdelenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double vak1 = Double.parseDouble(tekstvak.getText());
            double vak2 = Double.parseDouble(tekstvak2.getText());
            getal = (vak1 / vak2);
            tekstvak.setText("" + getal);
            tekstvak2.setText("");
            repaint();
        }
    }

    class knopplusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double vak1 = Double.parseDouble(tekstvak.getText());
            double vak2 = Double.parseDouble(tekstvak2.getText());
            getal = (vak1 + vak2);
            tekstvak.setText("" + getal);
            tekstvak2.setText("");
            repaint();

        }
    }


    class knopminListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double vak1 = Double.parseDouble(tekstvak.getText());
            double vak2 = Double.parseDouble(tekstvak2.getText());
            getal = (vak1 - vak2);
            tekstvak.setText("" + getal);
            tekstvak2.setText("");
            repaint();

        }


    }
}
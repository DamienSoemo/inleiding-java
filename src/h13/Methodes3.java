package h13;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Methodes3 extends Applet {
    Button knopBeton;
    Button knopBak;
    int counter = 0;

    public void init() {


        setSize(600, 500);
        knopBeton = new Button("Beton");
        knopBetonListener kBL = new knopBetonListener();
        knopBeton.addActionListener(kBL);
        add(knopBeton);

        knopBak = new Button("Baksteen");
        knopBaksteenListener kBaL = new knopBaksteenListener();
        knopBak.addActionListener(kBaL);
        add(knopBak);

    }


    public void paint(Graphics g) {
        if (counter == 1) {
            Baksteen(g);
        }
        if (counter == 2) {
            Beton(g);
        }


    }


    void Beton(Graphics g) {
        int x, y, width, height;

        y = 60;
        width = 60;
        height = 35;


        for (int Stenen = 0; Stenen < 4; Stenen++) {
            x = 60;
            y += 35;
            for (int MeerStenen = 0; MeerStenen < 8; MeerStenen++) {
                g.setColor(Color.gray);
                g.fillRect(x, y, width, height);
                g.setColor(Color.white);
                g.drawRect(x, y, width, height);

                x += width;
            }
            x = 30;
            y += 35;
            for (int kolom = 0; kolom < 8; kolom++) {
                g.setColor(Color.gray);
                g.fillRect(x, y, width, height);
                g.setColor(Color.white);
                g.drawRect(x, y, width, height);
                x += width;


            }
        }
    }


    void Baksteen(Graphics g) {

        int x, y, width, height;

        y = 50;
        width = 50;
        height = 25;

        for (int Stenen = 0; Stenen < 4; Stenen++) {
            x = 50;
            y += 25;
            for (int MeerStenen = 0; MeerStenen < 8; MeerStenen++) {
                g.setColor(Color.red);
                g.fillRect(x, y, width, height);
                g.setColor(Color.white);
                g.drawRect(x, y, width, height);
                x += width;

            }

            x = 25;
            y += 25;
            for (int kolom = 0; kolom < 8; kolom++) {
                g.setColor(Color.red);
                g.fillRect(x, y, width, height);
                g.setColor(Color.white);
                g.drawRect(x, y, width, height);
                x += width;

            }
        }
    }


    class knopBetonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            counter = 2;
            repaint();


        }
    }


    class knopBaksteenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            counter = 1;
            repaint();

        }
    }
}

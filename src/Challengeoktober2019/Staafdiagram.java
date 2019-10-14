package Challengeoktober2019;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Staafdiagram extends Applet {

    int Valerie;
    int Jeroen;
    int Hans;
    int hoogteXas;
    int hoogteYas;


    TextField tekstvakValerie;
    TextField tekstvakJeroen;
    TextField tekstvakHans;

    Button knopToon;
    Label labelValerie;
    Label labelJeroen;
    Label labelHans;


    public void init() {

        Valerie = 40;
        hoogteXas = 190;
        Jeroen = 100;
        Hans = 80;
        hoogteYas = 120;


        labelValerie = new Label("Valerie");
        add(labelValerie);
        tekstvakValerie = new TextField("", 5);
        add(tekstvakValerie);

        labelJeroen = new Label("Jeroen");
        add(labelJeroen);
        tekstvakJeroen = new TextField("", 5);
        add(tekstvakJeroen);

        labelHans = new Label("Hans");
        add(labelHans);
        tekstvakHans = new TextField("", 5);
        add(tekstvakHans);


        // Knop
        knopToon = new Button();
        knopToonListener kp = new knopToonListener();
        knopToon.addActionListener(kp);
        knopToon.setLabel("Toon");
        add(knopToon);

    }

    public void paint(Graphics g) {

        // Horizontale as
        g.drawLine(60, hoogteXas, 225, hoogteXas);

        // Lijnen
        g.drawLine(60, 170, 225, 170);
        g.drawLine(60, 150, 225, 150);
        g.drawLine(60, 130, 225, 130);
        g.drawLine(60, 110, 225, 110);
        g.drawLine(60, 90, 225, 90);

        //Valerie
        g.setColor(Color.red);
        g.fillRect(60, hoogteXas - Valerie, 40, Valerie);

        //Jeroen
        g.setColor(Color.red);
        g.fillRect(120, hoogteXas - Jeroen, 40, Jeroen);

        //Hans
        g.setColor(Color.red);
        g.fillRect(180, hoogteXas - Hans, 40, Hans);
        g.setColor(Color.black);

        // Namen


        g.drawString("Valerie", 60, 215);
        g.drawString("Jeroen", 120, 215);
        g.drawString("Hans", 180, 215);

        // Kg

        g.drawString("0Kg", 25, 190);
        g.drawString("20Kg", 20, 170);
        g.drawString("40Kg", 20, 150);
        g.drawString("60Kg", 20, 130);
        g.drawString("80Kg", 20, 110);
        g.drawString("100kg", 15, 90);

        // Vertical as
        g.drawLine(60, 90, 60, hoogteXas);
    }

    class knopToonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Valerie = Integer.parseInt(tekstvakValerie.getText());
            Jeroen = Integer.parseInt(tekstvakJeroen.getText());
            Hans = Integer.parseInt(tekstvakHans.getText());
            Valerie*=1;
            Jeroen*=1;
            Hans*=1;
            repaint();

        }
    }



        }



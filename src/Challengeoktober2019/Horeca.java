package Challengeoktober2019;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


public class Horeca extends Applet {
    Button knopdrinken;
    Button knopgedistilleerd;
    Button knopnieuw;
    double totaal;
    double bestelling;
    double fris;
    double bier;
    double wijn;
    double koffie;
    double binnen;
    double buiten;
    double nieuw;

    public void init() {
         fris = 2.25;
         bier = 2.50;
         wijn = 2.75;
         koffie = 2;
         binnen = 3;
         buiten = 3.75;
         nieuw = 0;

        knopdrinken = new Button("Fris");
        knopfrisListener kf = new knopfrisListener();
        knopdrinken.addActionListener(kf);
        add(knopdrinken);

        knopdrinken = new Button("Bier");
        knopbierListener kb = new knopbierListener();
        knopdrinken.addActionListener(kb);
        add(knopdrinken);

        knopdrinken = new Button("Wijn");
        knopwijnListener kw = new knopwijnListener();
        knopdrinken.addActionListener(kw);
        add(knopdrinken);

        knopdrinken = new Button("Koffie");
        knopkoffieListener kk = new knopkoffieListener();
        knopdrinken.addActionListener(kk);
        add(knopdrinken);

        knopgedistilleerd = new Button("Binn gedist.");
        knopbinnelandsegesdistilleerdListener kbg = new knopbinnelandsegesdistilleerdListener();
        knopgedistilleerd.addActionListener(kbg);
        add(knopgedistilleerd);

        knopgedistilleerd = new Button("Buit. gedist.");
        knopbuitenlandsegesdistilleerdListener kbu = new knopbuitenlandsegesdistilleerdListener();
        knopgedistilleerd.addActionListener(kbu);
        add(knopgedistilleerd);

        knopnieuw = new Button("Nieuwe Bestelling");
        knopnieuwebestellingListener kn = new knopnieuwebestellingListener();
        knopnieuw.addActionListener(kn);
        add(knopnieuw);

    }

    public void paint(Graphics g) {

        g.drawString("Bestelling totaal: " + bestelling, 40, 120);
        g.drawString("Totaal dagomzet: " + totaal, 40, 140);
    }

    class knopfrisListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            totaal+=fris;
            bestelling+=fris;
            repaint();

        }
    }

    class knopbierListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            totaal+=bier;
            bestelling+=bier;
            repaint();
        }
    }

    class knopwijnListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            totaal+=wijn;
            bestelling+=wijn;
            repaint();
        }
    }

    class knopkoffieListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            totaal+=koffie;
            bestelling+=koffie;
            repaint();
        }
    }

    class knopbinnelandsegesdistilleerdListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            totaal+=binnen  ;
            bestelling+=binnen  ;
            repaint();


        }
    }

    class knopbuitenlandsegesdistilleerdListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            totaal+=buiten;
            bestelling+=buiten;
            repaint();

        }
    }

    class knopnieuwebestellingListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            totaal+=nieuw;
            bestelling+=nieuw;
            repaint();


        }
    }
}


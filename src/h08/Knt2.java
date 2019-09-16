package h08;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Knt2 extends Applet {
    Button knop;
    int schermtekst;
    int schermtekst2;
    int schermtekst3;
    int schermtekst4;
    int schermtekst5;

    public void init() {

        schermtekst = 0;
        schermtekst2 = 0;
        schermtekst3 = 0;
        schermtekst4 = 0;



        // mannen

        knop = new Button("man");
        KnopmanListener km = new KnopmanListener();
        knop.addActionListener(km);
        add(knop);


        knop = new Button("pot man");
        KnopmanpotientleListener kmp = new KnopmanpotientleListener();
        knop.addActionListener(kmp);
        add(knop);

        // vrouwen

        knop = new Button("vrouw");
        KnopvrouwListener kvp = new KnopvrouwListener();
        knop.addActionListener(kvp);
        add(knop);


        knop = new Button("pot vrouw");
        KnopvrouwpotientleListener kp = new KnopvrouwpotientleListener();
        knop.addActionListener(kp);
        add(knop);

  
    }

    public void paint(Graphics g) {
        schermtekst5 = schermtekst+schermtekst2+schermtekst3+schermtekst4;
        // namen
        g.drawString("aantal mannen                                  " + schermtekst, 50, 80);
        g.drawString("aantal vrouwen                                  " + schermtekst2, 50, 90);
        g.drawString("aantal potientale mannen               " + schermtekst3, 50, 100);
        g.drawString("aantal potientale vrouwen               " + schermtekst4, 50, 110);
        g.drawString("Totale personen                                "+ schermtekst5, 50, 120);

    }

    class KnopmanListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            schermtekst++;
            repaint();


        }

    }

    class KnopvrouwListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            schermtekst2++;
            repaint();

        }
    }

    class KnopmanpotientleListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            schermtekst3++;
            repaint();

        }
    }


    class KnopvrouwpotientleListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            schermtekst4++;
            repaint();


        }
    }


}





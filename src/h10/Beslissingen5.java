package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Beslissingen5 extends Applet {

    Button knopOke;
    Label labelcijfer;
    double totaal;
    String tekst;
    String tekst2;
    String tekstCijfer;
    double gemC;
    TextField bs;
    int aantal;
    double getal;
    String geslaagd;
    String gemT;


    public void init() {

        labelcijfer = new Label("Voer je cijfers in: ");
        add(labelcijfer);
        bs = new TextField("", 10);
        bs.addActionListener(new bsListener());
        add(bs);

        //knop
        knopOke = new Button("Oke");
        knopOke.addActionListener(new knopListener());
        add(knopOke);
        tekst = "";

    }

    public void paint(Graphics g) {

        g.drawString(tekstCijfer, 50, 70);
        g.drawString(gemT, 50, 80);
        g.drawString(geslaagd, 50, 90);
    }

    class bsListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekst = bs.getText();
            getal = Double.parseDouble(tekst);

            if (getal > 5.49) {
                tekst2 = " Voldoende";
            } else {
                tekst2 = " Onvoldoende";
            }
            tekstCijfer = ("Cijfer: " + tekst + tekst2);
            totaal += getal;
            aantal++;
            repaint();
        }
    }

    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            gemC = totaal / aantal;
            gemT = "Gemiddelde getal: " + gemC;
            if (gemC > 5.49) {
                geslaagd = "Leerling is geslaagd ";

            } else {
                geslaagd = "Leerling is gezakt ";
            }
            tekstCijfer = "";
            repaint();

        }
    }
}


package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Beslissingen4 extends Applet {

    TextField tekstvakMaand;
    TextField tekstvakJaar;
    Label labelMaand;
    Label labelJaar;
    String m, tekstmaand;
    String j, tekstjaar;
    int jaartal;
    int maandtal;

    public void init() {

        tekstvakMaand = new TextField("", 10);
        labelMaand = new Label("Maand");
        tekstvakMaand.addActionListener(new TekstvakListener());
        tekstmaand = "";
        add(labelMaand);
        add(tekstvakMaand);

        tekstvakJaar = new TextField("", 10);
        labelJaar = new Label("Jaar");
        tekstvakJaar.addActionListener(new TekstvakListener());
        tekstjaar = "";
        add(labelJaar);
        add(tekstvakJaar);
    }

    public void paint(Graphics g) {

        g.drawString(tekstmaand, 50, 60);
        g.drawString(tekstjaar, 50, 80);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            j = tekstvakJaar.getText();
            jaartal = Integer.parseInt(j);
            System.out.println(j);
            m = tekstvakMaand.getText();
            maandtal = Integer.parseInt(m);

            boolean isSchrikkeljaar = jaartal % 4 == 0 && !(jaartal % 100 == 0) ||
                    (jaartal % 400 == 0);


            if (isSchrikkeljaar) {
                tekstjaar = "" + jaartal + " is een schrikkeljaar";
                System.out.println("Random");
            } else {
                tekstjaar = "" + jaartal + " is geen schrikkeljaar";
            }

            switch (maandtal) {

                case 1:
                    tekstmaand = "Januari 31";
                    break;
                case 2:

                    if (isSchrikkeljaar) {
                        tekstmaand = "Februari 29";
                    } else {
                        tekstmaand = "Februari 28";
                    }
                    break;
                case 3:
                    tekstmaand = "Maart 31";
                    break;
                case 4:
                    tekstmaand = "April 30";
                    break;
                case 5:
                    tekstmaand = "Mei 31";
                    break;
                case 6:
                    tekstmaand = "Juni30";
                    break;
                case 7:
                    tekstmaand = "Juli 31";
                    break;
                case 8:
                    tekstmaand = "Augustus 31";
                    break;
                case 9:
                    tekstmaand = "September 30";
                    break;
                case 10:
                    tekstmaand = "Oktober 31";
                    break;
                case 11:
                    tekstmaand = "November 30";
                    break;
                case 12:
                    tekstmaand = "December 31";
                    break;

            }
            repaint();
        }

    }
}

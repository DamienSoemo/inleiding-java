package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Beslissingen3 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    int dag;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type het maandnummer en druk op enter");
        tekstvak.addActionListener(new TekstvakListener());
        tekst = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            dag = Integer.parseInt(s);
            switch (dag) {
                case 1:
                    tekst = "Januari";
                    break;
                case 2:
                    tekst = "Februari";
                    break;
                case 3:
                    tekst = "Maart";
                    break;
                case 4:
                    tekst = "April";
                    break;
                case 5:
                    tekst = "Mei";
                    break;
                case 6:
                    tekst = "Juni";
                    break;
                case 7:
                    tekst = "Juli";
                    break;
                case 8:
                    tekst = "Augustus";
                    break;
                case 9:
                    tekst = "September";
                    break;
                case 10:
                    tekst = "Oktober";
                    break;
                case 11:
                    tekst = "November";
                    break;
                case 12:
                    tekst = "December";
                    break;

                default:
                    tekst = "U hebt een verkeerd nummer ingetikt ..!";
                    break;
            }
            repaint();
        }
    }
}
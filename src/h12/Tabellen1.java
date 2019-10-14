package h12;

import java.applet.Applet;
import java.awt.*;


public class Tabellen1 extends Applet {
    double salaris[];
    double salaris2[];

    public void init() {
        salaris = new double[10];
        salaris2 = new double[10];
        for (int teller = 0; teller < salaris.length; teller++) {
            salaris[teller] = 1 * teller + 1;
            for (int teller2 = 0; teller2 < salaris2.length; teller2++) {
                salaris2[teller2] = 55 * teller2 + 55;

                int gemiddelde = teller2 / 10;
                System.out.println("Gemiddelde:" + gemiddelde);

            }
        }
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < salaris.length; teller++) {

            g.drawString("" + salaris[teller], 50, 20 * teller + 20);

        }
    }
}

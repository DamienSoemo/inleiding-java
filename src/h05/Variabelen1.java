package h05;

import java.awt.*;
import java.applet.*;

public class Variabelen1 extends Applet {

            //declaratie.
            Color opvulkleur;
            Color lijnkleur;
            int breedte;
            int hoogte;
            int breedte2;
            int breedte3;
            public void init() {
                //initialisatie.
                opvulkleur = Color.magenta;
                lijnkleur = Color.BLACK;
                breedte = 100;
                hoogte = 60;
                breedte2 = 160;
                breedte3 = 60;
        }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(lijnkleur);
        g.drawLine(20, 40, 120, 40);
        g.setColor(lijnkleur);
        g.drawString("Lijn", 60, 60);
        g.drawRect(20, 80, breedte, hoogte);
        g.drawString("rechthoek", 45, 160);
        g.drawRoundRect(20, 180, breedte, hoogte, 20, 20);
        g.drawString("Afgeronde driehoek", 20, 260);
        g.setColor(opvulkleur);
        g.fillRoundRect(140, 80, breedte2, hoogte, 0, 0);
        g.setColor(lijnkleur);
        g.drawArc(140, 80, breedte2, hoogte, 0, 360);
        g.drawString("Gevulde rechthoek met ovaal", 140, 160);
        g.setColor(opvulkleur);
        g.fillArc(320, 80, breedte2, hoogte, 0, 60);
        g.setColor(lijnkleur);
        g.drawArc(320, 80, breedte2, hoogte, 0, 360);
        g.drawString("Taartpunt met ovaal er omheen", 320, 160);
        g.setColor(opvulkleur);
        g.fillArc(140, 180, breedte2, hoogte, 0, 360);
        g.setColor(lijnkleur);
        g.drawString("Gevulde ovaal", 180, 260);
        g.drawOval(370, 180, breedte3, hoogte);
        g.drawString("Cirkel", 385, 260);


    }
}
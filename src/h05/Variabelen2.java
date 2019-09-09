package h05;

import java.awt.*;
import java.applet.*;

       public class Variabelen2 extends Applet {

        //declaratie.
       int gewichtValerie;
       int hoogteXas;
       int gewichtJeroen;
       int gewichtHans;

        public void init() {
                //initialisatie
                gewichtValerie = 40;
                hoogteXas = 190;
                gewichtJeroen = 100;
                gewichtHans = 80;

        }

        public void paint(Graphics g) {
                setBackground(Color.white);
                // Horizontale as
                g.drawLine(60,hoogteXas,225,hoogteXas);
                // Lijnen
                g.drawLine(60,170,225,170);
                g.drawLine(60,150,225,150);
                g.drawLine(60,130,225,130);
                g.drawLine(60,110,225,110);
                g.drawLine(60,90,225,90);
               // Balken
                  //Valerie
                g.setColor(Color.yellow);
                g.fillRect(60,hoogteXas - gewichtValerie,40,gewichtValerie);
                  //Jeroen
                g.setColor(Color.red);
                g.fillRect(120,hoogteXas - gewichtJeroen,40,gewichtJeroen);
                  //Hans
                g.setColor(Color.BLUE);
                g.fillRect(180,hoogteXas - gewichtHans,40,gewichtHans);
                g.setColor(Color.black);
               // Namen
                g.drawString("Valerie",60, 215);
                g.setColor(Color.black);
                g.drawString("Jeroen",120,215);
                g.setColor(Color.black);
                g.drawString("Hans",180, 215);
                g.setColor(Color.BLACK);
               // Kg
                g.drawString("0Kg",25,190);
                g.setColor(Color.black);
                g.drawString("20Kg",20,170);
                g.setColor(Color.black);
                g.drawString("40Kg",20, 150);
                g.setColor(Color.black);
                g.drawString("60Kg",20,130);
                g.setColor(Color.black);
                g.drawString("80Kg",20, 110);
                g.drawString("100kg",15,90);
               // Vertical as
                g.drawLine(60,90,60, hoogteXas);
        }


}


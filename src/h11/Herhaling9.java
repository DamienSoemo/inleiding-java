package h11;

import java.applet.Applet;
import java.awt.*;

public class Herhaling9 extends Applet {


    public void init() {

    }

    public void paint(Graphics g) {

        int x = 50;
        int y = 50;
        int width = 50;
        int height = 50;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, width, height);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, width, height);

            }
            x = 50;
            y += width;

        }
        x = 50;
        y = 50;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 1 || kolom == 3 || kolom == 5 || kolom == 7) {
                g.setColor(Color.black);
                g.fillRect(x, y, width, height);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, width, height);

            }
            x += width;
        }

        x = 50;
        y += height;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, width, height);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, width, height);

            }
            x += width;
        }

        x = 50;
        y += 50;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 1 || kolom == 3 || kolom == 5 || kolom == 7) {
                g.setColor(Color.black);
                g.fillRect(x, y, width, height);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, width, height);

            }
            x += width;
        }
        x = 50;
        y += height;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, width, height);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, width, height);

            }
            x += width;
        }
        x = 50;
        y += 50;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 1 || kolom == 3 || kolom == 5 || kolom == 7) {
                g.setColor(Color.black);
                g.fillRect(x, y, width, height);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, width, height);

            }
            x += width;
        }
        x = 50;
        y += width;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, width, height);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, width, height);

            }
            x += width;
        }
        x = 50;
        y += 50;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 1 || kolom == 3 || kolom == 5 || kolom == 7) {
                g.setColor(Color.black);
                g.fillRect(x, y, width, height);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, width, height);

            }
            x += width;
        }

        x = 50;
        y += width;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, width, height);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, width, height);

            }
            x += width;

        }

    }
}


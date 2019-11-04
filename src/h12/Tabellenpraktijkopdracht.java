package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tabellenpraktijkopdracht extends Applet {


    int a = 0;
     boolean idk = false;
    String[] namen;
    int[] telefoon;
    TextField TextN;
    TextField TextT;

    public void init() {


        TextN = new TextField("", 10);
        TextT = new TextField("", 10);
        Label tel = new Label("telefoon nummer");
        Label naam = new Label("naam");
        Button ok = new Button("ok");
        namen = new String[10];
        telefoon = new int[10];

        ok.addActionListener(new TextListener());
        TextN.addActionListener(new TextListener());
        TextT.addActionListener(new TextListener());

        add(naam);
        add(TextN);
        add(tel);
        add(TextT);
        add(ok);
    }

    public void paint(Graphics g) {

        if (idk) {
            for (int teller = 0; teller < namen.length; teller++) {
                g.drawString(namen[teller], 100, 30 * teller + 20);
                g.drawString("" + telefoon[teller], 200, 30 * teller + 20);
            }
        }

    }

    class TextListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            idk = true;
            String N = TextN.getText();
            String tex = TextT.getText();
            int T = Integer.parseInt(tex);

            namen[a] = N;
            telefoon[a] = T;

            if (a == 10) {
                idk = true;

            }
            a += 1;
            repaint();

        }

    }
}
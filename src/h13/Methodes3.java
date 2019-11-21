package h13;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Methodes3 extends Applet {

    int width;
    int height;
    Color color;
    Button baksteen;
    Button beton;

    public void init() {

        setSize (600,400);

        baksteen = new Button();
        baksteen.setLabel("Rode bakstenenmuur");
        baksteen.addActionListener( new baksteenListener());
        add(baksteen);

        beton = new Button();
        beton.setLabel("Grijze betonnenmuur");
        beton.addActionListener( new betonListener());
        add(beton);

    }

    public void paint(Graphics g) {

        tekenmuur(g,width,height,color);

}

    class baksteenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            width = 100;
            height = 50;
            color  = Color.red;

            repaint();
        }
    }

    class betonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            width = 100;
            height = 75;
            color  = Color.gray;

            repaint();
        }
    }

    void tekenmuur (Graphics g,int x1,int y1, Color kleur) {

        int x = 25;
        int y = 100;
        int reset = 2;

        for (int i = 0; i < 9 ; i++) {

            x += x1;
            g.setColor(kleur);
            g.fillRect(x,y,x1,y1);
            g.setColor(Color.white);
            g.drawRect(x,y,x1,y1);

            if ( i == reset){
                y += y1;
                reset += 3;
                x = 25;

            }
        }
    }
}

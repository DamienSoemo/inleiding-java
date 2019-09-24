package h10;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Beslissingenpraktijkopdracht extends Applet {

    TextField tekstvakCijfer;
    Label labelCijfer;
    String c, tekstCijfer;
    int cijfertal;


    public void init() {

        tekstvakCijfer = new TextField("", 5);
        labelCijfer = new Label("Type je cijfer in");
        tekstvakCijfer.addActionListener(new TekstvakListener());
        tekstCijfer = "";
        add(labelCijfer);
        add(tekstvakCijfer);

    }

    public void paint(Graphics g) {

        g.drawString(tekstCijfer, 50, 60);

    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            c = tekstvakCijfer.getText();
            cijfertal = Integer.parseInt(c);
            System.out.println(c);

            switch (cijfertal) {

                case 1:
                    tekstCijfer = "Slecht";
                    break;

                case 2:
                    tekstCijfer = "Slecht";
                    break;
                case 3:
                    tekstCijfer = "Slecht";
                    break;
                case 4:
                    tekstCijfer = "Onvoldoende";
                    break;
                case 5:
                    tekstCijfer = "Matig";
                    break;
                case 6:
                    tekstCijfer = "Voldoende";
                    break;
                case 7:
                    tekstCijfer = "Voldoende";
                    break;
                case 8:
                    tekstCijfer = "Goed";
                    break;
                case 9:
                    tekstCijfer = "Goed";
                    break;
                case 10:
                    tekstCijfer = "Goed";
                    break;

                default:
                    tekstCijfer = "U hebt een verkeerd nummer ingetikt ..!";
                    break;

            }
            repaint();
        }

    }
}

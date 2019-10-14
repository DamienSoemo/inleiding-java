package h12;

import java.applet.*;
import java.awt.*;

public class Tabellen2 extends Applet {

    Button[] knop = new Button[25];

    public void init() {

        for (int i = 0; i < knop.length; i++) {
            knop[i] = new Button("");
            add(knop[i]);

        }

    }
}


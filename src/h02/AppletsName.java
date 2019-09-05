package h02;

        import java.awt.*;
                import java.applet.*;

//een klasse met de naam Show van het type Applet
public class AppletsName extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {
        setBackground(Color.WHITE);
    }

    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Damiën" , 50, 60 );
        g.setColor(Color.red);
        g.drawString("Soemowikromo" , 50, 70 );
    }

}



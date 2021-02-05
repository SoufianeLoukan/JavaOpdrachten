import java.awt.*;
import java.applet.*;

public class Opdr13 extends Applet {
    Color Opvulkluer;
    Color Lijnkleur;

    public void init() {
    }


    public void paint(Graphics g) {
        for (int i = 0; i < 5; i++) {
            boom(g, i, 0);
        }
        for (int i = 0; i < 5; i++) {
            boom(g, i, 1);
        }


    }

    public void boom(Graphics g, int boomNummer, int boomNummer2) {
        boomNummer = boomNummer * 100;
        boomNummer2 = boomNummer2 * 200;
        g.setColor(Color.green);
        g.fillRect(boomNummer + 50, boomNummer2 + 200, 25, 50);
        g.fillPolygon(new int[]{62 + boomNummer, 25 + boomNummer, 100 + boomNummer}, new int[]{boomNummer2 + 50, boomNummer2 + 200, boomNummer2 + 200}, 3);


    }
}
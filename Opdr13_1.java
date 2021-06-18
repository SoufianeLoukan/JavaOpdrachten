import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;


public class Opdr13_1 extends Applet {

    public void paint(Graphics g) {
        tekenDriehoek(g, 100, 100, 150, 200, 50, 200);
        tekenDriehoek(g, 200, 200, 300, 400, 100, 400);
    }

    void tekenDriehoek(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {
        int abc;
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x1, y1, x3, y3);
        g.drawLine(x2, y2, x3, y3);
    }
}
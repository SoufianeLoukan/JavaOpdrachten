import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdr11_1 extends Applet {

    int c1, c2, c3;

    // opdr 11.1 en 11.12
    public void paint(Graphics g) {

        for (int i = 0; i < 10; i++) {
            g.drawLine(20 * i, 20, 20 * i, 50);

            g.drawString("" + (20 - i), 50, 80 + i * 10);

        }
//opdr 11.3
        c1 = 0;
        c2 = 1;

        for (int i = 1; i <= 11; i++) {
            c3 = c1 + c2;
            g.drawString(c2 + "", 30 * i, 210);
            c1 = c2;
            c2 = c3;
            // 0  1  1  2  3  5
            //    c1+c2=c3
        }
//        OPdr 11.4
        g.drawString("tafel van 3", 60, 290);
        for (int i = 1; i <= 10; i++) {
            int antwoord = i * 3;
            g.drawString("" + (antwoord), 20, 290 + 15 * i);
        }


//        opdr 11.5 en 11.6
        for (int i = 1; i < 5; i++) {
            g.drawRect(120 + 33 * i, 320 + 33 * i, 33, 33);
            g.drawOval(150 - 25 * i, 350 - 25 * i, 50 * i - 7, 50 * i - 7);
        }
//opdr 11.7
        for (int i = 1; i < 50; i++) {
            g.drawOval(300 - 3 * i, 420 - 3 * i, 6 * i - 7, 6 * i - 7);
        }

//opdr 11.8
        for (int i = 1; i < 100; i++) {
            g.drawOval(400, 420, 6 * i - 7, 6 * i - 7);
        }

//opdr 11.9
        for (int j = 0; j < 8; j++) {

            for (int i = 0; i < 8; i++) {
                if (i % 2 == 0 && j % 2 == 0 || i % 2 == 1 && j % 2 == 1) {
                    g.fillRect(500 + 30 * i, 120 + 30 * j, 31, 31);
                } else {
                    g.drawRect(500 + 30 * i, 120 + 30 * j, 30, 30);
                }
            }
        }
    }
}

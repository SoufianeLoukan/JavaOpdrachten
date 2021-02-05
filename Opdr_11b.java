import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdr_11b extends Applet {
    Label label;
    Button knop;
    int getal = 1;

    public void init() {
        label = new Label("klik op de knop voor de volgende tafel ");
        knop = new Button("Volgende tafel");
        knop.addActionListener(new KnopListener());


        add(knop);
        add(label);
    }

    public void paint(Graphics g) {
        int teller = 1;
        int y = 60;

        while (teller <= 10) {
            y += 20;
            g.drawString(teller + " x " + getal + " = " + teller * getal, 50, y);
            teller++;
        }
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal++;
            if (getal > 10) {
                getal = 1;
            }
            repaint();
        }
    }
}
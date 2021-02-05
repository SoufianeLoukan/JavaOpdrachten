import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdr_11 extends Applet {
    TextField tekstvak;
    Label label;
    Button knop;
    int getal = 1;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("vul in een cijfer in en krijg de tafel ervan ");
        knop = new Button("klik hier");
        tekstvak.addActionListener(new TekstvakListener());
        knop.addActionListener(new KnopListener());


        add(knop);
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        int teller = 1;
        int y = 60;

        while(teller <= 10) {
            y += 20;
//            g.drawLine(50 , y, 300, y );
            // teller  str  getal       str teller * getal
            // 2        x   1           =       2
            g.drawString(teller + " x " + getal + " = " + teller * getal, 50, y );
            teller++;
        }
    }
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Integer.parseInt(s);
            repaint();
        }
    }
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Integer.parseInt(s);
            repaint();
        }
    }
}
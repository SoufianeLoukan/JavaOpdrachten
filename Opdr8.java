import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Opdr8 extends Applet {
    TextField tekstvak;
    Label label;
    Label label2;
    double getal;
    String tekstvakwaarde;

        Button knop;
        Button knopReset;

        public void init() {

            tekstvak = new TextField("", 20);
            label = new Label("Type een getal");
            knop = new Button("Ok");
            knopReset = new Button("Reset");
            label2 = new Label("Type een getal en bereken je BTW");
            knop.addActionListener(new KnopListener());
            knopReset.addActionListener(new KnopResetListener());
            tekstvak.addActionListener(new TekstvakListener());
            add(label);
            add(label2);
            add(tekstvak);
            add(knop);
            add(knopReset);

        }

        class KnopListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                String s = tekstvak.getText();
                getal = Double.parseDouble(s);
                repaint();
            }
        }


    class KnopResetListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
          tekstvak.setText("");
            repaint();
        }
    }

        public void paint(Graphics g) {
            g.drawString("Het getal met BTW is " + getal *1.21,  50, 120);
            g.drawString("Het getal is " + getal, 50, 80);
//            g.drawString("De waarde van tekstvak: " + tekstvakwaarde, 50, 100);
        }

        class TekstvakListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                String hetgetal = tekstvak.getText();
                getal = Double.parseDouble(hetgetal);
                //Je kan deze regels ook samenvoegen
                //getal = Double.parseDouble(tekstvak.getText());
                repaint();
            }
        }

    }

// Opdr 8.3







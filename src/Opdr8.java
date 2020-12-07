import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Opdr8 extends Applet {
    TextField tekstvak;
    Label label;
    double getal;
    String tekstvakwaarde;

        Button knop;
        Button knopReset;

        public void init() {
            tekstvak = new TextField("", 20);
            label = new Label("Type een getal");
            knop = new Button("Ok");
            knopReset = new Button("Reset");
            knop.addActionListener(new KnopListener());
            knopReset.addActionListener(new KnopResetListener());
            tekstvak.addActionListener(new TekstvakListener());
            add(label);
            add(tekstvak);
            add(knop);
            add(knopReset);

        }

        class KnopListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                tekstvakwaarde = tekstvak.getText();
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
            g.drawString("Het getal is " + getal, 50, 60);
            g.drawString("De waarde van tekstvak: " + tekstvakwaarde, 50, 80);
        }

        class TekstvakListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                String s = tekstvak.getText();
                getal = Double.parseDouble(s);
                //Je kan deze regels ook samenvoegen
                //getal = Double.parseDouble(tekstvak.getText());
                repaint();
            }
        }
    }

    //opdr8.2





import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Opdr8_3 extends Applet {
    Button plus;
    Button min;
    Button gedeeld;
    Button keer;
    double getal;
    TextField tekstvak;

    TextField tekstvakrek1;
    TextField tekstvakrek2;



    public void init() {

        tekstvakrek1 = new TextField("", 20);
        tekstvakrek2 = new TextField("", 20);
        plus = new Button("+");
        min = new Button("-");
        gedeeld = new Button("/");
        keer = new Button("*");
        plus.addActionListener(new plusListener());
        min.addActionListener(new minListener());
        gedeeld.addActionListener(new gedeeldListener());
        keer.addActionListener(new keerListener());
        add(tekstvakrek1);
        add(tekstvakrek2);
        add(plus);
        add(min);
        add(keer);
        add(gedeeld);

    }

    class plusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double getal1 = Double.parseDouble(tekstvakrek1.getText());
            double getal2 = Double.parseDouble(tekstvakrek2.getText());
            double pluscombi = getal1 + getal2;
            String combiplus = Double.toString(pluscombi);
            tekstvakrek1.setText(combiplus);
            tekstvakrek2.setText("");
            repaint();
        }
    }

    class minListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double getal1 = Double.parseDouble(tekstvakrek1.getText());
            double getal2 = Double.parseDouble(tekstvakrek2.getText());
            double pluscombi = getal1 - getal2;
            String combiplus = Double.toString(pluscombi);
            tekstvakrek1.setText(combiplus);
            tekstvakrek2.setText("");
            repaint();
        }
    }

    class keerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            double getal1 = Double.parseDouble(tekstvakrek1.getText());
            double getal2 = Double.parseDouble(tekstvakrek2.getText());
            double pluscombi = getal1 * getal2;
            String combiplus = Double.toString(pluscombi);
            tekstvakrek1.setText(combiplus);
            tekstvakrek2.setText("");
            repaint();
        }
    }

    class gedeeldListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            double getal1 = Double.parseDouble(tekstvakrek1.getText());
            double getal2 = Double.parseDouble(tekstvakrek2.getText());
            double pluscombi = getal1 / getal2;
            String combiplus = Double.toString(pluscombi);
            tekstvakrek1.setText(combiplus);
            tekstvakrek2.setText("");
            repaint();
        }
    }
}

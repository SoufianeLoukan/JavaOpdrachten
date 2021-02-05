import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class opdr_10 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    int cijfer;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Vul jou cijfer in en kijk wat het resultaat is ");
        tekstvak.addActionListener(new TekstvakListener());
        tekst = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            cijfer = Integer.parseInt(s);
            switch (cijfer) {
                case 1:
                case 2:
                case 3:
                    tekst = "slecht";
                    break;

                case 4:
                    tekst = "onvoldoende";
                    break;
                case 5:
                    tekst = "matig";
                    break;
                case 6:
                case 7:
                    tekst = "voldoende";
                    break;

                case 8:
                case 9:
                case 10:
                    tekst = "goed";
                    break;

                default:
                    tekst = "U hebt een verkeerd nummer ingetikt ..!";
                    break;
            }
            repaint();
        }
    }
}

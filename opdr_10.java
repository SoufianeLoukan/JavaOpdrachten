import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class opdr_10 extends Applet {
    TextField tekstvak;
    Button Knop;
    Label label;
    String s, tekst;
    int cijfer, cijferAantal, totaalCijfers;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Vul jou cijfer in en kijk wat het resultaat is ");
        Knop = new Button("OK");
        Knop.addActionListener(new KnopListener());
        tekst = "";
        add(Knop);
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60);
        g.drawString("" + totaalCijfers / cijferAantal, 50, 90);
        if (totaalCijfers / cijferAantal > 5.5) {
            g.drawString("je hebt een voldoende",20,140);
        }
        else {g.drawString("je hebt geen voldoende",20, 140);}
    }

    class KnopListener implements ActionListener {
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
            totaalCijfers = totaalCijfers + cijfer;
            cijferAantal++;

            repaint();
        }
    }



}

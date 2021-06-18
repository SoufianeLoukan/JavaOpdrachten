import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdr10_1 extends Applet {
    TextField tekstvak;
    TextField maandTekstvak;
    TextField jaarTekstvak;
    String maand = "";
    int maandDag;
    int hoogsteGetal;
    int laagsteGetal;


    public void init() {

        tekstvak = new TextField("", 20);
        maandTekstvak = new TextField("", 20);
        jaarTekstvak = new TextField("", 20);

        tekstvak.addActionListener(new TekstvakListener());
        maandTekstvak.addActionListener(new MaandTekstvakListener());
        jaarTekstvak.addActionListener(new MaandTekstvakListener());

        add(tekstvak);
        add(maandTekstvak);
        add(jaarTekstvak);
    }

    public void paint(Graphics g) {
        g.drawString("hoogste getal " + hoogsteGetal, 20, 50);
        g.drawString("laagste getal " + laagsteGetal, 20, 80);
        g.drawString("" + maand, 20, 120);
        g.drawString("" + maandDag,20, 160 );


    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String savedtext;
            savedtext = tekstvak.getText();

            int getal = Integer.parseInt(savedtext);
            if (getal > hoogsteGetal) {
                hoogsteGetal = getal;
            }
            if (getal < laagsteGetal) {
                laagsteGetal = getal;
            }


            repaint();


        }


    }

    class MaandTekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String savedtext;
            savedtext = maandTekstvak.getText();

            int getal = Integer.parseInt(savedtext);


            switch (getal) {
                case 1:
                    maand = "Januari";
                    maandDag = 31;
                    break;

                case 2:
                    maand = "februari";
                    maandDag = 28;
                    savedtext = jaarTekstvak.getText();

                    int jaar = Integer.parseInt(savedtext);
                    if (jaar % 4 == 0) {
                        maandDag = 29;
                    }

                    break;

                case 3:
                    maand = "maart";
                    maandDag = 31;
                    break;

                case 4:
                    maand = "april";
                    maandDag = 30;
                    break;

                case 5:
                    maand = "mei";
                    maandDag = 31;
                    break;

                case 6:
                    maand = "juni";
                    maandDag = 30;
                    break;

                case 7:
                    maand = "Juli";
                    maandDag = 31;
                    break;

                case 8:
                    maand = "Augustus";
                    maandDag = 30;
                    break;

                case 9:
                    maand = "September";
                    maandDag = 31;
                    break;

                case 10:
                    maand = "October";
                    maandDag = 30;
                    break;

                case 11:
                    maand = "November";
                    maandDag = 31;
                    break;

                case 12:
                    maand = "December";
                    maandDag = 30;
                    break;
            }
            repaint();
        }
    }
}

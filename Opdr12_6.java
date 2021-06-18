import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;


public class Opdr12_6 extends Applet {


    int[] cijfers = new int[10];
    Button knop;
    TextField tekstvak;
    int getal;
    String resultaat = "";
    Random rand = new Random();


    public void init() {
        tekstvak = new TextField("", 20);
        knop = new Button("klik");
        knop.addActionListener(new KnopListener());
        add(tekstvak);
        add(knop);
        cijferwaardes();
    }


    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
//            aantalKeren = 0;
            String s = tekstvak.getText();
            getal = Integer.parseInt(s);
            opzoeken();
            repaint();
        }
    }


    public void paint(Graphics g) {
        g.drawString(resultaat, 20, 75);
        for (int i = 0; i < cijfers.length; i++) {
            g.drawString("" + cijfers[i], 80, 105 + i * 20);
        }

    }

    public void cijferwaardes() {


        int i = 0;
        while (i < cijfers.length) {
            cijfers[i] = rand.nextInt(5);
            i++;
        }


    }

    public void opzoeken() {
        resultaat = "die zit niet in het tabel";
        int aantalKeren = 0;

        for (int i = 0; i < cijfers.length; i++) {
            if (cijfers[i] == getal) {
                aantalKeren++;

                resultaat = "het cijfer komt" + aantalKeren + " voor";
            }
        }


    }


}




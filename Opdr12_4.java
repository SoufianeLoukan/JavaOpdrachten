import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;



// dit is opdr 12.4 en 12.5

public class Opdr12_4 extends Applet {

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
            String s = tekstvak.getText();
            getal = Integer.parseInt(s);
            opzoeken();
            repaint();
        }
    }


    public void paint(Graphics g) {
        g.drawString(resultaat, 20, 75);
        for (int i=0; i < cijfers.length; i++) {
            g.drawString("" + cijfers[i], 80,105 + i * 20);
        }

    }
    public void cijferwaardes() {


        int i = 0;
        while (i < cijfers.length) {
            cijfers[i] = rand.nextInt(100);
            i++;
        }


    }

    public void opzoeken() {
        resultaat = "die zit niet in het tabel";

        for (int i = 0; i < cijfers.length; i++) {
            if (cijfers[i] == getal){
                resultaat = "deze cijfer zit op positie " + i;
                return;
            }
        }



    }


}


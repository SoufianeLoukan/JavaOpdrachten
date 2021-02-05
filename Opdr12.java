import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr12 extends Applet {
    int[] nummers = new int[10];
    String[] namen = new String[10];
    TextField tekstvak;
    TextField tekstvak2;
    Button Knop;
    int teller = 0;
    Label label;
    Label label2;

    public void init() {
        tekstvak = new TextField("", 20);
        tekstvak2 = new TextField("", 40);
        Knop = new Button("klik");
        Knop.addActionListener(new KnopListener());
        label = new Label("vul een nummer in");
        label2 = new Label("vul een naam in");


        add(label);
        add(tekstvak);
        add(label2);
        add(tekstvak2);
        add(Knop);


    }

    public void paint(Graphics g) {

        int i = 0;
        while (i < teller) {
            g.drawString("" + nummers[i], 20, 90 + i * 20);
            g.drawString("" + namen[i], 90, 90 + i * 20);
            i++;
        }


    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            String naam = tekstvak2.getText();

            nummers[teller] = Integer.parseInt(s);
            namen[teller] = naam;
            teller++;

            repaint();
        }
    }

}
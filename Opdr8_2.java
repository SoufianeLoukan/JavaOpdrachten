import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Opdr8_2 extends Applet {
    TextField tekstvak;
    double getal;
    String tekstvakwaarde;


    Label label;
    Button knop;
    Button knop2;
    Button knop3;
    Button knop4;

    int mannen, vrouwen, mannenKandidaat, vrouwenKandidaat;

    public void init() {
        tekstvak = new TextField("", 20);
        knop = new Button("Mannen");
        knop2 = new Button("Mannelijke kandidaten");
        knop3 = new Button("Vrouwen");
        knop4 = new Button("Vrouwen Kandidaten");
        knop.addActionListener(new KnopListener());
        knop2.addActionListener(new Knop2Listener());
        knop3.addActionListener(new Knop3Listener());
        knop4.addActionListener(new Knop4Listener());
        add(knop);
        add(knop2);
        add(knop3);
        add(knop4);

    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            mannen++;
            repaint();
        }
    }

    class Knop2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            mannenKandidaat++;
            repaint();
        }
    }

    class Knop3Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            vrouwen++;
            repaint();
        }
    }

    class Knop4Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            vrouwenKandidaat++;
            repaint();
        }
    }

    public void paint(Graphics g) {
        g.drawString("Aantal mannen is " + mannen, 50, 70);
        g.drawString("Aantal manelijke kandidaden is " + mannenKandidaat, 50, 80);
        g.drawString("Aantal vrouwen is " + vrouwen, 50, 90);
        g.drawString("Aantal Vrouwelijke Kandidaden " + vrouwenKandidaat, 50, 100);
        g.drawString("Alles bij elkaar zijn: " + (mannenKandidaat + mannen + vrouwen +vrouwenKandidaat), 50, 110);
    }







}







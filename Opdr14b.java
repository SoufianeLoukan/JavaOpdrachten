import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Opdr14b extends Applet {
    int smileys = 23;
    TextField tekstvak;
    Button knop;
    Label label;
    private Image afbeelding;
    private URL pad;
    int computerZet = 0;


    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("vul een cijfer tussen 1 en 3 in ");
        knop = new Button("klik hier");
        pad = Opdr14b.class.getResource("/resources/");
        afbeelding = getImage(pad, "smiley.jpg");

        tekstvak.addActionListener(new TekstvakListener());
        knop.addActionListener(new KnopListener());

        add(knop);
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        if (smileys <= 0) {
            g.drawString("het spel is afgelopen", 20, 120);
        }
        else {
            if (computerZet != 0) {
                g.drawString("De computer heeft " + computerZet + " smileys weggehaald.", 20, 75);
            }

        g.drawString("Aantal resterende smileys: " + smileys + ". Jouw beurt", 20, 95);
    }
        for (int i = 0; i < smileys; i++) {
            int row = i / 5;
            int col = i % 5;
            g.drawImage(afbeelding, 70 * col, 100 + 100 * row, 70, 70, this);
        }
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            int getal = Integer.parseInt(s);
            playerTurn(getal);
        }
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            int getal = Integer.parseInt(s);
            playerTurn(getal);
        }
    }

    public void playerTurn(int getal) {
        smileys = smileys - getal;
        repaint();
        tekstvak.setText("");

        if (smileys % 4 == 1) {
            double randomNummer = Math.random();
            computerZet = (int) (randomNummer * 3 + 1);
        } else {
            int overgebleven = smileys % 4;
            if (overgebleven == 0) {
                computerZet = 3;
            } else if (overgebleven == 2) {
                computerZet = 1;
            } else if (overgebleven == 3) {
                computerZet = 2;
            }
        }

        smileys = smileys - computerZet;

    }

}


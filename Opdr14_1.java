import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

public class Opdr14_1 extends Applet {
    Random rand = new Random();
    String[] kaarten = {"aas", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "boer", "koning", "konining"};
    String[] soorten = {"schoppen", "klaver", "harten", "ruiten"};
    String randomKaartPakken;
    String randomSoortPakken;
    String[] deck = new String[52];
    String[] speler = {"Speler1", "Speler2", "Speler3", "Speler4"};
    String[] kaartenVoorSpeler1 = new String[13];
    String[] kaartenVoorSpeler2 = new String[13];
    String[] kaartenVoorSpeler3 = new String[13];
    String[] kaartenVoorSpeler4 = new String[13];


    public void init() {
        Button Knop = new Button("klik voor een willekeurige kaart");
        add(Knop);
        Knop.addActionListener(new KnopListener());



    }

    private String deelKaart() {
        int random = new Random().nextInt(deck.length);
        String kaart = deck[random];

        //vervang de inhoud van deck met een nieuwe lijst
        //het nieuwe deck is 1 kaart kleiner dan het oude deck
        String[] hulpLijst = new String[deck.length - 1];
        //om het nieuwe deck te vullen hebben we een index nodig
        int hulpindex = 0;
        //kopieer alle kaarten naar hulplijst behalve de kaart die net gedeeld is
        for (int i = 0; i < deck.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = deck[i];
                hulpindex++;
            }
        }
        //vervang nu deck met de nieuwe lijst
        deck = hulpLijst;
        //de methode geeft de random kaart terug
        return kaart;
    }


    public void maakDeck() {
        deck = new String[52];
        int counter = 0;
        for (int i = 0; i < soorten.length; i++) {
            for (int b = 0; b < kaarten.length; b++) {

                deck[counter] = soorten[i] + " " + kaarten[b];
                counter++;
            }
        }
    }


    public void kaartenVoorSpelers() {

        for (int i = 0; i < 13; i++) {
            kaartenVoorSpeler1[i] = deelKaart();
            kaartenVoorSpeler2[i] = deelKaart();
            kaartenVoorSpeler3[i] = deelKaart();
            kaartenVoorSpeler4[i] = deelKaart();
        }
    }

    public void paint(Graphics g) {

        g.drawString("speler1", 100, 100);
        g.drawString("speler2", 200, 100);
        g.drawString("speler3", 300, 100);
        g.drawString("speler4", 400, 100);
        for (int i = 0; i < 13; i++) {

            g.drawString("" + kaartenVoorSpeler1[i], 100, 130 + 35 * i);
            g.drawString("" + kaartenVoorSpeler2[i], 200, 130 + 35 * i);
            g.drawString("" + kaartenVoorSpeler3[i], 300, 130 + 35 * i);
            g.drawString("" + kaartenVoorSpeler4[i], 400, 130 + 35 * i);

        }


    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            maakDeck();
            kaartenVoorSpelers();
            repaint();
        }
    }

}
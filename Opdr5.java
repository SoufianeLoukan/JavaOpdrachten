import java.awt.*;
import java.applet.*;
public class Opdr5 extends Applet {
    //declaratie.
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;
    int gewichtTom;
    int gewichtBob;
    int gewichtJon;

    public void init() {
        //initialisatie.
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 200;
        hoogte = 100;
        gewichtTom = 40;
        gewichtBob = 80;
        gewichtJon = 100;
    }

    public void paint(Graphics g) {
        //teken rechthoek
        g.drawRect(100, 400, breedte, hoogte);
        g.drawString("rechthoek", 100, 510);
        //teken afgeronde rechthoek
        g.drawRoundRect(100, 525, breedte, hoogte, 30, 30);
        g.drawString("afgeronde rechthoek", 100, 635);
        //teken gevulde rechthoek
        g.setColor(opvulkleur);
        g.fillRect(315, 400, breedte, hoogte);
        //teken ovaal
        g.setColor(Color.black);
        g.drawOval(315, 400, breedte, hoogte);
        g.drawString("gevulde rechthoek met ovaal", 315, 510);
        //teken gevulde ovaal
        g.setColor(opvulkleur);
        g.fillOval(315, 525, breedte, hoogte);
        g.drawString("gevulde ovaal", 315, 650);
        g.drawOval(515, 525, breedte, hoogte);
        g.drawString("Taartpunt met ovaal eromheen", 515, 650);

        g.fillArc(515, 525, breedte, hoogte, 0, 45);

        // teken circle
g.drawString("cirkel", 555, 510);
        g.drawOval(550,400,110,110);




        g.drawLine(180, 100, 180, 200);
        g.drawString("0", 180, 200);
        g.drawString("20", 180, 180);
        g.drawString("40", 180, 160);
        g.drawString("60", 180, 140);
        g.drawString("80", 180, 120);
        g.drawString("100", 180, 100);
        g.fillRect(200, 200, 30, -gewichtTom);
        g.setColor(Color.blue);
        g.drawString("Tom", 200, 210);
        g.fillRect(250, 200, 30, -gewichtBob);
        g.drawString("Bob", 250, 210);
        g.setColor(Color.red);
        g.fillRect(300, 200, 30, -gewichtJon);
        g.drawString("jon", 300, 210);
        // en zo voort...

    }



}

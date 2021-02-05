/*

@(#)Show.java 1.0 03/02/26

*

Voorbeeld 2.1

*

*/

//importeer de benodigde klassen uit de Java bibliotheek
import java.awt.*;
import java.applet.*;

//een klasse met de naam Show van het type Applet
public class Opdr4 extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {
    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillPolygon(new int[] {10, 100, 50}, new int[] {10, 50, 100}, 3);
        g.setColor(Color.green);
        g.fillRect(10,100,150,100);
        g.setColor(Color.red);
        g.fillRect(10,100,50,25);
        g.fillRect(50,150,50,50);
        g.setColor(Color.black);
        g.fillRect(100,75,15,25);
        g.setColor(Color.red);
        g.fillRect(100,0,75,25);
        g.setColor(Color.white);
        g.fillRect(100,25,75,25);
        g.setColor(Color.blue);
        g.fillRect(100,50,75,25);


        g.drawLine(180, 100, 180, 200);
        g.drawString("0", 180, 200);
        g.drawString("20", 180, 180);
        g.drawString("40", 180, 160);
        g.drawString("60", 180, 140);
        g.drawString("80", 180, 120);
        g.drawString("100", 180, 100);
        g.fillRect(200, 200, 30, -40);
        g.setColor(Color.blue);
        g.drawString("Tom", 200, 210);
        g.fillRect(250, 200, 30, -100);
        g.drawString("Bob", 250, 210);
        g.setColor(Color.red);
        g.fillRect(300, 200, 30, -80);
        g.drawString("jon", 300, 210);


        //teken rechthoek
        g.drawRect(100, 400, 200, 100);
        g.drawString("rechthoek", 100, 510);
        //teken afgeronde rechthoek
        g.drawRoundRect(100, 525, 200, 100, 30, 30);
        g.drawString("afgeronde rechthoek", 100, 635);
        //teken gevulde rechthoek
        g.setColor(Color.MAGENTA);
        g.fillRect(315, 400, 200, 100);
        //teken ovaal
        g.setColor(Color.black);
        g.drawOval(315, 400, 200, 100);
        g.drawString("gevulde rechthoek met ovaal", 315, 510);
        //teken gevulde ovaal
        g.setColor(Color.MAGENTA);
        g.fillOval(315, 525, 200, 100);
        g.drawString("gevulde ovaal", 315, 650);
        g.drawOval(515, 525, 200, 100);
        g.drawString("Taartpunt met ovaal eromheen", 515, 650);

        g.fillArc(515, 525, 200, 100, 0, 45);


    }

}
import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

public class Opdr12_1 extends Applet{
int[] getallen = new int[10];
double resultaat = 0;
Random rand = new Random();

    public void gemiddelde() {
        int i = 0;
        int sum = 0;
        while (i < getallen.length) {

            sum = sum + getallen[i];
            i++;

        }
        resultaat = sum / 10;


    }
    public void cijferwaardes() {


        int i = 0;
        while (i < getallen.length) {
            getallen[i] = rand.nextInt(100);
            i++;
        }


    }
    public void paint(Graphics g) {
        cijferwaardes();
        gemiddelde();
        int i = 0;
        g.drawString("" + resultaat, 90, 90);
        while (i < getallen.length) {
            g.drawString("" + getallen[i], 20, 90 + i * 20);
            i++;
        }


    }
}
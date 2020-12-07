import java.awt.*;
import java.applet.*;
public class Opdr6 extends Applet {

        int verdiend;
        int b;
        int c;
        int uitkomst;
        int SecondenInUur = 60 * 60;
        double[] Cijfers = {5.9, 6.3, 6.9};
        String[] naam = {"Jeanette", "Ali", "Souf", "Jan"};

        public void init() {
            verdiend = 113;
            uitkomst = verdiend / naam.length;
        }

        public void paint(Graphics g) {
            // Opdr 6.1
            g.drawString(" Jan heeft " + uitkomst + " verdiend",20, 20);
            g.drawString("Souf heeft " + uitkomst + " verdiend",20, 40);
            g.drawString("Ali heeft " + uitkomst + " verdiend",20, 60);
            g.drawString("Jeanette heeft " + uitkomst + " verdiend",20, 80);

            // Opdr 6.2

            g.drawString("seconden in een uur " + SecondenInUur,20, 120);
            g.drawString("seconden in een dag " + SecondenInUur * 24 ,20, 160);
            g.drawString("seconden in een jaar " + SecondenInUur * 24 * 365,20, 200);

            // Opdr 6.3

            g.drawString("Overflow: " + (2147483647 + 1), 20, 250);

            // Opdr praktijk
            double gemiddelde = (Cijfers[0] + Cijfers[1] + Cijfers[2]) / 3;
            int gemiddeldeInt = (int) (gemiddelde * 10);
            double doubleGemiddelde = (double) gemiddeldeInt / 10;

            g.drawString("Gemiddelde " +  doubleGemiddelde, 20, 300);

        }
    }



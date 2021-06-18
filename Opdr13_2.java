import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

// opdr 13-2 en opdr 13-3
public class Opdr13_2 extends Applet{
    Button knop;
    Button knop2;
    String type_knop = "";

    public void init(){
        knop = new Button("betonblok muur");
        knop2 = new Button("baksteen muur");
        knop.addActionListener(new KnopListener());
        knop2.addActionListener(new Knop2Listener());
        add(knop);
        add(knop2);


    }


    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            type_knop = "rode muur";
            repaint();
        }
    }

    class Knop2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            type_knop = "grijze muur";
            repaint();
        }
    }


    public void paint(Graphics g) {
        if (type_knop == "rode muur") {
            for (int i = 0; i <= 15; i++) {
                for (int b = 0; b <= 10; b++) {
                    if (i % 2 == 0) {
                        tekenBaksteen(g, 125 + 50 * b, 100 + 25 * i, 50, 25);
                    } else {
                        tekenBaksteen(g, 100 + 50 * b, 100 + 25 * i, 50, 25);
                    }
                }
            }
        }
        for (int i = 0; i <= 15; i++){
            if (type_knop == "grijze muur")
            for (int b = 0; b <= 10; b++){
                if (i % 2 == 0) {
                    tekenBetonblok(g, 137 + 75 * b, 100 + 35 * i, 75, 35);
                }
                else {
                    tekenBetonblok(g, 100 + 75 * b, 100 + 35 * i, 75, 35);
                }
            }
        }



    }

    void tekenBaksteen(Graphics g, int x, int y, int width, int height) {
        g.setColor(Color.black);
        g.drawRect(x,y,width,height);
        g.setColor(Color.red);
        g.fillRect(x+1,y+1,width-1,height-1);


    }


    void tekenBetonblok(Graphics g, int x, int y, int width, int height) {
        g.setColor(Color.black);
        g.drawRect(x,y,width,height);
        g.setColor(Color.gray);
        g.fillRect(x+1,y+1,width-1,height-1);


    }
}


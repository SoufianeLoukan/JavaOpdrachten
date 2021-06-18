import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

public class Opdr12_3 extends Applet {
    TextField tekstvak1;
    TextField tekstvak2;
    TextField tekstvak3;
    TextField tekstvak4;
    TextField tekstvak5;
    int[] cijfers = new int[5];


    public void init() {
        tekstvak1 = new TextField("", 20);
        tekstvak2 = new TextField("", 20);
        tekstvak3 = new TextField("", 20);
        tekstvak4 = new TextField("", 20);
        tekstvak5 = new TextField("", 20);
        Button knop = new Button("klik op mij");
        add(knop);
        add(tekstvak1);
        add(tekstvak2);
        add(tekstvak3);
        add(tekstvak4);
        add(tekstvak5);
        knop.addActionListener(new KnopListener());
    }


//    public void textfields() {
//        for (int i = 1; i <= 5; i++) {
//            TextField randomTextfield = new TextField("",20);
//            add(randomTextfield);
//        }
//    }

    public void sorteren() {
        Arrays.sort(cijfers);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak1.getText();
            int getal = Integer.parseInt(s);
            cijfers[0] = getal;
            s = tekstvak2.getText();
            getal = Integer.parseInt(s);
            cijfers[1] = getal;
            s = tekstvak3.getText();
            getal = Integer.parseInt(s);
            cijfers[2] = getal;
            s = tekstvak4.getText();
            getal = Integer.parseInt(s);
            cijfers[3] = getal;
            s = tekstvak5.getText();
            getal = Integer.parseInt(s);
            cijfers[4] = getal;
            sorteren();

            tekstvak1.setText("" + cijfers[0]);
            tekstvak2.setText("" + cijfers[1]);
            tekstvak3.setText("" + cijfers[2]);
            tekstvak4.setText("" + cijfers[3]);
            tekstvak5.setText("" + cijfers[4]);
        }
    }
}



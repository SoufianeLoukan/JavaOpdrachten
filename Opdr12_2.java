import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

public class Opdr12_2 extends Applet {

    public void init() {
        knoppen();
    }


    public void knoppen() {
       int i=1;
       while (i <= 25)
        {
            Button randomKnop = new Button("knop" + i);
            add(randomKnop);
            i++;
        }
    }
}

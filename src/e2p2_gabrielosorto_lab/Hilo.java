package e2p2_gabrielosorto_lab;

import java.io.Serializable;
import javax.swing.JProgressBar;

public class Hilo extends Thread implements Serializable {

    private JProgressBar barrita1;
    private int velocidad;

    public Hilo(JProgressBar barrita1, int velocidad) {
        this.barrita1 = barrita1;
        this.velocidad = velocidad;
    }



    @Override
    public void run() {
        while (true) {
            while (barrita1.getValue() < 1000) {
                barrita1.setValue(barrita1.getValue() + velocidad);
                barrita1.setString(Integer.toString(barrita1.getValue()));
            }//Fin del if
            try {
                Thread.sleep(500000000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}

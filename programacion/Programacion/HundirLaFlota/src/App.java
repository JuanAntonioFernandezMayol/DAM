import java.util.ArrayList;
import java.awt.GridLayout;
import java.util.List;
import javax.swing.*;

public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hundir el barco");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 5));

        List<Casillas> casillas = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            Casillas casilla = new Casillas();
            casillas.add(casilla);
            frame.add(casilla);
        }
        for (int n = 0; n < 5; n++) {
            Casillas casillaBarco = casillas.get(n);
            casillaBarco.setBarco(true);
        }

        frame.setSize(1000, 500);
        // frame.add(button);
        // frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

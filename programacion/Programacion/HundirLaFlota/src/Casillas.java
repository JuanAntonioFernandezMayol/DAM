import javax.swing.*;
import java.awt.event.*;

public class Casillas extends JButton {
    private Boolean barco = false;

    public void setBarco(Boolean barco) {
        this.barco = barco;
    }

    public Casillas() {
        ImageIcon icono = new ImageIcon(
                "C:\\Users\\alumne-DAM\\Documents\\GitHub\\DAM\\programacion\\Programacion\\HundirLaFlota\\src\\1.jpg");
        this.setIcon(icono);
        this.addActionListener((ActionEvent e) -> {
            if (barco == true) {
                ImageIcon iconoBarco = new ImageIcon(
                        "C:\\Users\\alumne-DAM\\Documents\\GitHub\\DAM\\programacion\\Programacion\\HundirLaFlota\\src\\2.avif");
                this.setIcon(iconoBarco);
            }
        });
    }
}

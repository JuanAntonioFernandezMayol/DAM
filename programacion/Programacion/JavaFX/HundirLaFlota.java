import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class HundirLaFlota {

    private static int barcos = 5;
    private static int balas = 15;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Ventana");
        JFrame Menu = new JFrame("Menu");

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Menu.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JPanel menupanel = new JPanel();
        JButton botonMenu = new JButton("Start");
        panel.setLayout(new GridLayout(5, 5));
        ArrayList<JButton> listaBotones = new ArrayList<JButton>();
        ArrayList<Boolean> listaBooleans = new ArrayList<Boolean>();
        for (int i = 0; i < 25; i++) {
            JButton button = new JButton();
            listaBotones.add(button);
        }
        int j = 0;
        for (int i = 0; i < 25; i++) {
            Random random = new Random();
            int x = random.nextInt(1, 4);

            boolean casilla;
            if (x % 2 == 0) {
                j++;
                if (j > 5) {
                    casilla = false;
                } else {
                    casilla = true;
                }
            } else {
                casilla = false;
            }
            listaBooleans.add(casilla);
        }
        for (int i = 0; i < 25; i++) {
            if (listaBooleans.get(i) == true) {
                JButton boton = listaBotones.get(i);
                boton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent ev) {
                        boton.setBackground(Color.green);
                        boton.setEnabled(false);
                        barcos--;
                        balas--;
                        if (barcos <= 0) {
                            JOptionPane.showMessageDialog(null, "Has Ganado!!!", "INFORMATION_MESSAGE",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                });

                panel.add(boton);
            } else {
                JButton boton = listaBotones.get(i);
                listaBotones.get(i).addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent ev) {
                        boton.setBackground(Color.blue);
                        boton.setEnabled(false);
                        balas--;
                        if (balas <= 0) {
                            JOptionPane.showMessageDialog(null, "Perdiste", "INFORMATION_MESSAGE",
                                    JOptionPane.INFORMATION_MESSAGE);
                            frame.setVisible(false);
                        }
                    }
                });

                panel.add(listaBotones.get(i));
            }
        }
        botonMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                Menu.setVisible(false);
            }
        });
        frame.getContentPane().add(panel);
        frame.setSize(400, 333);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        menupanel.add(botonMenu);
        Menu.getContentPane().add(menupanel);
        Menu.setSize(400, 333);
        Menu.setLocationRelativeTo(null);
        Menu.setVisible(true);

    }
}
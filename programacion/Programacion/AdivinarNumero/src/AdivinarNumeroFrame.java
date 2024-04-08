import java.awt.Component;
import java.awt.GridLayout;
import java.util.Random;

import javax.swing.*;
import java.awt.event.*;

/**
 * AdivinarNumeroFrame
 */
public class AdivinarNumeroFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Adivina un numero aleatorio del 1 al 100");
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        frame.getContentPane().add(label);
        frame.setLayout(new GridLayout(3, 2));

        JButton button = new JButton("Adivinar");
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                Random random = new Random();
                Integer numero = random.nextInt(100);
                label.setText(numero.toString());
            }
        });
        frame.add(button);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        JTextField texto = new JTextField("");

    }
}
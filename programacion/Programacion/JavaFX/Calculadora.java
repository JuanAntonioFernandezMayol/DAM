import java.awt.Color;
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
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Calculadora {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Ventana");

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();

        panel.setLayout(new GridLayout(6, 1));
        panel2.setLayout(new GridLayout(2, 2));

        JTextField numero1 = new JTextField();
        JTextField numero2 = new JTextField();
        JButton boton = new JButton("resolver");
        JRadioButton suma = new JRadioButton("suma");
        JRadioButton resta = new JRadioButton("resta");
        JRadioButton multiplicacion = new JRadioButton("multiplicación");
        JRadioButton division = new JRadioButton("división");
        JLabel label = new JLabel("resulado");
        JLabel hueco2 = new JLabel("");
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {

                if (suma.isSelected()) {
                    int res = Integer.parseInt(numero1.getText()) + Integer.parseInt(numero2.getText());
                    hueco2.setText("" + res);
                } else if (resta.isSelected()) {
                    int res = Integer.parseInt(numero1.getText()) - Integer.parseInt(numero2.getText());
                    hueco2.setText("" + res);
                } else if (multiplicacion.isSelected()) {
                    int res = Integer.parseInt(numero1.getText()) * Integer.parseInt(numero2.getText());
                    hueco2.setText("" + res);
                } else if (division.isSelected()) {
                    int res = Integer.parseInt(numero1.getText()) / Integer.parseInt(numero2.getText());
                    hueco2.setText("" + res);
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor selecciona una operación",
                            "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        suma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                resta.setSelected(false);
                multiplicacion.setSelected(false);
                division.setSelected(false);
            }
        });
        resta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                suma.setSelected(false);
                multiplicacion.setSelected(false);
                division.setSelected(false);
            }
        });
        multiplicacion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                resta.setSelected(false);
                suma.setSelected(false);
                division.setSelected(false);
            }
        });
        division.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                resta.setSelected(false);
                multiplicacion.setSelected(false);
                suma.setSelected(false);
            }
        });

        frame.getContentPane().add(panel);
        panel.add(numero1);
        panel.add(numero2);
        panel.add(boton);

        panel2.add(suma);
        panel2.add(resta);
        panel2.add(multiplicacion);
        panel2.add(division);
        panel.add(panel2);
        panel.add(label);
        panel.add(hueco2);
        frame.setSize(400, 333);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}

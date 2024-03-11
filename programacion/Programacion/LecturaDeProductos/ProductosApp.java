package Programacion.LecturaDeProductos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class ProductosApp {

    public static void main(String[] args) {
        HashMap<Integer, Producto> inventario = new HashMap<>();

        try {
            String path = "C:\\Users\\alumne-DAM\\Documents\\GitHub\\DAM\\programacion\\Programacion\\LecturaDeProductos\\texto.txt";
            BufferedReader br = new BufferedReader(new FileReader(path));
            String text = br.readLine();

            while (text != null) {
                String[] linia = text.split(",");
                Producto producto = new Producto(Integer.valueOf(linia[0]), linia[1], Double.parseDouble(linia[2]));
                text = br.readLine();
                inventario.put(Integer.valueOf(linia[0]), producto);
                // inventario.put(Integer.valueOf(linia[3]), producto);
                // inventario.put(Integer.valueOf(linia[6]), producto);
            }
        } catch (IOException e) {
            System.out.println("No a funcionado");

        }
        Integer codigo = -1;
        while (codigo == 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introducce un codigo de barras: ");
            codigo = sc.nextInt();
            Producto eleccion = inventario.get(codigo);
            if (eleccion != null) {
                System.out.println("El producto es: " + eleccion.toString());
            } else {
                System.out.println("El producto no a sido encontrado!");
            }
        }
    }
}
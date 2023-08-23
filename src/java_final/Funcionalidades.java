/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_final;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author tineo
 */
public class Funcionalidades {

    public static void main(String[] args) {
        String[] conjunto = {"1", "2", "3", "4"};
    }

    public static void eliminarDatosLabel(JLabel[] pm_array) {
        for (JLabel label : pm_array) {
            label.setText("0.0");
        }
    }

    public static void eliminarDatosText(JTextField[] pm_array) {
        for (JTextField text : pm_array) {
            text.setText("");
        }
    }

    public static String calcularSubtotal(JLabel pm_precio, JTextField pm_cantidad, JLabel pm_alerta) {
        boolean confirmacion = comprobarNegativos(pm_cantidad, pm_alerta);

        float precio = Float.parseFloat(pm_precio.getText());
        int cantidad = Integer.parseInt(pm_cantidad.getText());

        double resultado = confirmacion ? (precio * cantidad) : 0;
        return Double.toString(resultado);
    }

    public static boolean comprobarNegativos(JTextField pm_cantidad, JLabel pm_label) {
        int cantidad = Integer.parseInt(pm_cantidad.getText());
        if (cantidad < 0) {
            pm_label.setText("Introduce valores correctos");
            return false;
        }
        return true;
    }

    public static String[] calcularParcialDescuentoTotal(JTextField[] pm_array_subtotales) {
        String[] pm_costos = new String[3];
        double suma = 0;
        double descuento = 0;

        for (JTextField elemento : pm_array_subtotales) {
            suma += Double.parseDouble(elemento.getText());
        }

        pm_costos[0] = Double.toString(suma);
        if (suma < 50) {
            descuento = suma * 0;
        }
        if (suma >= 50 && suma <= 200) {
            descuento = suma * 0.08;
        }
        if (suma >= 201 && suma <= 250) {
            descuento = suma * 0.10;
        }
        if (suma >= 251 && suma <= 300) {
            descuento = suma * 0.15;
        }
        if (suma >= 301) {
            descuento = suma * 0.2;
        }
        pm_costos[1] = Double.toString(descuento);

        double total = suma-descuento;
        
        pm_costos[2] = Double.toString(total);
        
        return pm_costos;
    }
}

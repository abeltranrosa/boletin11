package boletin11;

import java.util.Date;
import javax.swing.*;

public class Boletin11 {

    public static void main(String[] args) {
        //declaramos las variables inicio y final de tipo long para calcular 2 momentos de tiempo
        long start, finish;
        //introducimos la frase "escribe la siguiente frase con todo el texto que nos pide"
        JOptionPane.showMessageDialog(null, "Escribe la siguiente frase :");
        JOptionPane.showInputDialog("\n A documentación é todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicación informática ");
        //inicializamos las variables start y finish con System.currentTimeMillis();
        start = System.currentTimeMillis();
        finish = System.currentTimeMillis();
        //visualizamos el mensaje "Preme enter para rematar
        JOptionPane.showMessageDialog(null, "PREME ENTER PARA REMATAR");
        //visualizamos el mensaje "tardaste .....tiempo en escribir la frase
        JOptionPane.showMessageDialog(null, "Tardaste" + " " + (finish - start) / 1000 + " " + "segundos en escribir la frase");

    }

}

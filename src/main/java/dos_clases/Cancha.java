
package dos_clases;

import javax.swing.JOptionPane;

public class Cancha {
    public double ladoA;
    public double ladoB;

    public void ingresarDatos() {
        String cadena;
        cadena=JOptionPane.showInputDialog(null, "Ingrese la longitud del lado A :");
        ladoA= Double.parseDouble(cadena);
        
        cadena=JOptionPane.showInputDialog(null,"Ingrese la longitud del lado B :");
        ladoB=Double.parseDouble(cadena);
    }

    public void calcularArea() {
      
        double resultado;
        
        resultado =ladoA*ladoB;
        JOptionPane.showMessageDialog(null," El Resultado es :" +resultado);
    }
    
}

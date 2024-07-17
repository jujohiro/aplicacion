
import javax.swing.JOptionPane;


public class Aplicacion1 {
    public static void main(String[] args) {
        
        double ladoA;
        double ladoB;
        
        ladoA=ingresarDatos("Ingrese la longitud del ladoA :");
        ladoB=ingresarDatos("Ingresar la longitud del ladoB :");
        
        calcularArea (ladoA,ladoB);
    }

    private  static double ingresarDatos(String mensaje) {
        
        String cadena;
        double valor;
        
        cadena =JOptionPane.showInputDialog(null,mensaje);
        valor = Double.parseDouble(cadena);
        
        return valor;
    }

    public static void calcularArea(double ladoA, double ladoB) {
       
        double resultado;
        resultado=ladoA*ladoB;
        JOptionPane.showMessageDialog(null, " El resultado es : " +resultado);
    }
        
    
}

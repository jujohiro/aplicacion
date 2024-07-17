
package laboratorio1;
// se crea la clase Flecha

import javax.swing.JOptionPane;

public class Flecha {
    
    // atributos
    int longitud;
    String color;
    
    // metodo publico con retorno sin parametros
    public Flecha() {
        // se le da infromacion a las variables con los cuales el proyecto va a iniciar por defecto
        longitud=18;
        color="negro";
    }
    // metodo publico con retornno y con parametros
    public Flecha(int longitud,String color) {
        
        this.longitud=longitud;
        this.color=color;
    }
    // metodo publico para imprimir espacio
    public void imprimirEspacio() {
        System.out.println();
    }
    // metodo publico, sin retorno y sin parametros
    public void construirFlecha() {
        for (int i = 0; i < longitud; i++) {
            imprime("-");
        }
        imprime(">");
    }
// metodo imprimir privado, sin retorno, con parametro tipo string=simbolo
    private void imprime(String simbolo) {
        // condicion para imprimir el simbolo
        if (color.equals("negro")) {
            System.out.print(simbolo);
        } else {
            System.out.print(simbolo);
        }
    }
    
}
   
    
    


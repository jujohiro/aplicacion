
package laboratorio1;

// se crea la clase principal donde ira el main

import javax.swing.JOptionPane;

public class Principal {
    // se crea el objeto flecha , con los 3 tipos de flecha
    Flecha flecha1,flecha2,flecha3,flecha4;
    
    //se crea el metodo main
    public static void main(String[] args) {
        // se encarga de instanciar un objeto de la misma clase para poder trabajar con objetos no estáticos.
        Principal miPrincipal=new Principal();
    }
    
    public Principal() {
        // se crea el objeto 1 
       flecha1=new Flecha();
       flecha1.construirFlecha();
       flecha1.imprimirEspacio();
       
       flecha2=new Flecha();
       flecha2.longitud=34;
       flecha2.color="rojo";
       flecha2.construirFlecha();
       flecha2.imprimirEspacio();
       
       flecha3=new Flecha(12,"negro");
       flecha3.construirFlecha();
       flecha3.imprimirEspacio();
       
       int tamaño=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la flecha: "));
       String color=JOptionPane.showInputDialog("Ingrese el color de la flecha \n1. rojo, \n2. negro");
       
       
           
       flecha4=new Flecha(tamaño,color);
       flecha4.construirFlecha();
       flecha4.imprimirEspacio();
    }
    
    
}

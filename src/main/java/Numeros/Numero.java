
package Numeros;

import javax.swing.JOptionPane;

// por defecto es publica
class Numero {
    //se crean las variables 
    int numer;
    int i,neg=0,par=0;
    
    // metodo publico sin parametros y sin retorno
    public void entrada() {
       //ciclo para repetir 5 veces el proceso.
        for ( i= 0; i < 5; i++) {
            // se llama la variable numer que es igual al metodo ingresar datos
            //para que el usuario digite un numero
            numer = ingresarDatos("Digite un numero");
            
            // se hace la condicion de si es numero par o impar
            if (numer%2==0) {
                par++;
            }
            if(numer<0) {
                neg++;
            }
        }
        // se usa el metodo JOptionPane para imprimir mensaje por medio de ventana
        // para mostra la cantidad de numeros negativos y positivos
        JOptionPane.showMessageDialog(null,"El numero de numeros pares es :" +par+"\n" 
                +" y el numero de numeros negativos es : " +neg);
    }
//metodo publico con retorno Ingresar datos y con parametros.
    public static int ingresarDatos(String mensaje) {
       // se llaman las variables cadena,valor
        String cadena;
        int valor;
        //se llama la variable cadena diciendo que es igual al meto JOptionPane y que pida mensaje
        cadena=JOptionPane.showInputDialog(null,mensaje);
        //como la variable valor alamcena un numero entero se hace la conversion a Integer por usar el metodo JOptionPane
        valor=Integer.parseInt(cadena);
        return valor;
    }
    
}

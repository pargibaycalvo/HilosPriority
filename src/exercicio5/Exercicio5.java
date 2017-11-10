/*
Escribe unha clase que cree dous fíos e force que a escritura do segundo sexa sempre anterior á
escritura por pantalla do primeiro.
 Exemplo de ejecución:
 Ola, son o fío número 2
 Ola, son o fío número 1
a) faino con join
b )faino con prioridades
*/

package exercicio5;

import static java.lang.Thread.MAX_PRIORITY;
import static java.lang.Thread.MIN_PRIORITY;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pargibaycalvo
 */
public class Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        hilos h1=new hilos("Ola son o fío 1");
        hilos h2=new hilos("Ola son o fío 2");        
        
        h1.setPriority(MIN_PRIORITY);
        h2.setPriority(MAX_PRIORITY);        
        
        h2.start();
        
        try {
            h2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Exercicio5.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        h1.start();
    }
    
    
}

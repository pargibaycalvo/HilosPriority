/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;
/**
 *
 * @author pargibaycalvo
 */
public class hilos extends Thread{
    
    public hilos(String name) {
        super(name);
    }
    
    @Override
    public void run() {
        System.out.println(this.getName()+" -> "+this.getPriority()+" prioridad");        
    }
}


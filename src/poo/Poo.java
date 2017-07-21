/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author alex
 */
public class Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Caja caja = new Caja();
        caja.alto = 5;
        caja.ancho = 9;
        caja.largo = 15;
        
        Poo.imprimir("Volumen de la caja es: "+caja.volumen()+"");
        
        Carro carro = new Carro();
        carro.moverAlNorte(15);
        carro.moverAlSur(150);
        carro.moverAlOeste(25);
        carro.moverAlEste(15);
        
        Poo.imprimir("Kilometros recorridos: "+carro.kilometros_recorridos()+"");
        Poo.imprimir("Posición final: "+carro.posicionActual());
    }
    
    public static void imprimir(String texto) {
        System.out.println(texto);
    }
    
}

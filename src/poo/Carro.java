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
public class Carro {
    
    int kmRecorridos = 0;
    int kmsN = 0;
    int kmsS = 0;
    int kmsE = 0;
    int kmsO = 0;
    
    public void moverAlNorte(int kms) {
        this.kmsN += kms;
        this.kmRecorridos += kms;
    }
    
    public void moverAlSur(int kms) {
        this.kmsS += kms;
        this.kmRecorridos += kms;
    }
    
    public void moverAlEste(int kms) {
        this.kmsE += kms;
        this.kmRecorridos += kms;
    }
    
    public void moverAlOeste(int kms) {
        this.kmsO += kms;
        this.kmRecorridos += kms;
    }
    
    public int kilometros_recorridos() {
        return this.kmRecorridos;
    }
    
    public String posicionActual() {
        return "("+(this.kmsE-this.kmsO)+","+(this.kmsN-this.kmsS)+")";
    }
    
}

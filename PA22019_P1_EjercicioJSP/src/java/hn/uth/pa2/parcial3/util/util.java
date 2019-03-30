/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.pa2.parcial3.util;

import java.util.Random;

/**
 *
 * @author eliucinho
 */
public class util {
    public static int getAleatorio(){
        Random r=new Random();
        
        int numeroAletorio=r.nextInt(100);
        
        return numeroAletorio;
    }
    
    public static int getPosicionSigno(){
        Random r=new Random();
        
        int numeroAletorio=r.nextInt(3)+1;
        
        return numeroAletorio;
    }
    
    public static int calcular(int valorA, int valorB, int signo){
        int resultado=0;
        if (signo==1) {
            resultado=valorA+valorB;
        }
        if (signo==2) {
            resultado=valorA-valorB;
        }
        if (signo==3) {
            resultado=valorA*valorB;
        }
        if (signo==4) {
            resultado=valorA/valorB;
        }
        return resultado;
    }
    
    public static String getSigno(int signo){
        String resultado="";
        if (signo==1) {
            resultado="+";
        }
        if (signo==2) {
            resultado="-";
        }
        if (signo==3) {
            resultado="*";
        }
        if (signo==4) {
            resultado="/";
        }
        return resultado;
    }
}

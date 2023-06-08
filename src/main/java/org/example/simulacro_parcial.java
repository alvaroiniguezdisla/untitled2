package org.example;
import java.util.*;

public class simulacro_parcial {
    /*private List<Integer> sistemaMonedas = new ArrayList<>();

    /* Sistema de monedas ordenado de mayor a menor, en céntimos
    @Before
    public void setup() {
        this.sistemaMonedas.addAll(Arrays.asList(200, 100, 50, 20, 10, 5, 2, 1));
    }
    /**
     * Dado un cambio de dinero y un sistema de monedas ordenado de mayor a menor
     * (todo en céntimos), devolver el número de monedas mínimo correspondiente al
     * cambio. La técnica de esta función debe ser iterativa (bucles).
     * @param cambio
     * @param sistemaMonedas
     * @return el número mínimo de monedas.
     */
    public static int cambioIterativo(int cambio, List<Integer> sistemaMonedas) {
        // Aunque esto sería muy importante en una aplicación real, para facilitar
        // el trabajo al alumno, no será necesario comprobar que `cambio >= 0` ni
        // que el sistema de monedas es válido.

        int resultado = 0;
        for(int i=0; i<=sistemaMonedas.size()-1;i++){
            while(cambio>=sistemaMonedas.get(i)){
                cambio-=sistemaMonedas.get(i);
                resultado++;
            }
        }

        // CÓDIGO A COMPLETAR

        return resultado;
    }

    /**
     * Dado un cambio de dinero y un sistema de monedas ordenado de mayor a menor
     * (todo en céntimos), devolver el número de monedas mínimo correspondiente al
     * cambio. La técnica de esta función debe ser recursiva (con caso base).
     * @param cambio
     * @param sistemaMonedas
     * @return el número mínimo de monedas.
     */
    public static int cambioRecursivo(int cambio, List<Integer> sistemaMonedas) {
        int[] resultado = new int[1]; // Esta variable se puede utilizar para
        // paso por referencia.
        cambioRecursivo(cambio, 0, sistemaMonedas, resultado);
        return resultado[0];

    }
    private static void cambioRecursivo(int cambio, int i, List<Integer> sistemaMonedas, int resultado[]) {

        // `i` es el índice que se utiliza para recorrer el sistema de monedas.
        // En `resultado[0]` se van acumulando los resultados de las llamadas recursivas.

        if(cambio==0){

        }else{
            if(cambio>=sistemaMonedas.get(i)){
                resultado[0]+=1;
                 cambioRecursivo(cambio-(sistemaMonedas.get(i)),i,sistemaMonedas,resultado);
            }else{
                 cambioRecursivo(cambio,i+1,sistemaMonedas,resultado);
            }
        }

    }



    public static void main(String[]args){
        List<Integer> sistemaMonedas = new ArrayList<>();
        sistemaMonedas.addAll(Arrays.asList(200, 100, 50, 20, 10, 5, 2, 1));
        int[] resultado=new int[1];
        System.out.println(cambioRecursivo(450,sistemaMonedas));
    }



}
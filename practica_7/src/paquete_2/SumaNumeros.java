/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_2;

/**
 *
 * @author davidpill
 */
public class SumaNumeros {
    public static void suma(int n) {
        double suma = 0;
        for (int i = 0; i <= n; i++) {
            suma = suma + i;
        }
        System.out.println(suma);
    }
    public static int Suma (int valor) {
        if (valor <= 0){
            return 0;
        }else{
            return valor + Suma(valor-1);
        }
    }
}

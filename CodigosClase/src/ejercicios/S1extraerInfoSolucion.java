/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.net.*;
import java.io.*;

/**
 *
 * @author USUARIO
 */
public class S1extraerInfoSolucion {

    public static void main(String[] args) throws Exception {
        String rutaKtronix = "https://www.ktronix.com/computadores-tablets/computadores-portatiles/c/BI_104_KTRON";
        URL url = new URL(rutaKtronix);
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        String codigoFuente = "";
        String linea;
        while ((linea = reader.readLine()) != null) {
            codigoFuente = codigoFuente + linea;
        }
        reader.close();
        while (true) {

            if (codigoFuente.indexOf("((String('") == -1) {
                break;
            }
                        
            //nombre
            int start = codigoFuente.indexOf("((String('")+10;
            int end = codigoFuente.indexOf(")).replace",start);
            System.out.println("Nombre "+codigoFuente.substring(start,end));
            
            //precio
            start = codigoFuente.indexOf("price: ")+8;
            end = codigoFuente.indexOf("previousPrice",start);
            System.out.println("Precio "+codigoFuente.substring(start,end));
            
            //marca
            start = codigoFuente.indexOf("brand:")+7;
            end = codigoFuente.indexOf("category",start);
            System.out.println("Marca "+codigoFuente.substring(start,end));
            System.out.println("***************************************");
            codigoFuente = codigoFuente.substring(end+2);
            
        }
        
    }
}

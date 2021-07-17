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
public class S1extraerInfoPW {

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
        //System.out.println(codigoFuente);

        //use indexOf, substring y length
//        while(true){
//            
//            if(codigoFuente.indexOf("fsdfd")== -1){
//                break;
//            }
        //System.out.println(codigoFuente.length()-1);    
        //for (int i = 0 ; i < codigoFuente.length()-1; i++){
        while (true) {

            if (codigoFuente.indexOf("name: ((String('") == -1) {
                break;
            }

            int i = codigoFuente.indexOf("name: ((String('");

            int indexName = i;
            int indexNameEnd = codigoFuente.indexOf("'}", indexName);
            String subcadena = codigoFuente.substring(indexName, indexNameEnd - 1);
            //System.out.println(subcadena);

            System.out.print(subcadena.substring(41, subcadena.indexOf("')).replace")) + " "); // imprime el nombre
            System.out.print(subcadena.substring(subcadena.indexOf("price: '") + 8, subcadena.indexOf("',                        previousPrice : ")) + " "); // imprime el precio
            System.out.println(subcadena.substring(subcadena.indexOf("brand: '") + 8, subcadena.indexOf("',                        category: '")) + " "); // imprime el brand
            codigoFuente = codigoFuente.substring(indexNameEnd);

        }

    }

}

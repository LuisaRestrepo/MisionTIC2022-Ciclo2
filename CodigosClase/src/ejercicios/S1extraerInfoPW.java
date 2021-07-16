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
    public static void main(String [] args) throws Exception{
        String rutaKtronix = "https://www.ktronix.com/computadores-tablets/computadores-portatiles/c/BI_104_KTRON";
        URL url = new URL(rutaKtronix);
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        String codigoFuente = "";
        String linea;
        while((linea = reader.readLine()) != null){
            codigoFuente = codigoFuente + linea;
        }
        reader.close();
        //System.out.println(codigoFuente);

        //use indexOf, substring y length
        
        while(true){
            
            if(codigoFuente.indexOf("fsdfd")== -1){
                break;
            }
            
        
        }
    }   
}

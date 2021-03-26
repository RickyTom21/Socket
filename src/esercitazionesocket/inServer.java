/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercitazionesocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;



/**
 *
 * @author NextLand
 */
public class inServer {
    public static void main (String[]args) throws IOException{
        ServerSocket ss = new ServerSocket(3547);
        while(true){
            Socket s = ss.accept();
            InputStreamReader isr = new InputStreamReader(s.getInputStream()); 
            BufferedReader b = new BufferedReader(isr);
            System.out.println("Ciao, mondo");   
           s.close();
        }
    }
    
}

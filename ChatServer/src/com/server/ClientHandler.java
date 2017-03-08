/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.server;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Sara
 */
public class ClientHandler extends Thread {
    
    FileInputStream fis;
    FileOutputStream fos;
    public static Vector<ClientHandler> handlers=new Vector<ClientHandler>();
    
    ClientHandler(Socket s){
        try {
            
            fis=(FileInputStream) s.getInputStream();
            fos=(FileOutputStream) s.getOutputStream();
            handlers.add(this);
            start();
        } catch (IOException ex) {
            Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    public void run(){
        while(true){
            try {
                byte[] bytes=new byte[1024];
                fis.read(bytes);
                String message=new String(bytes);
                //System.out.println(message);
                if(message.equals("#@$%&*!"))
                {
                      bytes=" ".getBytes();
                      this.fis.close();
                      this.fos.close();
                      handlers.remove(this);
                      break;
                }
                else
                    sendMessageToAll(bytes);
     
            } catch (IOException ex) {
              //  System.out.println("socket exception");
               // ex.printStackTrace();
             /*   try {
                   // System.out.println("socket exception");
                    this.fis.close();
                    this.fos.close();
                    //.exit(0);
                } catch (IOException ex1) {
                    Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex1);
                }*/
            }

        }
    }

    private void sendMessageToAll( byte[] message) {
        for(ClientHandler handler:handlers){
            try {       
                if(new String(message).equals("#@$%&*!"))
                {
                    handler.fos.write("".getBytes());
                }
                else
                    handler.fos.write(message);
                System.out.println(message);
                      
                
            } catch (IOException ex) {
                //System.out.println("send to all");
            }
        }
    }
    
    
}

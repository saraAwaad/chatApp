/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.server;

import java.io.IOException;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Sara
 */
public class Server {
     ServerSocket server;
     Socket socket;
    public static void main(String[] args){
        new Server();
    
    } 
    Server(){
            System.out.println("Server Constructor");
        try {
            server=new ServerSocket(2222);
            while(true){
                    socket=server.accept();
                    new ClientHandler(socket);
                }
            
            } catch(BindException ex){
                     System.out.println("already started");
            }catch ( NullPointerException | IOException ex) {
                    System.out.println("null");
            }finally{
              /*  try {
                 //   server.close();
                //    socket.close();
                } catch (IOException ex) {
                    //socket closed
                    System.out.println(ex.toString());
                }*/

        }    
    
    }
    
}

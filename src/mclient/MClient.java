/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mclient;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author Garuba Abdulmalik
 */
public class MClient {

    static Socket s = null;
    static DataInputStream ips = null;
    static DataOutputStream dout = null;
    static String value, value1;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        s = new Socket("41.216.166.163", 5508);
        System.out.println("Connected to server");
        ips = new DataInputStream(s.getInputStream());
        dout = new DataOutputStream(s.getOutputStream());
        //BufferedReader br = new BufferedReader(ips);
        for(;;){
            if(ips.available()!= 0)
            {                value = ips.readUTF();
                System.out.println("rcx from server >>"+value);
                
                dout.writeUTF("SUCCESS");
                System.out.println("To Phone>>"+value);
            }
        
        }
        
        
    }
    
}

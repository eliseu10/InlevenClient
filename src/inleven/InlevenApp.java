/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inleven;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 *
 * @author up201303855
 */
public class InlevenApp {

    private static ObjectOutputStream out = null;
    private static ObjectInputStream in = null;
    private static Socket sockConn;
    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        		// TODO Auto-generated method stub
		int ServerPort = 5050;
		InetAddress ServerIPaddr = InetAddress.getByName("localhost");
		sockConn = new Socket(ServerIPaddr, ServerPort);
		
		try {
			out = new ObjectOutputStream(sockConn.getOutputStream());
			in = new ObjectInputStream(sockConn.getInputStream());
		} catch (IOException e) {
		}

		ActualState hr = new ActualState();
                inicialForm init = new inicialForm(out,in,hr);
                init.setVisible(true);

    }
    
}

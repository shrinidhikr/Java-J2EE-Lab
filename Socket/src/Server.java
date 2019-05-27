import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {

		try { 
	        ServerSocket ss = new ServerSocket(1999); 
	        Socket s = ss.accept(); 
	        DataInputStream dis = new DataInputStream(s.getInputStream());
	        String k = dis.readUTF(); 
	        FileOutputStream fos = new FileOutputStream("/home/shrinidhikr/Downloads/Socket/hi.txt"); 
	        byte[] b = k.getBytes(); 
	        fos.write(b);
	        System.out.println("File Transferred");
	        System.out.println(k);
	       } catch (IOException ie) { 
	         ie.printStackTrace(); 
	       }
	}
}

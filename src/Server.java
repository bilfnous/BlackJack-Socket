/**
 * @author B. Alfanous
 * CENG 320 Lab 04
 */

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.*;

class Server {

    public static void main(String argv[]) throws IOException, ClassNotFoundException {
        String message = "";
         
        System.out.println("Starting up Receiver");
        try {
            //Create the Server Socket
            ServerSocket serverSocket = new ServerSocket(40048); //Port 40040 is open on munro
            //Listen for a connection request - program waits for an incoming connection
            Socket socket = serverSocket.accept();
            System.out.println("We have a connection!!!");
            //Create data input and output streams based on client socket info
            ObjectInputStream remoteInput = new ObjectInputStream(socket.getInputStream());
            //The following could be used to create a synchronized conversation 
            BufferedReader localInput = new BufferedReader(new InputStreamReader(System.in));  
            //could have used Scanner - just did this to make both inputs look alike
            ObjectOutputStream remoteOutput = new ObjectOutputStream(socket.getOutputStream());

            Deck deck = new Deck();
            ArrayList<Card> deckCards = new ArrayList<Card>();
            deckCards = deck.getDeck();
	        ListIterator<Card> iterator = deckCards.listIterator();
 
          // System.out.println(Arrays.toString(deckCards.toArray())); 
            while(true) {
                message = (String)remoteInput.readObject();
                System.out.println("Msg from client: " + message);
                
                if(message.equals("deal")){
                   
                    if(iterator.hasNext())
                        remoteOutput.writeObject(iterator.next());
                }
                else if(message.equals("shuffle")){
                Collections.shuffle(deckCards);	
                }
                else if( Integer.parseInt(message) ==  1 || Integer.parseInt(message) == 11 ){
                System.out.println("your ace value is 1 or 11");
                }
	        }
      } catch(IOException ex) { ex.printStackTrace(); }
   }
}

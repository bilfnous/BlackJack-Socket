/**
 * @author B. Alfanous
 * CENG 320 Lab 04
 */

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
//implements Serializable

public class Deck implements Serializable{
    ArrayList<Card> cardsList = new ArrayList<Card>();  
    public Deck(){
        for(int i = 1; i < 14; i++){
            if(i == 1)
                cardsList.add(new Card("Ace","Spades"));
            else if(i == 11)
                cardsList.add(new Card("Jack","Spades"));
            else if(i == 12)
                cardsList.add(new Card("Queen","Spades"));
            else if(i == 13)
                cardsList.add(new Card("King","Spades"));
            else
                cardsList.add(new Card(Integer.toString(i),"Spades"));   
        }
        
        for(int i = 1; i < 14; i++){
            if(i == 1)
                cardsList.add(new Card("Ace","Clubs"));
            else if(i == 11)
                cardsList.add(new Card("Jack","Clubs"));
            else if(i == 12)
                cardsList.add(new Card("Queen","Clubs"));
            else if(i == 13)
                cardsList.add(new Card("King","Clubs"));
            else
                cardsList.add(new Card(Integer.toString(i),"Clubs"));   
        }
                
        for(int i = 1; i < 14; i++){
            if(i == 1)
                cardsList.add(new Card("Ace","Diamonds"));
            else if(i == 11)
                cardsList.add(new Card("Jack","Diamonds"));
            else if(i == 12)
                cardsList.add(new Card("Queen","Diamonds"));
            else if(i == 13)
                cardsList.add(new Card("King","Diamonds"));
            else
                cardsList.add(new Card(Integer.toString(i),"Diamonds"));   
        }
                
        for(int i = 1; i < 14; i++){
            if(i == 1)
                cardsList.add(new Card("Ace","Hearts"));
            else if(i == 11)
                cardsList.add(new Card("Jack","Hearts"));
            else if(i == 12)
                cardsList.add(new Card("Queen","Hearts"));
            else if(i == 13)
                cardsList.add(new Card("King","Hearts"));
            else
                cardsList.add(new Card(Integer.toString(i),"Hearts"));   
        }                       
        Collections.shuffle(cardsList);                
    }
    
    public ArrayList<Card> getDeck(){
        return cardsList;
    }
    
} 
    
   

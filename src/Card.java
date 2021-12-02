/**
 * @author B. Alfanous
 * CENG 320 Lab 04
 */ 

import java.io.Serializable;

public class Card implements Serializable{
    private String suit;
    private String rank;
    private int value = 0;

    public Card(){}    
    public Card(String rank, String suit){
        this.suit = suit;
        this.rank = rank;
    }
    
    
    public void setValue(int value){
     this.value = value;
    }
     
    public int getValue(){
        return this.value;
    }
        
    @Override
    public String toString(){
        return rank + " Of " + suit;
    }
    
    
    
}

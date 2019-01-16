/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackapplication;
import java.util.Random;
/**
 *
 * @author drew.musgrove
 */
public class Dealer {
    
    String[] deck = {"AH","2H","3H","4H","5H","6H","7H","8H","9H","10H","10KH","10QH","10JH","AD","2D","3D","4D","5D","6D","7D","8D","9D","10D","10KD","10QD","10JD","AS","2S","3S","4S","5S","6S","7S","8S","9S","10S","10KS","10QS","10JS","AC","2C","3C","4C","5C","6C","7C","8C","9C","10C","10KC","10QC","10JC"};

    
    String userCard1="X";String userCard2="X";String userCard3="X"; String userCard4="X"; String userCard5="X";
    int userCardInt1 = 0;int userCardInt2 = 0;int userCardInt3 = 0; int userCardInt4 = 0; int userCardInt5 = 0;
    String dealerCard1="";String dealerCard2="";String dealerCard3=""; String dealerCard4=""; String dealerCard5="";
    int total = 0;
    int userCard = 2;
    Random randCard = new Random();
    String status = "NG";
    
    public Dealer(){

    }
    
    public void deal(){
        
        userCard1 = deck[randCard.nextInt(52)];
        userCard2 = deck[randCard.nextInt(52)];
        System.out.println("");
        System.out.println("First card..."+userCard1);
        System.out.println("Second card..."+userCard2);
        System.out.println("");
        cal();
    }
    
    public String winner(){
        
        if (total > 21){
            return "L";
        }else if (total == 21 || (userCard == 5)){
            if (userCard == 5){
                System.out.println("5 Card Trick!");
            }
            return "W";
        }else{
            return "N";
        }
        
    }
    
    public void hitMe(){
        if (total < 21){            
            if (userCard == 2){
              userCard++;  
              userCard3 = deck[randCard.nextInt(52)];
              System.out.println("");
              System.out.println("Third card..."+userCard3);
              cal();
            }else if (userCard == 3){
              userCard++;   
              userCard4 = deck[randCard.nextInt(52)];
              System.out.println("");
              System.out.println("Forth card..."+userCard4);
              cal();
            }else if (userCard == 4){
              userCard++; 
              userCard5 = deck[randCard.nextInt(52)];
              System.out.println("");
              System.out.println("Fith card..."+userCard5);
              cal();
           }else if (userCard == 5){
               System.out.println("");
              System.out.println("5 card trick");  
           }
        }
    }
    
    public void stick(){
        
    }
    
    public int getTotal(){
        return total;
    }
    
    public void cal(){
        //card 1
        if (userCard1.charAt(0) == '1'){
            userCardInt1 = 10;
        } else if (userCard1.charAt(0) == '2'){
            userCardInt1 = 2;
        } else if (userCard1.charAt(0) == '3'){
            userCardInt1 = 3;
        } else if (userCard1.charAt(0) == '4'){
            userCardInt1 = 4;
        } else if (userCard1.charAt(0) == '5'){
            userCardInt1 = 5;
        } else if (userCard1.charAt(0) == '6'){
            userCardInt1 = 6;
        } else if (userCard1.charAt(0) == '7'){
            userCardInt1 = 7;
        } else if (userCard1.charAt(0) == '8'){
            userCardInt1 = 8;
        } else if (userCard1.charAt(0) == '9'){
            userCardInt1 = 9;
        } else  if (userCard1.charAt(0) == 'A'){
            userCardInt1 = 11;
        } else{
           userCardInt1 = 0; 
        }
        // card 2
        if (userCard2.charAt(0) == '1'){
            userCardInt2 = 10;
        } else if (userCard2.charAt(0) == '2'){
            userCardInt2 = 2;
        } else if (userCard2.charAt(0) == '3'){
            userCardInt2 = 3;
        } else if (userCard2.charAt(0) == '4'){
            userCardInt2 = 4;
        } else if (userCard2.charAt(0) == '5'){
            userCardInt2 = 5;
        } else if (userCard2.charAt(0) == '6'){
            userCardInt2 = 6;
        } else if (userCard2.charAt(0) == '7'){
            userCardInt2 = 7;
        } else if (userCard2.charAt(0) == '8'){
            userCardInt2 = 8;
        } else if (userCard2.charAt(0) == '9'){
            userCardInt2 = 9;
        } else  if (userCard2.charAt(0) == 'A'){
            userCardInt2 = 11;
        } else{
            userCardInt2 = 0; 
        }
        
        // card 3
        if (userCard3.charAt(0) == '1'){
            userCardInt3 = 10;
        } else if (userCard3.charAt(0) == '2'){
            userCardInt3 = 2;
        } else if (userCard3.charAt(0) == '3'){
            userCardInt3 = 3;
        } else if (userCard3.charAt(0) == '4'){
            userCardInt3 = 4;
        } else if (userCard3.charAt(0) == '5'){
            userCardInt3 = 5;
        } else if (userCard3.charAt(0) == '6'){
            userCardInt3 = 6;
        } else if (userCard3.charAt(0) == '7'){
            userCardInt3 = 7;
        } else if (userCard3.charAt(0) == '8'){
            userCardInt3 = 8;
        } else if (userCard3.charAt(0) == '9'){
            userCardInt3 = 9;
        } else  if (userCard3.charAt(0) == 'A'){
            userCardInt3 = 11;
        } else{
            userCardInt3 = 0; 
        }
        // card 4
        if (userCard4.charAt(0) == '1'){
            userCardInt4 = 10;
        } else if (userCard4.charAt(0) == '2'){
            userCardInt4 = 2;
        } else if (userCard4.charAt(0) == '3'){
            userCardInt4 = 3;
        } else if (userCard4.charAt(0) == '4'){
            userCardInt4 = 4;
        } else if (userCard4.charAt(0) == '5'){
            userCardInt4 = 5;
        } else if (userCard4.charAt(0) == '6'){
            userCardInt4 = 6;
        } else if (userCard4.charAt(0) == '7'){
            userCardInt4 = 7;
        } else if (userCard4.charAt(0) == '8'){
            userCardInt4 = 8;
        } else if (userCard4.charAt(0) == '9'){
            userCardInt4 = 9;
        } else  if (userCard4.charAt(0) == 'A'){
            userCardInt4 = 11;
        } else{
            userCardInt4 = 0; 
        }
        // card 5
        if (userCard5.charAt(0) == '1'){
            userCardInt5 = 10;
        } else if (userCard5.charAt(0) == '2'){
            userCardInt5 = 2;
        } else if (userCard5.charAt(0) == '3'){
            userCardInt5 = 3;
        } else if (userCard5.charAt(0) == '4'){
            userCardInt5 = 4;
        } else if (userCard5.charAt(0) == '5'){
            userCardInt5 = 5;
        } else if (userCard5.charAt(0) == '6'){
            userCardInt5 = 6;
        } else if (userCard5.charAt(0) == '7'){
            userCardInt5 = 7;
        } else if (userCard5.charAt(0) == '8'){
            userCardInt5 = 8;
        } else if (userCard5.charAt(0) == '9'){
            userCardInt5 = 9;
        } else  if (userCard5.charAt(0) == 'A'){
            userCardInt5 = 11;
        } else{
            userCardInt5 = 0; 
        }
        
        
        
        if (userCard1.charAt(0) == 'A' && userCard2.charAt(0) == '1'){
            total = 21;
        }else if (userCard2.charAt(0) == 'A' && userCard1.charAt(0) == '1'){
            total = 21;
        }else {
            total = userCardInt1 + userCardInt2 + userCardInt3 + userCardInt4 + userCardInt5;
        }
        
        System.out.println("");
        System.out.println("Total: "+total);   
        System.out.println("");
        winner();
    }
    
    
}

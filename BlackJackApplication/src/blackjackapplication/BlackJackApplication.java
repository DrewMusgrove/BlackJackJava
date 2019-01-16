/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackapplication;

import java.util.Scanner;

/**
 *
 * @author drew.musgrove
 */
public class BlackJackApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dealer d = new Dealer();
        String status = d.winner();
        Scanner sc = new Scanner(System.in);
        String userImput;
        String user = System.getProperty("user.name").toUpperCase();
        System.out.println("");
       
        String welcome = "Welcome "+user+" to Drews Blackjack game!       ";
        int i;
        for(i = 0; i < welcome.length(); i++){
            System.out.printf("%c", welcome.charAt(i));
            try{
                Thread.sleep(100);//0.1s pause between characters
            }catch(InterruptedException ex){
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("***Dealing***");
       
        
        d.deal();
        
        while (status.equals("N")){
            System.out.println("");
            System.out.println("Hit or Stick?");
            System.out.println("");
            userImput = sc.nextLine();
            System.out.println("");
            if (userImput.toUpperCase().equals("HIT")){
                d.hitMe();
                status = d.winner();
            }else{
                status = "S";
            }
            
            
        }
        
        if (status == "L"){
            System.out.println("BUST!");
        }else if (status == "W"){
            System.out.println("WINNER");
        }else{
            System.out.println("Your end number is " + d.getTotal());
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        //System.out.println("Thanks for playing Drews blackjack game");
        String text = "Thanks for playing Drews blackjack game!";
        int i2;
        for(i2 = 0; i2 < text.length(); i2++){
            System.out.printf("%c", text.charAt(i2));
            try{
                Thread.sleep(100);//0.5s pause between characters
            }catch(InterruptedException ex){
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        userImput = sc.nextLine();
        
    }
    
}

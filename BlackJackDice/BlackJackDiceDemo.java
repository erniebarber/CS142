/*
This project was written to test our
ability to write a class and demo file
for a Blackjack dice game.
Ernie Barber
CS142
*/

import java.util.*;
//import java.io.*;

public class BlackJackDiceDemo
{
   public static void main(String[] args)
   {
   //vars
   int playerDiceTot = 0;
   int dealerDiceTot = 0;
   boolean wannaroll= true;
   //String result;
   
   //methods
   //create a new game object
   BlackJackDice game = new BlackJackDice();
 
   while (wannaroll && playerDiceTot <21)
      {
      int input;
      playerDiceTot += game.getPlayerTotal();
      dealerDiceTot += game.getDealerTotal();
      System.out.println("Your dice rolled "+ game.getPlayerTotal());
      System.out.println("Your total is: " + playerDiceTot );
      //System.out.println("Dealer dice rolled: " +game.getDealerTotal());//used to test
      if (playerDiceTot > 21)
         {
            break;
            //endGame(dealerDiceTot, playerDiceTot); //
         }
      else
         {
            System.out.println("Would you like to roll the dice? yes=1 no=0");
         }   
      Scanner keyboard = new Scanner(System.in);
      input = keyboard.nextInt();
      if (input == 1)
         {
           //roll dice again for player and dealer
           game.rollPlayerDice();  
           game.rollDealerDice();
         }
      else 
         {
           wannaroll = false;//exit the loop
         }
      }
   //call endGame to see who won
   endGame(dealerDiceTot, playerDiceTot);
   }
   
   //Determine winner   
   public static void endGame(int dealerDiceTot, int playerDiceTot)     
   {
   System.out.println("Dealer's total is: " + dealerDiceTot );
   System.out.println("Your total is: " + playerDiceTot ); 
   if (dealerDiceTot > 21 && playerDiceTot > 21)
       {
         System.out.println("You both loose! " + dealerDiceTot+" to "+ playerDiceTot);
       }
   else if (dealerDiceTot > 21 && playerDiceTot <= 21)
       {
         System.out.println("You Win! " + playerDiceTot+" to "+ dealerDiceTot);
       }
   else if (dealerDiceTot <= 21 && playerDiceTot > 21)
       {
         System.out.println("You Loose! " + playerDiceTot+" to "+ dealerDiceTot);
       }   
   else if (dealerDiceTot > playerDiceTot)
       {
         System.out.println("The dealer won! " + dealerDiceTot+" to "+ playerDiceTot);
       }
   else if (dealerDiceTot < playerDiceTot)
       {
         System.out.println("You won! " + playerDiceTot+" to "+ dealerDiceTot);
       }   
   else 
       {
         System.out.println("You tied " + playerDiceTot+" to "+ dealerDiceTot);
       }
   } 
    
}
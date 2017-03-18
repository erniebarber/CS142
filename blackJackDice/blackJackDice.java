
/*
This project was written to test our
ability to write a class and demo file
for a Blackjack dice game.

This is the class file.

Ernie Barber
CS142
Spring 2017
*/


import java.util.*;

public class BlackJackDice
{
  //fields
  private int dealerTot;
  private int playerTot;

  //default constructor
  public BlackJackDice()
  {
  dealerTot = 0;
  playerTot = 0;
  rollDealerDice();
  rollPlayerDice();
  }
  
  //methods
  //Dealer dice rolls
  public void rollDealerDice()
  {
  Random Die1 = new Random();
  int dealDie1 = Die1.nextInt(6)+1;
  Random Die2 = new Random();
  int dealDie2 = Die2.nextInt(6)+1;
  dealerTot = dealDie1 + dealDie2;
  }
  
  //player dice rolls
  public void rollPlayerDice()
  {
  Random Die3 = new Random();
  int playDie3 = Die3.nextInt(6)+1;
  Random Die4 = new Random();
  int playDie4 = Die4.nextInt(6)+1;
  playerTot = playDie3 + playDie4;
  }  
  
  //get dealer dice total
  public int getDealerTotal()
  {
  return dealerTot; 
  }
  
  //get player dice total
  public int getPlayerTotal()
  {
  return playerTot; 
  }
  
}



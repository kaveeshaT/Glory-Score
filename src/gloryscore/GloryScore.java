/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gloryscore;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Kaveesha
 */

public class GloryScore {

  public static int letterScore=0;
  public static int totalNoBonus;
  public static int wordLength;
    
    
    public static void NoBonus(String word){
          //scrabble letters score
        
        char[] charArray= word.toCharArray();
        
        wordLength= word.length();              //Score acording to the length
        int lengthScore = wordLength * 5;
        
        //System.out.println(score);
        
        
        for(char printW : charArray){               //Scrabble letters score
          
            String lt=  Character.toString(printW);
            String letter= lt.toLowerCase();
            
            
     if(letter.equals("a")){
         letterScore=letterScore+1;
     }
    
    if(letter.equals("b")){
         letterScore=letterScore+3;
     }
    
    if(letter.equals("c")){
         letterScore=letterScore+3;
     }
    
    if(letter.equals("d")){
         letterScore=letterScore+2;
     }
    
    if(letter.equals("e")){
         letterScore=letterScore+1;
     }
    
    if(letter.equals("f")){
         letterScore=letterScore+4;
     }
    
    if(letter.equals("g")){
         letterScore=letterScore+2;
     }
    
    if(letter.equals("h")){
         letterScore=letterScore+4;
     }
    
    if(letter.equals("i")){
         letterScore=letterScore+1;
     }
    
    if(letter.equals("j")){
         letterScore=letterScore+8;
     }
    
    if(letter.equals("k")){
         letterScore=letterScore+5;
     }
    
    if(letter.equals("l")){
         letterScore=letterScore+1;
     }
    
    if(letter.equals("m")){
         letterScore=letterScore+3;
     }
    
    if(letter.equals("n")){
         letterScore=letterScore+1;
     }
    
    if(letter.equals("o")){
         letterScore=letterScore+1;
     }
    
    if(letter.equals("p")){
         letterScore=letterScore+3;
     }
    
    if(letter.equals("q")){
         letterScore=letterScore+10;
     }
    
    if(letter.equals("r")){
         letterScore=letterScore+1;
     }
    
    if(letter.equals("s")){
         letterScore=letterScore+1;
     }
    
    if(letter.equals("t")){
         letterScore=letterScore+1;
     }
    
    if(letter.equals("u")){
         letterScore=letterScore+1;
     }
    
    if(letter.equals("v")){
         letterScore=letterScore+4;
     }
    
    if(letter.equals("w")){
         letterScore=letterScore+4;
     }
    
    if(letter.equals("x")){
         letterScore=letterScore+8;
     }
    
    if(letter.equals("y")){
         letterScore=letterScore+4;
     }
    
    if(letter.equals("z")){
         letterScore=letterScore+10;
     }
        
        } 
        
        System.out.println("Score for letters ="+letterScore);
        
        totalNoBonus=letterScore+lengthScore;      //sum of above score whithout bounus score
        System.out.println("Score without bonus ="+totalNoBonus);
       
    
    //Reduse Score if there is unused letters
        
    int minusScore =11-wordLength;
    
       

    if(minusScore>=1){                         
        totalNoBonus= totalNoBonus - (totalNoBonus * minusScore /100);
        
    }
    
}
    
    
public static void mainLetterCheck(String letters, String word, int players){        //Checks main letters used or not
        
        char[] letterArray= letters.toCharArray();
        char[] wordArray=word.toCharArray();
        
        int nagativeS=9;        //reduse score if main letters are not used
        int letterUsed=0;       //time that main letters use
        int positiveS=0;        
        for(char l: letterArray){
            
            
            for(char w: wordArray){
                
                if(l==w){
                    //System.out.println("break");
                    nagativeS=nagativeS-3;
                    letterUsed++;
                    break;
                 }
                
                
            }
        }
        
        if(letterUsed==3){      //give bonus 10points if 3 main letters used
            positiveS=10;
        }
        
        
       // System.out.println(totalNoBonus);
       // System.out.println(nagativeS);
        int totalWithBonus= totalNoBonus - (totalNoBonus * nagativeS / 100) + positiveS; 
        
        if(wordLength==11){
            totalWithBonus=totalWithBonus*players;
        }
        
        System.out.println("Your total score ="+totalWithBonus);
        
        
        
}   
    
   
    
    public static void main(String[] args) {
        
     Scanner input=new Scanner(System.in);
     
        System.out.println("Number of players");
        int players=input.nextInt();
        
        System.out.println("Enter the 3 main letters(ex:abc)");
        String mainL=input.next();  
        
        System.out.println("Enter a word");
        String word=input.next();
        
        
     
     NoBonus(word);
     mainLetterCheck(mainL,word,players);
     
    }
    
    
   
    
}

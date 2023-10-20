/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pooadvanced;

/**
 *
 * @author hammi
 */
public class Pile {
    
    private final static int taille = 2;
    Object[] tab ; 
    private int pos;
    public Pile(){
       tab = new Object[taille];
       pos=0;
    }
   public void empiler(Object o){
       try{
       tab[pos]=o;
       pos++;
       }catch(ArrayIndexOutOfBoundsException ex){
           System.err.println(ex.getMessage()+" Tableau plein");
       }
   }
   public Object depiler() throws ArrayIndexOutOfBoundsException{
       Object x = tab[pos-1];
       pos--;
       return x;
   }
  // pile fifo 
  public Object sommet(){ // retourne l’objet au sommet de la pile
      Object x = tab[pos-1];
      return x;
 }
  public void depilerTout() { // permettant de vider toute la pile 
    // be3lani besh nraw kifeh nagzou fil error 
      while(true){
         try{
         depiler();
         }catch(ArrayIndexOutOfBoundsException ex){
             System.out.println(ex.getMessage());
             break;
         }
     }
  }

}   

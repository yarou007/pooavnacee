/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pooadvanced;

/**
 *
 * @author hammi
 */
public class appartement extends Exception {
    private int numAppart;
    private String adresse;
    
    public appartement(int numAppart,String adresse){
      /*try{
            this.adresse=adresse;
            this.numAppart=numAppart;
            if (adresse == null || numAppart<0){
                throw new IllegalArgumentException();
            }
      }catch(IllegalArgumentException ex){
          System.err.println(ex.getMessage());
      }*/
       if (adresse == null || numAppart<0){
                throw new IllegalArgumentException("L'adresse ne doit pas etre null et numAppart doit etre positif");
            }
       else {
             this.adresse=adresse;
             this.numAppart=numAppart;
       }
        
    }

    public int getNumAppart() {
        return numAppart;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setNumAppart(int numAppart) {
        this.numAppart = numAppart;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.pooadvanced;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author hammi
 */
public class POOAdvanced {
     static Scanner in = new Scanner(System.in); // 
    public static void main(String[] args)  {
       
        /* Question 1 
         System.out.println("Donner une chaine : ");
        String ch = in.nextLine();
        int x = Integer.parseInt(ch); // classe -> Integer , parseInt -> methode 
          System.out.print(x);
        try{
            int x = Integer.parseInt(ch);
            System.out.print(x);
        }catch(NumberFormatException ex){
               System.out.println(ex.getMessage()+" la chaine n'est pas convertible");
        }
*/
 // Question 2 
       /*  boolean ok=false;
       do{
               try{
                   System.out.println("Saisir num : ");
                    int num = in.nextInt();
                    ok = true;
                    System.out.println(ok);
                }catch(InputMismatchException ex){
                   System.out.println(ex.getMessage()+" Saisie inccorect saisie une autre fois");
                   in.nextLine();
               }
       } while(!ok);
        */ 
       
 // Question 3 
  /* Date d = null;
   SimpleDateFormat f = null ;
         try {
            System.out.println("Donner une date anniv: ");
            String s = in.nextLine(); // in -> Scanner
             f = new SimpleDateFormat("dd-MM-yyyy");
             d = f.parse(s); // parse chaine caractere en date
         // et metre dans l'objet d 
            // compile time exception
            
           Date dd = new Date(); // par defaut feha lyoum
            if (dd.before(d)) {
                throw new Exception("Date shoud be before today");
            } else {
                System.out.println("Date naissence: " + d);
            }
        } catch (ParseException px) {
               System.out.println(px.getMessage() + " format date incorrect");
        } catch (Exception x) {
            System.out.println(x.getMessage());
        }
         System.out.println(f.format(d));

  try{
       saisirDate();
       
  }catch(Exception e){
      System.out.println(e.getMessage());
  }
  */
  /// EXERCICE 2 
   /* Pile p = new Pile();
    p.empiler("Bonjour");
    p.empiler("Bonjour");
   
    p.depilerTout();
    }
  }
  /*
    /// question 3 exercice 1
      public static void saisirDate() throws Exception { // traitement delegué pour la date anniv 
        Date d = null;
        SimpleDateFormat f = null ;
         try {
            System.out.println("Donner une date anniv: ");
            String s = in.nextLine(); // in -> Scanner
             f = new SimpleDateFormat("dd-MM-yyyy");
             d = f.parse(s); // parse chaine caractere en date
              // et metre dans l'objet d 
            // compile time exception
            
           Date dd = new Date(); // par defaut feha lyoum
            if (dd.before(d)) {
                throw new Exception("Date shoud be before today");
               
            } else {
                System.out.println("Date naissence: " + d);
            }
        } catch (ParseException px) {
               System.out.println(px.getMessage() + " format date incorrect");
        } 
         System.out.println(f.format(d));
    }
   */
    }
}



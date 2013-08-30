/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import java.util.Scanner;

/**
 *
 * @author 202
 */
public class Parcial {

    /**
     * @param args the command line arguments
     */
     Parcial (String a,String b){
        String c;
         System.out.println("ingrese letra");
         Scanner ent=new Scanner (System.in);
         String q=ent.next();
         if (q.equals("a") ){
             System.out.println("1");
         }
         if (q.equals("e") ){
             System.out.println("1");
         }
         if (q.equals("i")){
             System.out.println("1");
         }
         if (  q.equals("o") ){
             System.out.println("1");
         }
         if (q.equals("u")){
             System.out.println("1");
         }
         else {
             System.out.println("0");
         }
     }
}

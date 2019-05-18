/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sayitahmin;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Eren
 */
public class SayiTahmin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        int uretilenSayi,tahminAdeti=1,tahmin,onceki = 1;
        Scanner oku = new Scanner(System.in);
        Random r = new Random();
        uretilenSayi = r.nextInt(99)+1;
        do {
            
            System.out.print(tahminAdeti+". Tahmin :");
            tahmin = oku.nextInt();
            if(tahmin == uretilenSayi){
                System.out.println("Tebrikler. "+tahminAdeti +" defada bildiniz.");
                break;
            }
            if (tahminAdeti ==10){
                System.out.println("Tahmin Hakkınız Doldu.  Tutulan sayı:"+ uretilenSayi);
                break;
                    }   
            else if(uretilenSayi>tahmin){
               System.out.println("Bilemediniz.. Daha büyük bir Sayı Giriniz\nKalan Hakkınız :"+(10-tahminAdeti));
               
               tahminAdeti++;
               System.out.println(uretilenSayi);
            }
            else if(uretilenSayi<tahmin){
               System.out.println("Bilemediniz.. Daha küçük bir Sayı Giriniz\nKalan Hakkınız :"+(10-tahminAdeti));
               System.out.println(uretilenSayi);
                tahminAdeti++;
                System.out.println(uretilenSayi);
            }
        } while (uretilenSayi!=tahmin);
        
    }
    
}

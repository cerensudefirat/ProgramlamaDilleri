package gramer;

import java.util.ArrayList;
import java.util.Scanner;

public class kontrol {
    int i=0;
    int k=0;
    String[] OZNE = {"Ben", "Sen", "Hasan", "Nurşah", "Elif", "Abdulrazzak", "Şehribanu", "Zeynelabidin", "Naki"};
    String[] NESNE = {"Bahçe", "Okul", "Park", "Sınıf", "Yarın", "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar", "Merkez", "Ev", "Kitap", "Defter", "Güneş", "Beydağı"};
    String[] YUKLEM = {"Gitmek", "Gelmek", "Okumak", "Yazmak", "Yürümek", "Görmek"};
    public void cumle_olusturma(String cumle1){
      String[] cumle2=cumle1.split("\\s+");
      for(i=0;i<cumle2.length;i++){
          System.out.println(cumle2[i]);
      }
      if(cumle2.length==3){
          for(i=0;i<OZNE.length;i++){
            if(cumle2[0].equals(OZNE[i])){          
                k++;
                System.out.println(k);
            }         
          }
          for(i=0;i<NESNE.length;i++){
            if(cumle2[1].equals(NESNE[i])){   
                k++;
                System.out.println(k);
            }
          }
          for(i=0;i<YUKLEM.length;i++){
            if(cumle2[2].equals(YUKLEM[i])){  
                k++;
                System.out.println(k);
            }
          }
        if(k==3)
            System.out.println("EVET");
        else
            System.out.println("HAYIR");
      }
      else{
          System.out.println("HAYIR");
      }
      
    }
    
}

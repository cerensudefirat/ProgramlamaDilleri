package gramer;

import java.util.Scanner;

public class Gramer {
    public static void main(String[] args) {
        kontrol k=new kontrol();
        System.out.print("Bir Cümle Giriniz: ");
        Scanner cumle = new Scanner(System.in);
        String cumle1 = cumle.nextLine(); 
        k.cumle_olusturma(cumle1);
    }
    
}

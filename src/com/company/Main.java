package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int k ,i ,toplam=0 ,sayac=0;

        System.out.print("Bi sayı giriniz=");
        k =inp.nextInt();
       for (i=1;i<=k;i++){
        if (i%12==0){
            System.out.println(i);
          toplam=toplam+i;
            sayac+=1;

        }



    }System.out.println("ortalama="+(toplam/sayac));

}}

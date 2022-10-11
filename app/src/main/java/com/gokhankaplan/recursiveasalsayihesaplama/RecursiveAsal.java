package com.gokhankaplan.recursiveasalsayihesaplama;

import java.util.Scanner;

public class RecursiveAsal{

        static String asal(int a,int b){

            if(a%b==0){
                asal(a,b+1);

                return " asal bir sayı değildir.";
            }
            if(a==2){
                return " asal bir sayıdır.";
            }

            else{
                return " asal bir sayıdır.";
            }

        }
        public static void main(String[] args)

        {
            while (true) {
                Scanner scan=new Scanner(System.in);
                System.out.print("Lütfen bir sayi giriniz: ");
                int sayi=scan.nextInt();

                System.out.println(sayi+asal(sayi,2));
            }
            
        }
}




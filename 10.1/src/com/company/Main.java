package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  //  static ArrayList<Integer> list = new ArrayList<>();
    static int[] array = new int[50];
    static int n;

    public static void main(String[] args) {
        // write your code here

        for (int i = 0; i < 50; i++) {
            array[i]= i+1;
        }
        for (int i = 0; i < 50; i++) System.out.println(array[i]);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cate numere va contine setul? ");
        n = scanner.nextInt();
        int[] sir = new int[n];
        for (int i = 0; i < sir.length; i++)
        sir[i] = scanner.nextInt();


        cautare(array, sir);

    }


    static void cautare(int[] array, int[] sir) {
        int c=  0;
        int x = 0;

        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i <array.length; i++)
            lista.add(array[i]);

        for (int i = 0; i <array.length; i++) {
            for (int j=0;j<sir.length;j++) {
                if (array[i] == sir[j]) {

                    lista.add(c, sir[j]);
                    lista.remove(array[i]);
                    array[i] = array[i + 1];
                    c++;



                } else {

                    x = sir[j];

                }
            }
        }
        lista.add(0, x);
        System.out.println(lista);

    }
}

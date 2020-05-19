package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);



        char choice;
        System.out.println("......MENIU.......");
        System.out.println(" A - Adaugare nod");
        System.out.println(" V - Vizualizare nod");
        System.out.println(" S - Interschimbare noduri adiacente");
        System.out.println(" X - Parasire program");

        do
        {System.out.println("Alegeti o optiune: ");
            choice=scanner.next().charAt(0);
            choice=Character.toUpperCase(choice);
            switch(choice)
            {
                case 'A': addIntoList(); break;
                case 'V': printList(); break;
                case 'S': shiftNodes(); break;
                case 'X': System.out.println("Ati ales sa parasiti programul! :("); break;
                default: System.out.println("Optiune eronata!"+"\n"+"Mai incearca!"+"\n");}}
        while(choice!='x' && choice!='X');

    }

    public static void addIntoList(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nod: ");
        int element = scanner.nextInt();
        list.add(element);

    }



    public static void printList(){
        ArrayList<Integer> reversedList = new ArrayList<>(list);

        System.out.println("Lista:");
        System.out.println("Traversata de la stanga la dreapta:");
        System.out.println(list);
        System.out.println("Traversata de la dreapta la stanga:");

        Collections.reverse(reversedList);
        System.out.println(reversedList);


    }

    public static void shiftNodes(){
        if(list.size()%2==0){
            for(int i=0; i<list.size();i++)

        {   int a = list.get(i);
            list.set(i, list.get(i+1));

            list.set(i+1, a);
            i++;

        }}

        else {
            for(int i=0; i<list.size()-1;i++)

            {   int a = list.get(i);
                list.set(i, list.get(i+1));
                list.set(i+1, a);
                i++;

        }
        list.set(list.indexOf(list.size()), list.get(list.size()-1));}


        System.out.println(list);


    }
}

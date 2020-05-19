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
        System.out.println(" C - Cautare nod");
        System.out.println(" S - Stergere nod");
        System.out.println(" V - Vizualizare nod");
        System.out.println(" R - Lista circulara");
        System.out.println(" X - Parasire program");

        do
        {System.out.println("Alegeti o optiune: ");
            choice=scanner.next().charAt(0);
            choice=Character.toUpperCase(choice);
            switch(choice)
            {
                case 'A': addIntoList(); break;
                case 'S': deleteFromList(); break;
                case 'C': searchInList(); break;
                case 'V': printList(); break;
                case 'R': circular(); break;
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

    public static void deleteFromList(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nod: ");
        int element = scanner.nextInt();
        for(int i=0;i<list.size();i++)
        {if(list.get(i)==element)
            list.remove(i);}

    }

    public static void searchInList(){
        boolean ok=false;
        int gasit=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nod: ");
        int element= scanner.nextInt();
        for(int i=0;i<list.size();i++)
        {if(list.get(i)==element)
        {
            ok=true;
            gasit = i;
        }
        }
        if(ok) System.out.println("Gasit in lista pe pozitia "+gasit);
        else System.out.println("Nu a fost gasit in lista");}



    public static void printList(){
        ArrayList<Integer> reversedList = new ArrayList<>(list);

        System.out.println("Lista:");
        System.out.println("Traversata de la stanga la dreapta:");
        System.out.println(list);
        System.out.println("Traversata de la dreapta la stanga:");

        Collections.reverse(reversedList);
        System.out.println(reversedList);


    }

    public static void circular(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lista va incepe cu pozitia: ");
        int ind = scanner.nextInt();
        Integer[] a = new Integer[list.size()];
        list.toArray(a);

        Integer[] b = new Integer[(2 * list.size())];

        for (int i = 0; i < list.size(); i++)
            b[i] = b[list.size() + i] = a[i];


        for (int i = ind; i < list.size() + ind; i++)
            System.out.print(b[i]+" ");
        System.out.println();
    }

}
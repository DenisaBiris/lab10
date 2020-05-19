package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static  ArrayList<ArrayList<String>> studenti = new ArrayList<>();
    public static ArrayList<ArrayList<String>>  lista = new ArrayList<>();

    public static void main(String[] args) {
        // write your code here
        int[] optiune = {4, 3, 3};

        createList(studenti);
        System.out.println("\nLista initiala a studentilor admisi este: ");
        System.out.println("--------------------------------------------");
        printList(studenti);


        System.out.println("\nNumarul de locuri pentru fiecare optiune este:");
        for (int i = 0; i < optiune.length ; i++) {
            System.out.println("Optiunea # "+(i+1)+" : " + optiune[i]);
        }


        selectOption(studenti,lista);
        for (int i = 0; i <3 ; i++) {
            System.out.println("Studentii admisi la optiunea "+ (i+1) +" sunt : ");
            printLists(lista.get(i),lista.get(i).size());
        }

        System.out.println();

        System.out.println("\n\n\nStudentii in ordine alfabetica dupa optiuni : ");
        for (int i = 0; i <3 ; i++) {
            System.out.println("Optiunea O"+ (i+1));
            System.out.println("........................");
            sortByName(lista.get(i),lista.get(i).size());
            printLists(lista.get(i),lista.get(i).size());
            System.out.println();
        }

    }
    public static void createList(ArrayList<ArrayList<String>> studenti)
    {
        int n = 10;

        for (int i = 0; i < n; i++) {
            studenti.add(new ArrayList());
        }

        int i = 0;
        studenti.get(i).add("Maria");
        studenti.get(i).add("9.00");
        studenti.get(i).add("2");
        studenti.get(i).add("1");
        studenti.get(i).add("3");
        i++;
        studenti.get(i).add("Robert");
        studenti.get(i).add("9.77");
        studenti.get(i).add("1");
        studenti.get(i).add("3");
        studenti.get(i).add("2");
        i++;
        studenti.get(i).add("Dominic");
        studenti.get(i).add("9.30");
        studenti.get(i).add("1");
        studenti.get(i).add("2");
        studenti.get(i).add("3");
        i++;
        studenti.get(i).add("Isabela");
        studenti.get(i).add("9.88");
        studenti.get(i).add("1");
        studenti.get(i).add("2");
        studenti.get(i).add("3");
        i++;
        studenti.get(i).add("Codruta");
        studenti.get(i).add("9.28");
        studenti.get(i).add("2");
        studenti.get(i).add("1");
        studenti.get(i).add("3");
        i++;
        studenti.get(i).add("Marian");
        studenti.get(i).add("9.18");
        studenti.get(i).add("1");
        studenti.get(i).add("2");
        studenti.get(i).add("3");
        i++;
        studenti.get(i).add("Rares");
        studenti.get(i).add("9.02");
        studenti.get(i).add("1");
        studenti.get(i).add("2");
        studenti.get(i).add("3");
        i++;
        studenti.get(i).add("Alex");
        studenti.get(i).add("9.15");
        studenti.get(i).add("2");
        studenti.get(i).add("1");
        studenti.get(i).add("3");
        i++;
        studenti.get(i).add("Bogdan");
        studenti.get(i).add("9.29");
        studenti.get(i).add("3");
        studenti.get(i).add("1");
        studenti.get(i).add("2");
        i++;
        studenti.get(i).add("Vlad");
        studenti.get(i).add("9.45");
        studenti.get(i).add("2");
        studenti.get(i).add("1");
        studenti.get(i).add("3");
    }



    public static void selectOption(ArrayList<ArrayList<String>> studenti, ArrayList<ArrayList<String>> lista)
    {
        int[] optiune = {4, 3, 3};

        for (int k = 0; k < 3; k++) {
            lista.add(new ArrayList());
        }



        for (int j = 0; j < studenti.size(); j++) {

            int poz = 2;

            if (optiune[Integer.parseInt(studenti.get(j).get(poz)) - 1] != 0)
            {

                lista.get(Integer.parseInt(studenti.get(j).get(poz)) - 1).add(studenti.get(j).get(0));
                lista.get(Integer.parseInt(studenti.get(j).get(poz)) - 1).add(studenti.get(j).get(1));
                optiune[Integer.parseInt(studenti.get(j).get(poz)) - 1]--;

            }
            else {

                poz++;
                if (optiune[Integer.parseInt(studenti.get(j).get(poz)) - 1] != 0)
                {

                    lista.get(Integer.parseInt(studenti.get(j).get(poz)) - 1).add(studenti.get(j).get(0));
                    lista.get(Integer.parseInt(studenti.get(j).get(poz)) - 1).add(studenti.get(j).get(1));
                    optiune[Integer.parseInt(studenti.get(j).get(poz)) - 1]--;

                }
                else {

                    poz++;
                    if (optiune[Integer.parseInt(studenti.get(j).get(poz)) - 1] != 0)
                    {

                        lista.get(Integer.parseInt(studenti.get(j).get(poz)) - 1).add(studenti.get(j).get(0));
                        lista.get(Integer.parseInt(studenti.get(j).get(poz)) - 1).add(studenti.get(j).get(1));
                        optiune[Integer.parseInt(studenti.get(j).get(poz)) - 1]--;

                    }
                }
            }

        }
    }



    public static void sortByName(ArrayList<String> lista, int size)
    {
        boolean ok;
        do{
            ok=false;
            for (int i = 0; i <size-3 ; i=i+2) {
                String aux1= lista.get(i);
                String aux2= lista.get(i+1);
                String aux3= lista.get(i+2);
                String aux4= lista.get(i+3);
                if(aux1.compareTo(aux3)>0)
                {
                    lista.set(i,aux3);
                    lista.set(i+2,aux1);
                    lista.set(i+1,aux4);
                    lista.set(i+3,aux2);
                    ok=true;
                }
            }
        } while (ok);

    }



    public static void printLists(ArrayList<String> lista,int size)
    {
        for (int i = 0; i <size-1 ; i=i+2) {
            System.out.println(lista.get(i) +"\t\t"+lista.get(i+1));
        }
    }


    public static void printList(ArrayList<ArrayList<String>> studenti)
    {
        System.out.println("Numele\t\tMedia\t\tOp 1\t\tOp 2\t\tOp 3\n");
        for (int i = 0; i <studenti.size() ; i++) {
            for (int j = 0; j <studenti.get(i).size() ; j++) {

                System.out.print(studenti.get(i).get(j) + "\t\t");
            }
            System.out.println();
        }
    }


}
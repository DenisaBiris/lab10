package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static ArrayList<Integer> list = new ArrayList<>();
    static int element;
    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);



        char choice;
        System.out.println("......MENIU.......");
        System.out.println(" A - Adaugare nod");
        System.out.println(" S - Stergere nod");
        System.out.println(" V - Vizualizare nod");
        System.out.println(" X - Parasire program");

        do
        {System.out.println("Alegeti o optiune: ");
            choice=scanner.next().charAt(0);
            choice=Character.toUpperCase(choice);
            switch(choice)
            {
                case 'A': addIntoList(); break;
                case 'S': deleteFromList(); break;
                case 'V': printList(); break;
                case 'X': System.out.println("Ati ales sa parasiti programul! :("); break;
                default: System.out.println("Optiune eronata!"+"\n"+"Mai incearca!"+"\n");}}
        while(choice!='x' && choice!='X');
        int n = list.size();
        Integer[] array = new Integer[n];
        list.toArray(array);
        int[] par = new int[(n%2!=0) ? (n/2) +1 : n/2];
        int[] impar = new int[n/2];
        divide(par,par.length,impar,impar.length,array,array.length);
        shellSort(par,par.length);
        heapSort(impar, impar.length);
        merge(par,par.length,impar,impar.length,array);
        List<Integer> lista = Arrays.asList(array);
        System.out.println("Lista finala: ");
        System.out.println(lista);
    }


    public static  void heapify(int[] v, int n, int i)
    {
        int smallest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && v[l] < v[smallest])
            smallest = l;

        if (r < n && v[r] < v[smallest])
            smallest = r;

        if (smallest != i) {
            int temp = v[i];
            v[i] = v[smallest];
            v[smallest] = temp;

            heapify(v, n, smallest);
        }
    }

    public static void heapSort(int[] v, int n)
    {
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(v, n, i);
        for (int i = n - 1; i >= 0; i--) {

            int temp = v[0];
            v[0] = v[i];
            v[i] = temp;

            heapify(v, i, 0);
        }
    }
    public static void shellSort(int[] v, int n)
    {

        for (int gap = n/2; gap > 0; gap /= 2)
        {
            for (int i = gap; i < n; i += 1)
            {
                int temp = v[i];

                int j;
                for (j = i; j >= gap && v[j - gap] > temp; j -= gap)
                    v[j] = v[j - gap];


                v[j] = temp;
            }
        }
    }
    public static void divide(int[] par, int p, int[] impar, int q, Integer[] v, int n) {
        p=0;q=0;
        for (int i = 0; i < v.length; i++) {
            if (i % 2 == 0) {
                par[p] = v[i];
                p++;
            } else {
                impar[q] = v[i];
                q++;
            }}


    }
    public static void merge(int[] par, int p, int[] impar, int q, Integer[] arr)
    {
        int i = 0, j = 0, k = 0;
        while (i < p && j < q)
        {arr[k] =par[i];
            i += 1;
            k += 1;
            arr[k] = impar[j];
            j += 1;
            k += 1;
        }
        if(i<par.length){
            arr[k] = par[i];
            i++;}
    }

     static void addIntoList() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti elementul pe care doriti sa il adaugati la lista:");
        element=scanner.nextInt();
        list.add(element);
    }

    static void deleteFromList(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ce element doriti sa stergeti? introduceti indexul acestuia: ");
        element=scanner.nextInt();
        list.remove(element);
    }

    static void printList(){

        System.out.println("Lista: ");
        System.out.println(list);
    }

}

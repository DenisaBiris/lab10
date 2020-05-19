package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {
        // write your code here
        addIntoList();
        System.out.println("Lista nesortata: ");
        printList();
        bubbleSort();
        System.out.println("Lista sortata: ");
        printList();

    }

    public static void addIntoList() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cate elemente are lista? ");
        int n = scanner.nextInt();
        for(int i=0;i<n;i++)
        {
        System.out.println("Nod: ");
        String element = scanner.next();
        list.add(element);}

    }

    public static void bubbleSort(){
        boolean ok;
        String temp;
        do{ ok=false;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i).compareTo(list.get(i+1))>0){
                {
                    temp = list.get(i);
                    list.set(i,list.get(i+1) );
                    list.set(i+1, temp);
                    ok=true;
                }
            }
            }

        } while(ok);


        }

        public static void printList(){

            System.out.println(list);



    }

}
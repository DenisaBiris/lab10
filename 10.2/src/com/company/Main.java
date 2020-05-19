package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int n;
    static int m;

    static int element;
    static ArrayList<Integer> lista1 = new ArrayList<>();
    static ArrayList<Integer> lista2 = new ArrayList<>();


    public static void main(String[] args) {
        // write your code here
          getList(lista1,m);
          getList(lista2,n);
        Integer[] arr1 = new Integer[lista1.size()];
        lista1.toArray(arr1);
        Integer[] arr2 = new Integer[lista2.size()];
        lista2.toArray(arr2);

        m=lista1.size();
        n=lista2.size();
        System.out.println("Primul polinom: ");
        printPoly(arr1, m);
        System.out.println("\nAl doilea polinom: ");
        printPoly(arr2, n);
        Integer[] sum = add(arr1, arr2, m, n);
        Integer[] prod = multiply(arr1,arr2,m,n);
        int size = max(m, n);
        System.out.println("\nSuma polinoamelor: ");
        printPoly(sum, size);
        System.out.println("\nProdusul polinoamelor: ");
        printPoly(prod, m+n-1);

    }

    public static void getList(ArrayList<Integer> lista1, int m) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cate elemente doriti sa aiba polinomul? ");

        m = scanner.nextInt();

        System.out.println("Introduceti elementele polinomului:");
        for (int i = 0; i < m; i++) {
            System.out.print("Coeficient #" + (i+1) + " : ");
            element = scanner.nextInt();
            lista1.add(element);}


    }



    public static int max(int m, int n) {
        return Math.max(m, n);

    }

   public static Integer[] add(Integer[] A, Integer[] B, int m, int n) {
       int size = max(m, n);
       Integer[] sum = new Integer[size];

        if(m>n)
        {
            for (int i = 0; i < m; i++) {
                sum[i] = A[i];
            }

            for (int i = 0; i < n; i++) {
                sum[m - n + i] += B[i];
            }
        }
        else
            {
            for(int i=0;i<n;i++)
            sum[i]=B[i];
            for(int i=0;i<m;i++)
            sum[n-m+i]+=A[i];
             }
       return sum;

   }

   public  static Integer[] multiply(Integer[] A, Integer[] B, int m, int n)
    {
        Integer[] prod = new Integer[m + n - 1];

        for (int i = 0; i < m + n - 1; i++)
        {
           prod[i] = 0;
        }

        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                prod[i + j] += A[i] * B[j];
            }
        }

        return prod;
    }
   public static void printPoly(Integer[] poly, int n) {
        int a = n-1;

        for (int i = 0; i <n; i++) {
            System.out.print(poly[i]);
                System.out.print("x^" + a);

            if (i != n-1) {
                System.out.print(" + ");
               a--;
            }
        }
    }

}

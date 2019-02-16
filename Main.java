package com.company;

import com.company.LectorTeclado;

import java.util.Random;
class main {


    public static void main(String[] args) {

        int n = 200;
        int [] rArray = new int[n];
        System.out.println(" Tiempo de Bouble Sort");
        System.out.println("");
        System.out.println("");
        while(n < 20000) {


            long starTime = System.nanoTime();
            bubleSort(rArray);
            long endTime = System.nanoTime();
            long Time = endTime - starTime;

            System.out.println("El tiempo en nano segundos de bubble sort para " + n + " numeros es de = " +Time);
            n+=n;
        }
        Random lr = new Random();
        LectorTeclado lt = new LectorTeclado();
        System.out.println("");
        System.out.println("Elija el tamano que quiere que sea el arreglo de bubble sort y se le llenara automaticamente con numeros al azar : ");
        int t = lt.leerEntero("", "tiene que ser un entero");

        int [] nArray = new int [t] ;
        for (int i = 0 ; i < nArray.length ; i++) {
            nArray[i] = lr.nextInt(200);
        }

        bubleSort(nArray);
        System.out.println("");
        System.out.println("");
        System.out.print("Este es bubble sort:");
        System.out.println("");
        for (int i = 0 ; i < nArray.length; i++) {

            System.out.println(""+nArray[i]);

        }
        System.out.println("");
        System.out.println("");

        System.out.print("**** este el tiempo de merge sort: ");
        System.out.println("");
        System.out.println("");

        int u = 200;
        int [] eArray = new int[u];
        while(u < 20000) {


            long starTime = System.nanoTime();
            sort(eArray);
            long endTime = System.nanoTime();
            long Time = endTime - starTime;

            System.out.println("El tiempo en nano segundos de merge sort para " + u + " numeros es de = " +Time);
            u+=u;
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");




        System.out.println("");
        System.out.println("");


        System.out.println("Elija el tamano que quiere que sea el arreglo de merge sort y se le llenara automaticamente con numeros al azar : ");
        int o = lt.leerEntero("", "tiene que ser un entero");

        int [] mArray = new int [o] ;
        for (int i = 0 ; i < mArray.length ; i++) {
            mArray[i] = lr.nextInt(200);
        }


        System.out.println("");
        System.out.println("");
        sort(mArray);
        System.out.print("Este es merge sort");
        System.out.println("");
        System.out.print("");
        System.out.print("");

        for (int i = 0 ; i < mArray.length; i++) {

            System.out.println(""+mArray[i]);


        }
        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("");
        System.out.println("");

        System.out.print("***este el tiempo de shell sort: ");
        System.out.print("");
        System.out.println("");
        System.out.println("");

        System.out.println("");
        int l = 200;
        int [] lArray = new int[l];
        while(l < 20000) {


            long starTime = System.nanoTime();
            shell(lArray);
            long endTime = System.nanoTime();
            long Time = endTime - starTime;

            System.out.println("El tiempo en nano segundos de shell sort para " + l + " numeros es de = " +Time);
            l+=l;
        }

        System.out.println("");
        System.out.println("");


        System.out.println("Elija el tamano que quiere que sea el arreglo de shell sort y se le llenara automaticamente con numeros al azar : ");
        int p = lt.leerEntero("", "tiene que ser un entero");

        int [] arregloshell = new int [p];

        for(int i =0; i < arregloshell.length ; i++) {
            arregloshell[i] = lr.nextInt(200);

        }


        System.out.println("");
        System.out.println("");
        shell(arregloshell);
        System.out.print("Este es shell sort");
        System.out.println("");
        System.out.print("");
        System.out.print("");

        for (int i = 0 ; i < arregloshell.length; i++) {

            System.out.println(""+arregloshell[i]);}
        System.out.print("");
        System.out.print("");



        System.out.println("");
        System.out.println("");

        System.out.print("**** este el tiempo de heap sort: ");
        System.out.print("");
        System.out.println("");
        System.out.println("");

        System.out.println("");
        int k = 200;
        int [] kArray = new int[k];
        while(k < 20000) {


            long starTime = System.nanoTime();
            heapSort(kArray);
            long endTime = System.nanoTime();
            long Time = endTime - starTime;

            System.out.println("El tiempo en nano segundos de heap sort para " + k + " numeros es de = " +Time);
            k+=k;
        }

        System.out.println("");
        System.out.println("");



        System.out.println("");
        System.out.println("Elija el tamano que quiere que sea el arreglo de heap sort y se le llenara automaticamente con numeros al azar : ");
        int w = lt.leerEntero("", "tiene que ser un entero");

        int [] wArray = new int [w] ;
        for (int i = 0 ; i < wArray.length ; i++) {
            wArray[i] = lr.nextInt(200);
        }


        heapSort(wArray);;
        System.out.println("");
        System.out.println("");
        System.out.print("Este es heap sort:");
        System.out.println("");

        for (int i = 0; i < wArray.length; i++) {
            System.out.println(""+wArray[i]);

        }
        System.out.println("");
        System.out.println("");

    }



    public static int[] llenarArreglo (int [] a) {
        a = new int[15];
        Random r = new Random();

        for(int i = 0; i < a.length ; i++) {
            a[i] = r.nextInt();
        }
        return a;
    }

    public static int[] bubleSort (int [] a) {
        for(int i = 0 ; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;

    }


    public static void merge(int [] n,int a,int b,int c,int d){
        d = Math.min(d,n.length-1);
        int mer [] = new int[d-a + 1];
        int idx = 0;
        int or = a;
        while( idx < mer.length)
            if((a>b ?false: (c>d? true : n[a] <= n[c])))
                mer[idx++] = n[a++];
            else
                mer[idx++] = n[c++];

        for(int i = 0; i < mer.length; i++)
            n[or + i] = mer[i];
    }



    public static void shell (int [] arreglo) {
        int saltar, i, j, k , h;
        saltar = arreglo.length / 2;

        while (saltar > 0) {
            for (i = saltar; i < arreglo.length; i ++) {
                j = i - saltar;
                while(j >=0) {
                    k = j + saltar;
                    if (arreglo[j] <= arreglo[k]) {
                        j = - 1;
                    }else {
                        h = arreglo[j];
                        arreglo[j] = arreglo [k];
                        arreglo [k] = h;
                        j = j-saltar;
                    }
                }
            }
            saltar = saltar /2;
        }

    }






    public static int[] sort(int []n){
        int i = 1;
        for(i = 1; i < n.length;i*=2){
            for(int j = 0;j < n.length; j += i){
                int p = i >> 1;
                merge(n,j,j+p-1,j+p,j+p+p-1);
            }
        }
        merge(n,0,i/2 - 1,i/2,n.length);
        return n;
    }

    

    public static void heapSort(int[] v) {
        final int N = v.length;
        for(int nodo = N/2; nodo>=0; nodo--) heap(v, nodo, N-1);
        for(int nodo = N-1; nodo>=0; nodo--) {
            int temp = v[0];
            v[0]    = v[nodo];
            v[nodo] = temp;
            heap(v, 0, nodo-1);
        }
    }

    public static void heap(int[] v, int nodo, int fin) {
        int izq = 2*nodo+1;
        int der = izq+1;
        int may;
        if(izq>fin) return;
        if(der>fin) may=izq;
        else may= v[izq]>v[der]?izq:der;
        if(v[nodo] < v[may]) {
            int temp = v[nodo];
            v[nodo] = v[may];
            v[may]  = temp;
            heap(v, may, fin);
        }
    }





}
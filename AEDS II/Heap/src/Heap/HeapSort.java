/*
 Disponibilizado em Projeto de Algoritmos com implementações em Java e C++
 Autor: Nivio Ziviani
 */
package Heap;

import Item.Item;


public class HeapSort{
       
    public static void HeapSort(Item v[], int n) {
        Heap fpHeap = new Heap(v) ;
        int dir = n;
        fpHeap.constroi(); // constroi o heap
        while ( dir > 1) { // ordena o vetor
            Item x = v[1];
            v[1] = v[dir-1];
            v[dir-1] = x;
            dir--;
            fpHeap. refaz (1 , dir);
        }
    }
}


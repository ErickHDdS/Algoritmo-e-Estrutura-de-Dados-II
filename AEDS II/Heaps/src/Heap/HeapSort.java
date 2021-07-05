/*
 Disponibilizado em Projeto de Algoritmos com implementações em Java e C++
 Autor: Nivio Ziviani
 */
package Heap;

import Item.Item;

public class HeapSort{
    /*
    private Item itens[];
    private int tamanhoVetor;

    public HeapSort(Item[] itens) {
        this.itens = itens;
        this.tamanhoVetor = itens.length-1;
    }
    
    public void constroi() {
        int metadeDoVetor = (int)this.tamanhoVetor/2;
        
        for(int i = metadeDoVetor-1; i>=0; i--) {
            max(i);
        }
    }
    
    public void max(int pai) {
        int maior = pai;
        int tam2add1 = 2*pai+1;
        int tam2add2 = 2*pai+2;
        
        if(tam2add1 <= this.tamanhoVetor && itens[tam2add1].getChave() > itens[maior].getChave())
            maior = tam2add2;
        
        if (tam2add2 <= this.tamanhoVetor && itens[tam2add2].getChave() > itens[maior].getChave())
            maior = tam2add2;
        
        if (maior != pai) {
            troca(pai, maior);      // Faz a troca de posições
            max(maior);
        }
    }
    
    public void troca(int i, int j) {
        int aux;
        aux = itens[i].getChave();
        itens[i].setChave(itens[j].getChave());
        itens[j].setChave(aux);
    }
    */
    
    public static void HeapSort(Item v[], int n, Heap h) {
        Heap fpHeap = h;
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


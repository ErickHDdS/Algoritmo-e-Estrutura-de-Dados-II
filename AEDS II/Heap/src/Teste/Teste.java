package Teste;

import Heap.Heap;
import Heap.HeapSort;
import Item.Item;

public class Teste {
        public static void main(String[] args) {
        
        int contadorDeComparacoes,paginasVisitadas, elemento, n, posicao;
        
            //item que será pesquisado e nunca será encontrado
            Item itemSearch = new Item(200000);
            
            //n variando de 10.000 até 100.000, com intervalo de 10.000;
            for (n = 1; n <= 10; n++) 
            {
                
                Item itensOrdenados[] = new Item[n * 10000];
                
                for (elemento = 1, posicao = 0; elemento <= n * 10000; elemento++, posicao++) {
                    Item item = new Item(elemento); //cria um novo item com o elemento            
                    itensOrdenados[posicao] = item; //insere os elementos ordenadamente
                }
               
               HeapSort.HeapSort(itensOrdenados, itensOrdenados.length);
               Heap heap = new Heap(itensOrdenados);
               contadorDeComparacoes = itensOrdenados.length - 1;
               //Dados obtidos
               String nameFile = "ordemOrdenadaCrescente Heap";
               heap.gravaDados(n, contadorDeComparacoes,nameFile);
            }
            
            
            /*
            //pesquisar por um elemento não existente em cada árvore
            for(n = 1; n <= 10; n++)
            {
                // Arvore SBB
                
                tempoInicial = System.nanoTime();
                //contadorDeComparacoes = arvoreSBB.pesquisa(itemSearch);
                arvoreSBB.pesquisa(itemSearch);
                contadorDeComparacoes = arvoreSBB.getContadorDeComparacoes();
                tempoFinal = System.nanoTime();
                tempoGasto = (tempoFinal-tempoInicial);
                //Dados obtidos
                //System.out.println("Arvore SBB: "+n+" Tempo Gasto para fazer a procura: "+tempoGasto+"(nano segundos)"+" Numero de Comparacoes: "+contadorDeComparacoes);
                arvoreSBB.gravaDados(n, contadorDeComparacoes, tempoGasto,"ordemOrdenadaArvoreSBB");
                
                // Arvore B - ordem x
                tempoInicial = System.nanoTime();
                //contadorDeComparacoes = arvoreB.pesquisa(itemSearch);
                arvoreB.pesquisa(itemSearch);
                paginasVisitadas = arvoreB.getPaginasVisitadas();
                tempoFinal = System.nanoTime();
                tempoGasto = (tempoFinal-tempoInicial);
                //Dados obtidos
                //System.out.println("Arvore B: "+n+" Ordem: "+ordem+" Tempo Gasto para fazer a procura: "+tempoGasto+"(nano segundos)"+" Paginas visitadas: "+paginasVisitadas);
                String nameFile = "ordemOrdenadaArvoreB - Ordem "+ordem;
                arvoreSBB.gravaDados(n, paginasVisitadas, tempoGasto,nameFile);
            }
           */
        }
}

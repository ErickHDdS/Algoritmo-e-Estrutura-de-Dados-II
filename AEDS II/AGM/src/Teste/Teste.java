package Teste;

import ArvoreGeradoraMinima.AgmPrim;
import ArvoreGeradoraMinima.XGrafo;

public class Teste {
    public static void main(String[] args) throws Exception {
        XGrafo grafo1 = new XGrafo(9); // Primeiro grafo
       
        // inserindo elementos grafo1:
        grafo1.insereAresta(0, 0, 0);
        grafo1.insereAresta(0, 1, 15);
        grafo1.insereAresta(0, 3, 5);
                
        grafo1.insereAresta(1, 1, 0);
        grafo1.insereAresta(1, 0, 15);
        grafo1.insereAresta(1, 2, 10);
        grafo1.insereAresta(1, 4, 10);
        grafo1.insereAresta(1, 6, 5);
        
        grafo1.insereAresta(2, 2, 0);
        grafo1.insereAresta(2, 1, 10);
        grafo1.insereAresta(2, 3, 5);
        grafo1.insereAresta(2, 4, 10);
        grafo1.insereAresta(2, 5, 10);
        grafo1.insereAresta(2, 7, 5);
        
        grafo1.insereAresta(3, 3, 0);
        grafo1.insereAresta(3, 0, 5);
        grafo1.insereAresta(3, 2, 5);
        grafo1.insereAresta(3, 5, 5);
        grafo1.insereAresta(3, 8, 10);
        
        grafo1.insereAresta(4, 4, 0);
        grafo1.insereAresta(4, 1, 10);
        grafo1.insereAresta(4, 2, 10);
        grafo1.insereAresta(4, 6, 5);
        grafo1.insereAresta(4, 7, 5);
        
        grafo1.insereAresta(5, 5, 0);
        grafo1.insereAresta(5, 2, 10);
        grafo1.insereAresta(5, 3, 5);
        grafo1.insereAresta(5, 8, 20);
        
        grafo1.insereAresta(6, 6, 0);
        grafo1.insereAresta(6, 1, 5);
        grafo1.insereAresta(6, 4, 5);
        grafo1.insereAresta(6, 7, 10);
        
        grafo1.insereAresta(7, 7, 0);
        grafo1.insereAresta(7, 2, 5);
        grafo1.insereAresta(7, 4, 5);
        grafo1.insereAresta(7, 6, 10);
        grafo1.insereAresta(7, 8, 10);
        
        grafo1.insereAresta(8, 8, 0);
        grafo1.insereAresta(8, 3, 10);
        grafo1.insereAresta(8, 5, 20);
        grafo1.insereAresta(8, 7, 10);
        
        AgmPrim g1 = new AgmPrim(grafo1);
        g1.obterAgm(1);
        g1.imprime();
        System.out.println(g1.getPeso());
        
        // inserindo elementos grafo2:
        /*
        XGrafo grafo2 = new XGrafo(10); // Segundo grafo
        
        
        grafo2.insereAresta(9, 9, 0);
        grafo2.insereAresta(9, 6, 1);
        
        grafo2.insereAresta(0, 0, 0);
        grafo2.insereAresta(0, 1, 1);
        grafo2.insereAresta(0, 2, 1);
        grafo2.insereAresta(0, 3, 1);
        grafo2.insereAresta(0, 5, 1);
        
        grafo2.insereAresta(5, 5, 0);
        grafo2.insereAresta(5, 4, 1);
        grafo2.insereAresta(5, 6, 1);
        
        grafo2.insereAresta(1, 1, 0);
        grafo2.insereAresta(1, 2, 1);
        
        grafo2.insereAresta(2, 2, 0);
        grafo2.insereAresta(2, 3, 1);
        grafo2.insereAresta(2, 4, 1);
        
        grafo2.insereAresta(4, 4, 0);
        grafo2.insereAresta(4, 6, 1);
        
        grafo2.insereAresta(6, 6, 0);
        grafo2.insereAresta(6, 7, 1);
        grafo2.insereAresta(6, 8, 1);
        
        grafo2.insereAresta(7, 7, 0);
        grafo2.insereAresta(7, 8, 1);
        
        grafo2.insereAresta(8, 8, 0);
        
        grafo2.insereAresta(3, 3, 0);
       
        //RESULTADOS: 
        Boolean respGrafo1, respGrafo2;
        */
    }
}

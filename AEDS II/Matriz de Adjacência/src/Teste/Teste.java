package Teste;

import Matriz.XCiclo;
import Matriz.XGrafo;

public class Teste {
    public static void main(String[] args) {
        XGrafo grafo1 = new XGrafo(8); // Primeiro grafo
       
        // inserindo elementos grafo1:
        grafo1.insereAresta(0, 0, 0);
        grafo1.insereAresta(0, 1, 1);
        grafo1.insereAresta(0, 2, 0);
        grafo1.insereAresta(0, 3, 1);
        grafo1.insereAresta(0, 4, 1);
        grafo1.insereAresta(0, 5, 0);
        grafo1.insereAresta(0, 6, 0);
        grafo1.insereAresta(0, 7, 0);
        grafo1.insereAresta(1, 0, 1);
        grafo1.insereAresta(1, 1, 0);
        grafo1.insereAresta(1, 2, 1);
        grafo1.insereAresta(1, 3, 0);
        grafo1.insereAresta(1, 4, 0);
        grafo1.insereAresta(1, 5, 1);
        grafo1.insereAresta(1, 6, 0);
        grafo1.insereAresta(1, 7, 0);
        grafo1.insereAresta(2, 0, 0);
        grafo1.insereAresta(2, 1, 1);
        grafo1.insereAresta(2, 2, 0);
        grafo1.insereAresta(2, 3, 1);
        grafo1.insereAresta(2, 4, 0);
        grafo1.insereAresta(2, 5, 0);
        grafo1.insereAresta(2, 6, 1);
        grafo1.insereAresta(2, 7, 0);
        grafo1.insereAresta(3, 0, 1);
        grafo1.insereAresta(3, 1, 0);
        grafo1.insereAresta(3, 2, 1);
        grafo1.insereAresta(3, 3, 0);
        grafo1.insereAresta(3, 4, 0);
        grafo1.insereAresta(3, 5, 0);
        grafo1.insereAresta(3, 6, 0);
        grafo1.insereAresta(3, 7, 1);
        grafo1.insereAresta(4, 0, 1);
        grafo1.insereAresta(4, 1, 0);
        grafo1.insereAresta(4, 2, 0);
        grafo1.insereAresta(4, 3, 0);
        grafo1.insereAresta(4, 4, 0);
        grafo1.insereAresta(4, 5, 1);
        grafo1.insereAresta(4, 6, 0);
        grafo1.insereAresta(4, 7, 1);
        grafo1.insereAresta(5, 0, 0);
        grafo1.insereAresta(5, 1, 1);
        grafo1.insereAresta(5, 2, 0);
        grafo1.insereAresta(5, 3, 0);
        grafo1.insereAresta(5, 4, 1);
        grafo1.insereAresta(5, 5, 0);
        grafo1.insereAresta(5, 6, 1);
        grafo1.insereAresta(5, 7, 0);
        grafo1.insereAresta(6, 0, 0);
        grafo1.insereAresta(6, 1, 0);
        grafo1.insereAresta(6, 2, 1);
        grafo1.insereAresta(6, 3, 0);
        grafo1.insereAresta(6, 4, 0);
        grafo1.insereAresta(6, 5, 1);
        grafo1.insereAresta(6, 6, 0);
        grafo1.insereAresta(6, 7, 1);
        grafo1.insereAresta(7, 0, 0);
        grafo1.insereAresta(7, 1, 0);
        grafo1.insereAresta(7, 2, 0);
        grafo1.insereAresta(7, 3, 1);
        grafo1.insereAresta(7, 4, 1);
        grafo1.insereAresta(7, 5, 0);
        grafo1.insereAresta(7, 6, 1);
        grafo1.insereAresta(7, 7, 0);
        
        // Ciclos grafo1
        XCiclo cicloGrafo1 = new XCiclo(grafo1);
        
        // inserindo elementos grafo2:
        XGrafo grafo2 = new XGrafo(10); // Segundo grafo
        
        grafo2.insereAresta(0, 0, 0);
        grafo2.insereAresta(0, 1, 1);
        grafo2.insereAresta(0, 2, 1);
        grafo2.insereAresta(0, 3, 1);
        grafo2.insereAresta(0, 4, 0);
        grafo2.insereAresta(0, 5, 1);
        grafo2.insereAresta(0, 6, 0);
        grafo2.insereAresta(0, 7, 0);
        grafo2.insereAresta(0, 8, 0);
        grafo2.insereAresta(1, 0, 0);
        grafo2.insereAresta(1, 1, 0);
        grafo2.insereAresta(1, 2, 1);
        grafo2.insereAresta(1, 3, 0);
        grafo2.insereAresta(1, 4, 0);
        grafo2.insereAresta(1, 5, 0);
        grafo2.insereAresta(1, 6, 0);
        grafo2.insereAresta(1, 7, 0);
        grafo2.insereAresta(1, 8, 0);
        grafo2.insereAresta(1, 9, 0);
        grafo2.insereAresta(2, 0, 0);
        grafo2.insereAresta(2, 1, 0);
        grafo2.insereAresta(2, 2, 0);
        grafo2.insereAresta(2, 3, 1);
        grafo2.insereAresta(2, 4, 1);
        grafo2.insereAresta(2, 5, 0);
        grafo2.insereAresta(2, 6, 0);
        grafo2.insereAresta(2, 7, 0);
        grafo2.insereAresta(2, 8, 0);
        grafo2.insereAresta(2, 9, 0);
        grafo2.insereAresta(3, 0, 0);
        grafo2.insereAresta(3, 1, 0);
        grafo2.insereAresta(3, 2, 0);
        grafo2.insereAresta(3, 3, 0);
        grafo2.insereAresta(3, 4, 0);
        grafo2.insereAresta(3, 5, 0);
        grafo2.insereAresta(3, 6, 0);
        grafo2.insereAresta(3, 7, 0);
        grafo2.insereAresta(3, 8, 0);
        grafo2.insereAresta(3, 9, 0);
        grafo2.insereAresta(4, 0, 0);
        grafo2.insereAresta(4, 1, 0);
        grafo2.insereAresta(4, 2, 0);
        grafo2.insereAresta(4, 3, 0);
        grafo2.insereAresta(4, 4, 0);
        grafo2.insereAresta(4, 5, 0);
        grafo2.insereAresta(4, 6, 1);
        grafo2.insereAresta(4, 7, 0);
        grafo2.insereAresta(4, 8, 0);
        grafo2.insereAresta(4, 9, 0);
        grafo2.insereAresta(5, 0, 0);
        grafo2.insereAresta(5, 1, 0);
        grafo2.insereAresta(5, 2, 0);
        grafo2.insereAresta(5, 3, 0);
        grafo2.insereAresta(5, 4, 1);
        grafo2.insereAresta(5, 5, 0);
        grafo2.insereAresta(5, 6, 1);
        grafo2.insereAresta(5, 7, 0);
        grafo2.insereAresta(5, 8, 0);
        grafo2.insereAresta(5, 9, 0);
        grafo2.insereAresta(6, 0, 0);
        grafo2.insereAresta(6, 1, 0);
        grafo2.insereAresta(6, 2, 0);
        grafo2.insereAresta(6, 3, 0);
        grafo2.insereAresta(6, 4, 0);
        grafo2.insereAresta(6, 5, 0);
        grafo2.insereAresta(6, 6, 0);
        grafo2.insereAresta(6, 7, 1);
        grafo2.insereAresta(6, 8, 1);
        grafo2.insereAresta(6, 9, 0);
        grafo2.insereAresta(7, 0, 0);
        grafo2.insereAresta(7, 1, 0);
        grafo2.insereAresta(7, 2, 0);
        grafo2.insereAresta(7, 3, 0);
        grafo2.insereAresta(7, 4, 0);
        grafo2.insereAresta(7, 5, 0);
        grafo2.insereAresta(7, 6, 0);
        grafo2.insereAresta(7, 7, 0);
        grafo2.insereAresta(7, 8, 1);
        grafo2.insereAresta(7, 9, 0);
        grafo2.insereAresta(8, 0, 0);
        grafo2.insereAresta(8, 1, 0);
        grafo2.insereAresta(8, 2, 0);
        grafo2.insereAresta(8, 3, 0);
        grafo2.insereAresta(8, 4, 0);
        grafo2.insereAresta(8, 5, 0);
        grafo2.insereAresta(8, 6, 0);
        grafo2.insereAresta(8, 7, 0);
        grafo2.insereAresta(8, 8, 0);
        grafo2.insereAresta(8, 9, 0);
        grafo2.insereAresta(9, 0, 0);
        grafo2.insereAresta(9, 1, 0);
        grafo2.insereAresta(9, 2, 0);
        grafo2.insereAresta(9, 3, 0);
        grafo2.insereAresta(9, 4, 0);
        grafo2.insereAresta(9, 5, 0);
        grafo2.insereAresta(9, 6, 1);
        grafo2.insereAresta(9, 7, 0);
        grafo2.insereAresta(9, 8, 0);
        grafo2.insereAresta(9, 9, 0);
        
        // Ciclos grafo2
        XCiclo cicloGrafo2 = new XCiclo(grafo2);
        
        //RESULTADOS: 
        Boolean respGrafo1, respGrafo2;
        
        respGrafo1 = cicloGrafo1.getCiclo();
        respGrafo2 = cicloGrafo2.getCiclo();
        
        if(respGrafo1) 
            System.out.println("O GRAFO 1 POSSUI CICLO");
        else
            System.out.println("O GRAFO 1 NÃO POSSUI CICLO");
        
        if(respGrafo2) 
            System.out.println("O GRAFO 2 POSSUI CICLO");
        else
            System.out.println("O GRAFO 2 NÃO POSSUI CICLO");
    }
}

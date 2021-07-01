/*
 Disponibilizado em Projeto de Algoritmos com implementações em Java e C++
 Autor: Nivio Ziviani
 */
package Heap;

import File.CreateTextFile;
import Item.Item;

    public class Heap {
        private Item v [] ;
        private int n;
        
        public Heap (Item v []) {
            this.v = v; 
            this.n = this.v.length - 1;
        }
        
//        public  void refaz (int esq, int dir);
//        public  void constroi ();
//        public  Item max ();
//        public  void aumentaChave (int i, Object chaveNova) throws Exception;
//        public  void insere (Item x) throws Exception;
    
        public Item max() {
            return this.v[1];
        }
        
        public void refaz(int esq, int dir) {
            int j = esq * 2; 
            Item x = this.v[esq];
            
            while (j <= dir) {
                if((j < dir) && (this.v[j].compara(this.v[j+1]) < 0))
                    j++;
                if(x.compara(this.v[j]) >= 0) 
                    break;
                this.v[esq] = this.v[j] ;
                esq = j ; 
                j = esq * 2;
            }
            this.v[esq] = x;
        }
        
        public void constroi() {
            int esq = n/2 + 1;
            while (esq > 1) {
                esq--;
                this.refaz(esq, this.n) ;
            }
        }
        
        public void aumentaChave ( int i , Object chaveNova) throws Exception {
        Item x = this.v[i];
        if(chaveNova == null)
            throw new Exception ( "Erro : chaveNova com valor null " ) ;
        x.alteraChave(chaveNova);
        while ((i > 1) && (x.compara(this.v[i/2]) >= 0)) {
            this.v[i] = this.v[i/2]; 
            i/= 2;
        }
        this.v[i] = x;
        }
        
        public void insere ( Item x) throws Exception {
            this.n++;
            if(this.n == this.v.length ) 
                throw new Exception ( "Erro : heap cheio" );
            Object chaveNova = x.recuperaChave();
            this.v[this.n] = x;
            this.v[this.n].alteraChave (new Integer( Integer .MIN_VALUE)); //−1
            this.aumentaChave(this.n, chaveNova);
        }
        
        public void gravaDados(int n, int contadorDeComparacoes, String nomeArquivo)
        {
            String string = "Heap: "+n+" Numero de Comparacoes: "+contadorDeComparacoes+"\n";
            CreateTextFile.escrever(string, nomeArquivo);
        }
}
/*
 Disponibilizado em Projeto de Algoritmos com implementações em Java e C++
 Autor: Nivio Ziviani
 */
package Arvore;

public class FPHeapMinIndireto {
    private double pDistancia[];          // pesoDistancia de cada vertice
    private double pTempo[];             // pesoTempo de cada vertice
    
    private int n, pos[], fp[];
    
    //Inicializa o Prim
    public FPHeapMinIndireto(double pD[], double pT[], int v[]) {
        this.pDistancia = pD;                         //vetor de pesos
        this.pTempo = pT;                         //vetor de pesos
        
        this.fp = v;                        
        this.n = this.fp.length-1;
        this.pos = new int [this.n];        //posicao do vertice
        for (int u = 0; u < this.n; u++) 
            this.pos[u] = u+1;
    }
    
    // refazendo o heap
    public void refaz(int esq, int dir) {
        int j = esq * 2; 
        int x = this.fp[esq];
        while (j <= dir ) {
            if(( j < dir ) && (this.pDistancia[fp[j]] > this.pDistancia[fp[j + 1]]) && (this.pTempo[fp[j]] > this.pTempo[fp[j + 1]])) 
                j++;
            if((this.pDistancia[x] <= this.pDistancia[fp[j]]) && (this.pTempo[x] <= this.pTempo[fp[j]])) 
                break;
            this.fp[esq] = this.fp[j]; 
            this.pos[fp[j]] = esq;
            esq = j;
            j = esq * 2;
        }
        this.fp[esq] = x; 
        this.pos[x] = esq;
    }
    
    // metodo para construir o heap
    public void constroi() {
        int esq = n / 2 + 1;
        while (esq > 1) {
            esq--; 
            this.refaz(esq, this .n); 
        }
    }
    
    public int retiraMin() throws Exception {
        int minimo;
        if(this.n < 1) 
            throw new Exception ("Erro : heap vazio");
        else {
            minimo = this.fp[1]; 
            this.fp[1] = this.fp[this.n];
            this.pos[fp[this.n--]] = 1; 
            this.refaz (1 ,this.n);
        }
        return minimo;
    }
    
    // reconstruindo a AGM com menor peso
    public void diminuiChave(int i , double chaveNova) throws Exception {
        i = this.pos[i]; 
        int x = fp [ i ];
        if(chaveNova < 0)
            throw new Exception ( "Erro : chaveNova com valor incorreto" ) ;
        this.pDistancia[x] = chaveNova;
        this.pTempo[x] = chaveNova;
        while (( i > 1) && (this.pDistancia[x] <= this.pDistancia[fp[ i / 2 ]]) && (this.pTempo[x] <= this.pTempo[fp[ i / 2 ]])) {
            this.fp[i] = this.fp[i / 2]; 
            this.pos[fp[ i / 2]] = i; 
            i /= 2;
        }
        this.fp[i] = x;
        this.pos[x] = i;
    }
    
    boolean vazio() { 
        return this.n == 0;
    }
    
}
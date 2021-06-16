/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturas;

import grafocidades.Cidade;
import grafocidades.Mapa;

/**
 *
 * @author Elton Alves
 */
public class Pilha {
    private int tamanho;
    private Cidade[] cidades;
    private int topo;

    public Pilha(int tamanho) {
        this.tamanho = tamanho;
        cidades = new Cidade[this.tamanho];
        topo = -1;
    }

    public void empilhar(Cidade cidade) {
        if (!pilhaCheia()) {
            this.cidades[++topo] = cidade;
        } else {
            System.out.println("A pilha já está cheia");
        }
    }

    public Cidade desempilhar() {
        if (!pilhaVazia()) {
            return cidades[topo--];
        } else {
            System.out.println("A pilha já está vazia");
            return null;
        }
    }

    public Cidade getTopo() {
        return cidades[topo];
    }

    private boolean pilhaVazia() {
        return (topo == -1);
    }

    private boolean pilhaCheia() {
        return (topo == tamanho - 1);
    }

}

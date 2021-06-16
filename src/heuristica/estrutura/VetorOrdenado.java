package heuristica.estrutura;

import heuristica.grafocidades.Cidade;
import heuristica.grafocidades.Mapa;

public class VetorOrdenado {
    private Cidade[] cidades;
    private int numeroElementos;

    public VetorOrdenado(int tamanho) {
        cidades = new Cidade[tamanho];
        numeroElementos = 0;
    }

    public void inserir(Cidade cidade) {
        int posicao;
        for (posicao = 0; posicao < numeroElementos; posicao++) {
            if (cidades[posicao].getDistanciaObjetivo() > cidade.getDistanciaObjetivo()) {
                break;
            }
        }

        for (int k = numeroElementos; k > posicao; k--) {
            cidades[k] = cidades[k - 1];
        }

        cidades[posicao] = cidade;
        numeroElementos++;
    }

    public Cidade getPrimeiro() {
        return cidades[0];
    }

    public void mostrar() {
        for (int i = 0; i < numeroElementos; i++) {
            System.out.println(cidades[i].getNome() + " - " + cidades[i].getDistanciaObjetivo());
        }
    }

}


package heuristica.grafocidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Cidade implements Serializable {

    private String nome;
    private boolean visitado;
    private int distanciaObjetivo;
    private List<Adjacente> adjacentes;

    public Cidade(String nome, int distanciaObjetivo) {
        this.nome = nome;
        visitado = false;
        this.distanciaObjetivo = distanciaObjetivo;
        adjacentes = new ArrayList<Adjacente>();
    }

    public void addCidadeAdjacente(Adjacente cidade) {
        adjacentes.add(cidade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public List<Adjacente> getAdjacentes() {
        return adjacentes;
    }

    public int getDistanciaObjetivo() {
        return distanciaObjetivo;
    }

    public void setDistanciaObjetivo(int distanciaObjetivo) {
        this.distanciaObjetivo = distanciaObjetivo;
    }
}

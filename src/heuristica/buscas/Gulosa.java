package heuristica.buscas;

import heuristica.estrutura.VetorOrdenado;
import heuristica.grafocidades.Adjacente;
import heuristica.grafocidades.Cidade;
import heuristica.grafocidades.Mapa;

public class Gulosa {
	private VetorOrdenado fronteira;
	private Cidade objetivo;
	private boolean achou;

	public Gulosa(Cidade objetivo) {
		this.objetivo = objetivo;
		achou = false;
	}

	public void buscar(Cidade atual) {
		System.out.println("\nAtual:" + atual.getNome());
		atual.setVisitado(true);

		if (atual == objetivo) {
			achou = true;
		} else {
			fronteira = new VetorOrdenado(atual.getAdjacentes().size());
			for (Adjacente a : atual.getAdjacentes()) {
				if (!a.getCidade().isVisitado()) {
					a.getCidade().setVisitado(true);
					fronteira.inserir(a.getCidade());
				}
			}
			fronteira.mostrar();
			if (fronteira.getPrimeiro() != null) {
				buscar(fronteira.getPrimeiro());
			}
		}

	}

	public static void main(String args[]) {
		Mapa mapa = new Mapa();
		long startTime = System.currentTimeMillis();
		Gulosa g = new Gulosa(mapa.getBucharest());
		g.buscar(mapa.getArad());
		System.out.println("Tempo: " + (System.currentTimeMillis() - startTime) + "ms");

	}

}

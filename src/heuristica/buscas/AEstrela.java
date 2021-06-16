package heuristica.buscas;

import heuristica.estrutura.VetorOrdenadoAdjacente;
import heuristica.grafocidades.Adjacente;
import heuristica.grafocidades.Cidade;
import heuristica.grafocidades.Mapa;

public class AEstrela {
	private VetorOrdenadoAdjacente fronteira;
	private Cidade objetivo;
	private boolean achou;
	// public List<String> caminhoCidades = new ArrayList<>();

	public AEstrela(Cidade objetivo) {
		this.objetivo = objetivo;
		achou = false;
	}

	public void buscar(Cidade atual) {
		System.out.println("\nAtual:" + atual.getNome());
		atual.setVisitado(true);

		if (atual == objetivo) {
			achou = true;
		} else {
			fronteira = new VetorOrdenadoAdjacente(atual.getAdjacentes().size()); // percorre os adjacentes
			for (Adjacente a : atual.getAdjacentes()) {
				if (!a.getCidade().isVisitado()) {
					a.getCidade().setVisitado(true);
					fronteira.inserir(a);
				}
			}
			fronteira.mostrar();
			buscar(fronteira.getPrimeiro());
		}
		// return null;
	}

	public static void main(String args[]) {
		Mapa mapa = new Mapa();
		long startTime = System.currentTimeMillis();
		AEstrela a = new AEstrela(mapa.getBucharest());
		a.buscar(mapa.getArad());
		System.out.println("Tempo: " + (System.currentTimeMillis() - startTime) + "ms");
	}
}

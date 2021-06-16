
package heuristica.grafocidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Mapa implements Serializable {
	private Cidade arad;
	private Cidade zerind;
	private Cidade oradea;
	private Cidade sibiu;
	private Cidade rimnicuVilcea;
	private Cidade fagaras;
	private Cidade timisoara;
	private Cidade lugoj;
	private Cidade mehadia;
	private Cidade dobreta;
	private Cidade craiova;
	private Cidade pitesti;
	private Cidade bucharest;
	private List<Cidade> listaCidades;

	public Mapa() {
		arad = new Cidade("Arad", 366);
		bucharest = new Cidade("Bucharest", 0);
		craiova = new Cidade("Craiova", 160);
		dobreta = new Cidade("Dobreta", 242);
		fagaras = new Cidade("Faguras", 178);
		lugoj = new Cidade("Lugoj", 244);
		mehadia = new Cidade("Merradia", 241);
		oradea = new Cidade("Oreadea", 234);
		pitesti = new Cidade("Pitesti", 98);
		rimnicuVilcea = new Cidade("Rimnicu Vilcea", 193);
		sibiu = new Cidade("Sibiu", 253);
		timisoara = new Cidade("Timisoara", 329);
		zerind = new Cidade("Zerind", 374);
		listaCidades = new ArrayList<>();

		arad.addCidadeAdjacente(new Adjacente(zerind, 75));
		arad.addCidadeAdjacente(new Adjacente(timisoara, 118));
		arad.addCidadeAdjacente(new Adjacente(sibiu, 87));
		listaCidades.add(arad);

		zerind.addCidadeAdjacente(new Adjacente(arad, 75));
		zerind.addCidadeAdjacente(new Adjacente(oradea, 71));
		listaCidades.add(zerind);

		oradea.addCidadeAdjacente(new Adjacente(zerind, 71));
		oradea.addCidadeAdjacente(new Adjacente(sibiu, 151));
		listaCidades.add(oradea);

		sibiu.addCidadeAdjacente(new Adjacente(fagaras, 99));
		sibiu.addCidadeAdjacente(new Adjacente(rimnicuVilcea, 80));
		listaCidades.add(sibiu);

		fagaras.addCidadeAdjacente(new Adjacente(sibiu, 99));
		fagaras.addCidadeAdjacente(new Adjacente(bucharest, 211));
		listaCidades.add(fagaras);

		rimnicuVilcea.addCidadeAdjacente(new Adjacente(pitesti, 97));
		rimnicuVilcea.addCidadeAdjacente(new Adjacente(craiova, 146));
		listaCidades.add(rimnicuVilcea);

		rimnicuVilcea.addCidadeAdjacente(new Adjacente(pitesti, 97));
		rimnicuVilcea.addCidadeAdjacente(new Adjacente(craiova, 146));
		listaCidades.add(rimnicuVilcea);

		pitesti.addCidadeAdjacente(new Adjacente(rimnicuVilcea, 97));
		pitesti.addCidadeAdjacente(new Adjacente(craiova, 138));
		pitesti.addCidadeAdjacente(new Adjacente(bucharest, 101));
		listaCidades.add(pitesti);

		craiova.addCidadeAdjacente(new Adjacente(pitesti, 138));
		craiova.addCidadeAdjacente(new Adjacente(rimnicuVilcea, 146));
		craiova.addCidadeAdjacente(new Adjacente(dobreta, 120));
		listaCidades.add(craiova);

		dobreta.addCidadeAdjacente(new Adjacente(mehadia, 75));
		dobreta.addCidadeAdjacente(new Adjacente(craiova, 120));
		listaCidades.add(dobreta);

		mehadia.addCidadeAdjacente(new Adjacente(dobreta, 75));
		mehadia.addCidadeAdjacente(new Adjacente(lugoj, 70));
		listaCidades.add(mehadia);

		lugoj.addCidadeAdjacente(new Adjacente(mehadia, 70));
		lugoj.addCidadeAdjacente(new Adjacente(timisoara, 111));
		listaCidades.add(lugoj);

		timisoara.addCidadeAdjacente(new Adjacente(lugoj, 111));
		timisoara.addCidadeAdjacente(new Adjacente(arad, 118));
		listaCidades.add(timisoara);

		bucharest.addCidadeAdjacente(new Adjacente(fagaras, 211));
		bucharest.addCidadeAdjacente(new Adjacente(pitesti, 101));
		listaCidades.add(bucharest);
	}

	public Cidade getArad() {
		return arad;
	}

	public void setArad(Cidade arad) {
		this.arad = arad;
	}

	public Cidade getZerind() {
		return zerind;
	}

	public void setZerind(Cidade zerind) {
		this.zerind = zerind;
	}

	public Cidade getOradea() {
		return oradea;
	}

	public void setOradea(Cidade oradea) {
		this.oradea = oradea;
	}

	public Cidade getSibiu() {
		return sibiu;
	}

	public void setSibiu(Cidade sibiu) {
		this.sibiu = sibiu;
	}

	public Cidade getRimnicuVilcea() {
		return rimnicuVilcea;
	}

	public void setRimnicuVilcea(Cidade rimnicuVilcea) {
		this.rimnicuVilcea = rimnicuVilcea;
	}

	public Cidade getFagaras() {
		return fagaras;
	}

	public void setFagaras(Cidade fagaras) {
		this.fagaras = fagaras;
	}

	public Cidade getTimisoara() {
		return timisoara;
	}

	public void setTimisoara(Cidade timisoara) {
		this.timisoara = timisoara;
	}

	public Cidade getLugoj() {
		return lugoj;
	}

	public void setLugoj(Cidade lugoj) {
		this.lugoj = lugoj;
	}

	public Cidade getMehadia() {
		return mehadia;
	}

	public void setMehadia(Cidade mehadia) {
		this.mehadia = mehadia;
	}

	public Cidade getDobreta() {
		return dobreta;
	}

	public void setDobreta(Cidade dobreta) {
		this.dobreta = dobreta;
	}

	public Cidade getCraiova() {
		return craiova;
	}

	public void setCraiova(Cidade craiova) {
		this.craiova = craiova;
	}

	public Cidade getPitesti() {
		return pitesti;
	}

	public void setPitesti(Cidade pitesti) {
		this.pitesti = pitesti;
	}

	public Cidade getBucharest() {
		return bucharest;
	}

	public void setBucharest(Cidade bucharest) {
		this.bucharest = bucharest;
	}

	public List<Cidade> getListaCidades() {
		return listaCidades;
	}

	public void setListaCidades(List<Cidade> listaCidades) {
		this.listaCidades = listaCidades;
	}

}

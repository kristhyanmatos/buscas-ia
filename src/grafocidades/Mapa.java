/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafocidades;

/**
 *
 *@author Elton Alves
 */
public class Mapa {
    private Cidade arad;
    private Cidade timisoara;
    private Cidade lugoj;
    private Cidade mehadla;
    private Cidade dobreta;
    private Cidade craiova;
    private Cidade pitesti;
    private Cidade sibiu;
    private Cidade rimnicuVilcea;
    private Cidade fagaras;
    private Cidade zerind;
    private Cidade oradea;
    private Cidade bucharest;

    public Mapa() {
        arad = new Cidade("Arad");
        timisoara = new Cidade("Timisoara");
        lugoj = new Cidade("Lugoj");
        mehadla = new Cidade("Mehadla");
        dobreta = new Cidade("Dobreta");
        craiova = new Cidade("Craiova");
        pitesti = new Cidade("Pitesti");
        sibiu = new Cidade("Sibiu");
        rimnicuVilcea = new Cidade("Rimnicu Vilcea");
        fagaras = new Cidade("Fagaras");
        zerind = new Cidade("Zerind");
        oradea = new Cidade("Oradea");
        bucharest = new Cidade("Bucharest");
        
        arad.addCidadeAdjacente(new Adjacente(timisoara));
        arad.addCidadeAdjacente(new Adjacente(zerind));
        arad.addCidadeAdjacente(new Adjacente(sibiu));
        
        timisoara.addCidadeAdjacente(new Adjacente(arad));
        timisoara.addCidadeAdjacente(new Adjacente(lugoj));
        
        zerind.addCidadeAdjacente(new Adjacente(arad));
        zerind.addCidadeAdjacente(new Adjacente(oradea));
        
        oradea.addCidadeAdjacente(new Adjacente(zerind));
        oradea.addCidadeAdjacente(new Adjacente(sibiu));

        sibiu.addCidadeAdjacente(new Adjacente(arad));
        sibiu.addCidadeAdjacente(new Adjacente(oradea));
        sibiu.addCidadeAdjacente(new Adjacente(rimnicuVilcea));
        sibiu.addCidadeAdjacente(new Adjacente(fagaras));

        fagaras.addCidadeAdjacente(new Adjacente(sibiu));
        fagaras.addCidadeAdjacente(new Adjacente(bucharest));
        
        rimnicuVilcea.addCidadeAdjacente(new Adjacente(pitesti));
        rimnicuVilcea.addCidadeAdjacente(new Adjacente(sibiu));
        rimnicuVilcea.addCidadeAdjacente(new Adjacente(craiova));
        
        pitesti.addCidadeAdjacente(new Adjacente(craiova));
        pitesti.addCidadeAdjacente(new Adjacente(bucharest));
        
        lugoj.addCidadeAdjacente(new Adjacente(timisoara));
        lugoj.addCidadeAdjacente(new Adjacente(mehadla));
        
        mehadla.addCidadeAdjacente(new Adjacente(lugoj));
        mehadla.addCidadeAdjacente(new Adjacente(dobreta));
        
        dobreta.addCidadeAdjacente(new Adjacente(mehadla));
        dobreta.addCidadeAdjacente(new Adjacente(craiova));
        
        craiova.addCidadeAdjacente(new Adjacente(pitesti));
        craiova.addCidadeAdjacente(new Adjacente(rimnicuVilcea));
        craiova.addCidadeAdjacente(new Adjacente(dobreta));
       
        bucharest.addCidadeAdjacente(new Adjacente(pitesti));
        bucharest.addCidadeAdjacente(new Adjacente(fagaras));
    }

    public Cidade getArad() {
        return arad;
    }

    public void setArad(Cidade arad) {
        this.arad = arad;
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

    public Cidade getMehadla() {
        return mehadla;
    }

    public void setMehadla(Cidade mehadla) {
        this.mehadla = mehadla;
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

    public Cidade getBucharest() {
        return bucharest;
    }

    public void setBucharest(Cidade bucharest) {
        this.bucharest = bucharest;
    }
  
    

}

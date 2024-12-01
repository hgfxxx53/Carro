package com.alfinhe;

public class Objeto {
    private String carro;
    private String mtricula;
    private String fabrica;
    private String modelo;

    public Objeto( ) {
        this.carro = carro;
        this.mtricula = mtricula;
        this.fabrica = fabrica;
        this.modelo = modelo;
    }
    public String getCarro() {
        return carro;
    }
    public void setCarro(String carro) {
        this.carro = carro;
    }
    public String getMtricula() {
        return mtricula;
    }
    public void setMtricula(String mtricula) {
        this.mtricula = mtricula;
    }
    public String getFabrica() {
        return fabrica;
    }
    public void setFabrica(String fabrica) {
        this.fabrica = fabrica;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    @Override
    public String toString() {
        return "Objeto [carro=" + carro + ", mtricula=" + mtricula + ", fabrica=" + fabrica + ", modelo=" + modelo
                + "]";
    }
}


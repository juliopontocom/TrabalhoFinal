package com.mycompany.Classes;

public class Ciclone extends Evento {

	private double velocidade;

	private double precipitacao;
        
        public Ciclone(String codigo, String data, double latitude, double longitude, double velocidade, double preciptacao){
            super(codigo, data, latitude, longitude);
            this.velocidade = velocidade;
            this.precipitacao = preciptacao;
        }

}

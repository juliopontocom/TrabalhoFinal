package com.mycompany.Classes;

import java.util.ArrayList;

public class Equipe {

	private String codinome;

	private int quantidade;

	private double latitude;

	private double longitude;
        
        private ArrayList<Equipamento> listaDeEquipamentos;
        
        public Equipe(String codinome, int quantidade, double latitude, double longitude, ArrayList<Equipamento> listaDeEquipamentos){
            this.codinome = codinome;
            this.quantidade = quantidade;
            this.latitude = latitude;
            this.longitude = longitude;
            this.listaDeEquipamentos = new ArrayList<Equipamento>();
                    
        }
        
        public int getQuantidade(){
            return this.quantidade;
        }
        public double getCustoEquipamentos(){
            double soma = 0;
            for(Equipamento e:listaDeEquipamentos){
                soma += e.getCustoDia();
            }
            return soma;
        }
        public void adicionaEquipamentoNaLista(Equipamento equipamento){
            listaDeEquipamentos.add(equipamento);
        }
        public double getDistancia(Evento evento){
            double distancia = Math.sqrt(Math.pow((this.latitude - evento.getLatitude()),2)+Math.pow((this.longitude - evento.getLongitude()),2));
            return distancia;
        }

}

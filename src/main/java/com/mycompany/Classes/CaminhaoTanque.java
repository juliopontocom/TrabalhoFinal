package com.mycompany.Classes;

public class CaminhaoTanque extends Equipamento {

	private double capacidade;
        
        public CaminhaoTanque(int id, String nome, double custoDia, double capacidade){
            super(id,nome,custoDia);
            this.capacidade = capacidade;
        }

}

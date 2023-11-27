package com.mycompany.Sistema;

import com.mycompany.Classes.Atendimento;
import com.mycompany.Classes.Ciclone;
import com.mycompany.Classes.Equipamento;
import com.mycompany.Classes.Equipe;
import com.mycompany.Classes.Evento;
import com.mycompany.Classes.Seca;
import com.mycompany.Classes.Terremoto;
import java.util.ArrayList;

public class ACMERescue {
    private ArrayList<Evento> listaDeEventos;
    private ArrayList<Equipe> listaDeEquipes;
    private ArrayList<Equipamento> listaDeEquipamentos;
    private ArrayList<Atendimento> listaDeAtendimentos;
    
   public ACMERescue(){
       this.listaDeEventos = new ArrayList<Evento>();
       this.listaDeEquipes = new ArrayList<Equipe>();
       this.listaDeEquipamentos = new ArrayList<Equipamento>();
       this.listaDeAtendimentos = new ArrayList<Atendimento>();
   }
   
   
   public boolean verificaCodigo(String codigo){
       for(Evento e: listaDeEventos){
           if(e.getCodigo().equalsIgnoreCase(codigo)){
               return false;
           }
       }
       return true;
   }
   
   public void cadastraCiclone(Ciclone e){
       listaDeEventos.add(e);
   }
   
   public void cadastraTerremoto(Terremoto e){
       listaDeEventos.add(e);
   }
   public void cadastraSeca(Seca e){
       listaDeEventos.add(e);
   }
   public String mostrarRelatorio(){
       String mostrar = "";
       for(Evento e: listaDeEventos){
           mostrar += e.getDescricao();
       }
       return mostrar;
   }
}

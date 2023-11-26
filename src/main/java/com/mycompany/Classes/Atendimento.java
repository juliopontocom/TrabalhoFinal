package src.main.java.com.mycompany.Classes;

public class Atendimento {

	private int cod;

	private String dataInicio;

	private int duracao;

	private String status;
        
        private Evento evento;
        
        private Equipe equipe;

	public double calculaCusto() {
            double custoDaEquipe;
            double custoDosEquipamentos;
            double custoDeDeslocamento;
            
            custoDaEquipe = duracao*250*equipe.getQuantidade();
            custoDosEquipamentos = duracao*equipe.getCustoEquipamentos();
            custoDeDeslocamento = equipe.getDistancia(evento)*(equipe.getQuantidade()*100 + (0.1*equipe.getCustoEquipamentos()));
            
		return (custoDaEquipe + custoDosEquipamentos + custoDeDeslocamento);
	}
        public void setEquipe(Equipe equipe){
            this.equipe = equipe;
        }
        public void setEvento(Evento evento){
            this.evento = evento;
        }

}

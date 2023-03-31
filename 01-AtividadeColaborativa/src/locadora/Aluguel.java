package locadora;

public class Aluguel {
	   private Alugavel alugavel;
	   private int diasAlugado;
	 
	   public Aluguel(Alugavel alugavel, int diasAlugado) {
	      this.alugavel = alugavel;
	      this.diasAlugado = diasAlugado;
	   }
	 
	   public Alugavel getAlugavel() {
	      return alugavel;
	   }
	 
	   public int getDiasAlugado() {
	      return diasAlugado;
	   }

	   public double calcularAluguel(){
		   // determina valores para cada linha
		   return this.alugavel.getValorDoAluguel(this.diasAlugado);
	   }

	   public int calcularPontosDeAluguelFrequente(){
		   // adiciona bonus para aluguel de um lançamento por pelo menos 2 dias
		   return this.alugavel.getPontosDeAlugadorFrequente();
	   }
}

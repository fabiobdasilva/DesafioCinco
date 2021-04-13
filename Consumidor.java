
public class Consumidor {

	private String nome;
	private String telefone;
	private int fiadosPosicao = 0;
	private int[] fiados =  new int[2];  
	
	
		
	public String getNome() {
		return nome;
		
	}
	public void SetNome(String nomeMain) {
		this.nome = nomeMain;
		
	}
	public void SetRegistrarFiado(int valor) {
		this.fiados[fiadosPosicao] = valor;
		fiadosPosicao++;
	}
	public int[] getFiado() {
		return fiados;
		
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	 
	public void print()
    {
    	int j = 0;
    	
    	while(j < this.fiadosPosicao)
    	{
    		System.out.println(fiados[j]);
    		j++;
    	}
    }
}

package encapsular;

public class Exemplo01 implements Radio {

	private boolean ligado;
	private int vol;
		
	
	public void ligar() {
		
		if(ligado==true)
			System.out.println("O radio já está ligado");
		else
			{
				this.ligado=true;
				this.vol=20;
			}
		
	}

	
	public void desligar() {
		this.ligado = false;
		
	}

	
	public void maisVol() {
		
		if(this.vol>100)
			this.vol=100;
		else
			this.vol+=5;
		
	}

	
	public void menosVol() {
		if(this.vol<0)
			this.vol=0;
		else
			this.vol-=5;
		
	}

	
	public void trocaEstacao() {
		System.out.println("Trocando de estação");
		
	}

}

package encapsular;

public class RadioRelogio implements Radio, Relogio {
	
	private int hora,minuto,vol;
	private boolean despertador,ligado;
	

	
	public void mudarHora() {
		if(this.hora>23)
			this.hora=0;
		else
			this.hora++;
		
	}

	
	public void mudarMinuto() {
		if(this.minuto>59)
		{
			this.minuto=0;
			this.hora++;
		}
		else
			this.minuto++;
		
		
	}

	
	public void despertar() {
		System.out.println("Pan...Pan...Pan...");
		
		
	}

	
	public void ligar() {
		if(this.ligado==true)
			System.out.println("Já está ligado...");
		else
		{
			this.ligado=true;
			this.vol=30;
			this.hora=0;
			this.minuto=0;
		}
		
	}

	
	public void desligar() {
		this.ligado=false;
		
	}

	
	public void maisVol() {
		this.vol++;
		
		
	}

	
	public void menosVol() {
		this.vol--;
		
	}

	
	public void trocaEstacao() {
		
		System.out.println("trocando de estação");
	}

}

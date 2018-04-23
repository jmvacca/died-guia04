package died.guia04.ejercicio02;

public class Temperatura {

	private Double grados;
	private Escala escala;
	
	public Temperatura() {
		// TODO Auto-generated constructor stub
		this(0.0,Escala.CELCIUS);
	}
	public Temperatura(Double grados, Escala escala) {
		this.setGrados(grados);
		this.setEscala(escala);
	}
	
	public String toString() {
		if(escala == Escala.CELCIUS) return grados+" C°";
		return grados+" F°";
	}
	public Double asCelcius() {
		if(escala == Escala.CELCIUS) return grados;
		else return (grados-32.0)/1.8;
	}
	public Double asFahrenheit() {
		if(escala == Escala.FAHRENHEIT) return grados;
		else return (grados*1.8)+32.0;
	}
	public void aumentar(Temperatura temperatura) {
		if(temperatura.getGrados()>0.0) {
			if(this.escala == temperatura.getEscala()) {
				this.setGrados(this.grados + temperatura.getGrados());
			}
			else {
				if(temperatura.getEscala() == Escala.CELCIUS) this.setGrados(this.grados+temperatura.asFahrenheit());
				else this.setGrados(this.grados+temperatura.asCelcius());
			}
		}
	}
	public void disminuir(Temperatura temperatura) {
		if(temperatura.getGrados()>0.0) {
			if(this.escala == temperatura.getEscala()) {
				this.setGrados(this.grados - temperatura.getGrados());
			}
			else {
				if(temperatura.getEscala() == Escala.CELCIUS) this.setGrados(this.grados-temperatura.asFahrenheit());
				else this.setGrados(this.grados-temperatura.asCelcius());
			}
		}
	}
	public Double getGrados() {
		return grados;
	}
	private void setGrados(Double grados) {
		this.grados = grados;
	}
	public Escala getEscala() {
		return escala;
	}
	private void setEscala(Escala escala) {
		this.escala = escala;
	}

}

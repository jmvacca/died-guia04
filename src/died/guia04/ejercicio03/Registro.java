package died.guia04.ejercicio03;
import died.guia04.ejercicio02.*;

public class Registro {
	
	private String ciudad;
	private Temperatura[] historico;
	private final int MAXSIZE = 10;
	private int iactual;
	
	public Registro(String ciudad) {
		this.ciudad = ciudad;
		this.historico = new Temperatura[MAXSIZE];
		this.iactual=-1;
	}
	public Registro() {
		this("-");
	}
	
	public String getCiudad() {
		return this.ciudad;
	}
	public void imprimir() {
		System.out.println("Temperaturas registradas en: "+this.getCiudad());
		for(int i=0; i<=iactual; i++) System.out.println((i+1)+" "+historico[i].asCelcius());
	}
	private boolean historiaLlena() {
		if((this.MAXSIZE-this.iactual)==1) return true;
		return false;
	}
	public void agregar(Temperatura t) {
		if(! (this.historiaLlena())) {
			this.historico[iactual+1] = t;
			iactual++;
		}
	}
	public double mediaAsCelcius() {
		double acum=0.0;
		for(int i=0; i<=iactual;i++) {
			acum += historico[i].asCelcius();
		}
		return acum/(iactual+1);
	}
	public double mediaAsFahrenheit() {
		double acum=0.0;
		for(int i=0; i<=iactual;i++) {
			acum += historico[i].asFahrenheit();
		}
		return acum/(iactual+1);
	}
	public Temperatura maximaTmp(Temperatura temp, int pos) {
		if(pos<=this.iactual) {
			if(historico[pos].asCelcius()>=temp.asCelcius()) {
				temp = historico[pos];
			}
			pos++;
			return this.maximaTmp(temp, pos);
		}
		return temp;
	}
	public Temperatura maximo() {
		return maximaTmp(new Temperatura(),0);
	}
}

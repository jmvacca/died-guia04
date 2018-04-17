package died.guia04.ejercicio01;

public class Recta {
	private Punto punto1;
	private Punto punto2;

	public Recta() {
		// TODO Auto-generated constructor stub
		this.setPunto1(new Punto(0,0));
		this.setPunto2(new Punto(1,1));
	}
	public Punto getPunto1() {
		return punto1;
	}
	private void setPunto1(Punto punto1) {
		this.punto1 = punto1;
	}
	public Punto getPunto2() {
		return punto2;
	}
	private void setPunto2(Punto punto2) {
		this.punto2 = punto2;
	}
	public Recta(Punto p1, Punto p2){
		this.setPunto1(p1);
		this.setPunto2(p2);
	}
	public float pendiente() {
		return (this.getPunto2().getY()-this.getPunto1().getY())/(this.getPunto2().getX()-this.getPunto1().getX());
	}
	public boolean paralelas(Recta otraRecta) {
		return otraRecta.pendiente()==this.pendiente();
	}
	public boolean equals(Object otraRecta) {
		if(otraRecta.getClass()== new Recta().getClass()) {
			if(((Recta)otraRecta).pendiente()==this.pendiente()) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package died.guia04.ejercicio01;

public class Punto {
	
	private float valorx;
	private float valory;
	
	public Punto(float x, float y) {
		this.setX(x);
		this.setY(y);
	}
	
	public float getX() {
		return valorx;
	}

	private void setX(float x) {
		this.valorx = x;
	}

	public float getY() {
		return valory;
	}

	private void setY(float y) {
		this.valory = y;
	}
	
	private boolean esPunto(Object unPunto) {
		return unPunto.getClass() == new Punto(0,0).getClass();
	}
	
	public boolean equals(Object otroPunto) {
		if(esPunto(otroPunto)) {
			float x1 = ((Punto)otroPunto).getX();
			float y1 = ((Punto)otroPunto).getY();
			if(this.valorx == x1 && this.valory == y1){
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

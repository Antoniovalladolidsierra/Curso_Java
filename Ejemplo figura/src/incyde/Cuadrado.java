package incyde;

public class Cuadrado {

	public float lado;
	public float longitud[];
	public String color_;
	
	public float perimetroCuadrado() {
		return longitud[0] + longitud[0] + longitud[0];
		
	}
	public float areaCuadrado(){
		return lado * lado;
	}
	public void colores() {
		System.out.println("Dibujando " + toString());
	}
		
	public String toString() {
		return "Cuadrado " + lado + "x " + lado + " - color: " + color_;
	}
}

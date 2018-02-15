package incyde;

public class triangulo {
	
		public float[] longitudes;
		public float base;
		public float altura;
		public String color;
		
		public float perimetro(){
			return longitudes[0] + longitudes[1] + longitudes[2];
			
	}
		public float area(){
			return (base * altura) / 2f;
	}
		public float area2() {
			return (base * altura) / 2f;
		}
		public void dibujar() {
			System.out.println("Dibujando " + toString());
		}
		public String toString() {
			return "Triangulo " + base + "x " + altura + " - color: " + color;
		}
}

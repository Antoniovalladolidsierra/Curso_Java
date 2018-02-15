package incyde;

public class Rectangulo {

	float[] kk;
	float altura;
	float ancho;
	public String colorin;
	
	public float perimetroRectangulo() {
		return kk[0] + kk[0] + kk[2] + kk[2];
	}
	public float areaRectangulo() {
		return altura * ancho;
	}
	public String colors() {
		return "Rectangulo " + altura + "x " + ancho + " - color: " + colorin;
	}
}

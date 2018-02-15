package incyde;

public class otro {

	static triangulo trianguloAngela = new triangulo();
	static triangulo trianguloMio = new triangulo();
	static Cuadrado cuadradoMio = new Cuadrado();
	static Rectangulo rectangulin = new Rectangulo();

	public static void main(String[] arg) {
		float[] temLongitudes = { 3, 4, 5 };
		trianguloAngela.longitudes = temLongitudes;
		System.out.println("el perimetro es " + trianguloAngela.perimetro());
		trianguloAngela.base = 5f;
		trianguloAngela.altura = 4f;
		trianguloAngela.color = "Rojo";
		System.out.println("El area del primer triangulo es " + trianguloAngela.area());
		System.out.println(trianguloAngela.toString());

		trianguloMio.base = 5;
		trianguloMio.altura = 3;
		trianguloMio.color = "Azul";
		System.out.println("El area del segundo triangulo es " + trianguloMio.area2());
		trianguloMio.dibujar();
		System.out.println(trianguloMio.toString());
		
		cuadradoMio.longitud = temLongitudes;
		System.out.println("El perimetro del cuadrado es " + cuadradoMio.perimetroCuadrado());
		cuadradoMio.lado = 3;
		System.out.println("El area del cuadrado es " + cuadradoMio.areaCuadrado());
		cuadradoMio.color_ = "verde";
		cuadradoMio.colores();
		
		float[] perimetri = {2,2,4,4};
		rectangulin.kk = perimetri;
		System.out.println("El perimetro del rectangulo es " + rectangulin.perimetroRectangulo());
		rectangulin.ancho = 4;
		rectangulin.altura = 5;
		System.out.println("El area del rectangulo es " + rectangulin.areaRectangulo());
		rectangulin.colorin = "rosa";
		rectangulin.colors();
		
	}
}

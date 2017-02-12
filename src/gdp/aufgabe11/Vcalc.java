package gdp.aufgabe11;

public class Vcalc {
	
	
	//Kreuzprodukt a x b
	public static Point crossProd (Point a, Point b){
		double c1 = a.y*b.z - a.z*b.y;
		double c2 = a.z*b.x - a.x*b.z;
		double c3 = a.x*b.y - a.y*b.x;
		
		return new Point (c1,c2,c3);
	}

	//Skalarprodukt a * b
	public static double dotProd (Point a, Point b){
		return (a.x*b.x + a.y*b.y + a.z*b.z);
	}
	
	
	
	
	//A Vector from 2 points
	public static Point vect (Point a, Point b){
		return new Point (b.x-a.x, b.y-a.y, b.z-a.z);
	}
	
	//Vectorlänge
	public static double vlength (Point v){
		return Math.sqrt(v.x*v.x+ v.y*v.y+ v.z*v.z);
	}
		
}

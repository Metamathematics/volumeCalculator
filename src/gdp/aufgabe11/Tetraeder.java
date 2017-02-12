package gdp.aufgabe11;

public class Tetraeder {
	public static void main (String[] args) {
		
		Point a,b,c,d;
		a = pread('a');b = pread('b');c = pread('c');d = pread('d');
		
		
		/*
		a=new Point (0,0,0);
		b=new Point (1,0,0);
		c=new Point (0,1,0);
		d=new Point (0,0,1);
		*/
		
		
		Point v1 = Vcalc.vect(a,b);
		Point v2 = Vcalc.vect(a,c);
		Point v3 = Vcalc.vect(a,d);
		
		
		System.out.println ("Volume: " + volume (v1,v2,v3));
		System.out.println ("Kantenlaenge: " + edgeLength (v1,v2,v3));
		
	}
	
	
	//Tetreader Volume + edge length--------------------------------------------------------------
	public static double volume (Point v1, Point v2, Point v3){
		return Vcalc.dotProd (Vcalc.crossProd (v1,v2), v3) /6;
	}
	
	public static double edgeLength (Point v1, Point v2, Point v3){
		
		double len1 = Vcalc.vlength (v1) + Vcalc.vlength (v2) + Vcalc.vlength (v3);
		double len2 = Vcalc.vlength (Vcalc.vect (v2, v1));
		double len3 = Vcalc.vlength (Vcalc.vect (v3, v1));
		double len4 = Vcalc.vlength (Vcalc.vect (v3, v2));

		return (len1+ len2+ len3+ len4);
	}
	
	
	//Reader-------------------------------------------------------------------------------------
	public static Point pread (char l){
		Point p = new Point(0,0,0);
		
		System.out.print (l + "1: ");
		p.x = console.InputHelper.readDouble();
		
		System.out.print (l + "2: ");
		p.y = console.InputHelper.readDouble();
		
		System.out.print (l + "3: ");
		p.z = console.InputHelper.readDouble();
		
		return p;
	}
	
	
	//Test print-----------------------------------
	
	public static void testprint (Point v1, Point v2, Point v3){
		System.out.println ("v1: " + v1.x + " "  + v1.y + " " + v1.z);
		System.out.println ("v2: " + v2.x + " "  + v2.y + " " + v2.z);
		System.out.println ("v3: " + v3.x + " "  + v3.y + " " + v3.z);
	}
	
	public static void testprint (Point v1, Point v2){
		System.out.println ("v1: " + v1.x + " "  + v1.y + " " + v1.z);
		System.out.println ("v2: " + v2.x + " "  + v2.y + " " + v2.z);
	}
	
	public static void testprint (Point v1, String s){
		System.out.println (s + ": " + v1.x + " "  + v1.y + " " + v1.z);
	}
	
	public static void testprint (double v1, String s){
		System.out.println (s + ": " + v1);
	}
}

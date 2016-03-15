package chap8;

class Glyph{
	public void draw(){
		System.out.println("Glyph.draw() ");
	}
	Glyph(){
		System.out.println("Glyph() before draw");
		draw();
		System.out.println("Glyph() after draw");
	}
}

class RoundGlyph extends Glyph{
	private int radius = 1;
	
	RoundGlyph(int r){
		radius = r;
		System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
	}
	
	public void draw(){
		System.out.println("RoundGlyph.draw(), radius = " + radius);
	}
}

class RectangleGlyph extends Glyph{
	private int length = 1;
	
	RectangleGlyph(int l){
		length = l;
		System.out.println("RectangleGlyph.RoundGlyph(), length = " + length);
	}
	
	public void draw(){
		System.out.println("RectangleGlyph.draw(), length = " + length);
	}
}


class PolyConstructors{
	public static void main(String[] args){
		new RoundGlyph(5);
		new RectangleGlyph(4);
	}
}

public class test14{
	public static void main(String[] args){
		PolyConstructors.main(args);
	}
}

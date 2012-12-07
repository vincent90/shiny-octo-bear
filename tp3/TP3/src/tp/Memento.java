package tp;

//Inspir� de http://rpouiller.developpez.com/tutoriel/java/design-patterns-gang-of-four/?page=page_4#LVI-F

public class Memento {
	private int zoom;
	private int x;
	private int y;
	
	Memento(int pZoom, int pX, int pY){
		zoom = pZoom;
		x = pX;
		y = pY;
	}
	
	private int getZoom(){
		return zoom;
	}
	
	private int getX(){
		return x;
	}
	
	private int getY(){
		return y;
	}
}

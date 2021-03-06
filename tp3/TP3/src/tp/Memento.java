package tp;

/**
 * Contient la sauvegarde actuelle d'un memento <p>
 * {@link http://rpouiller.developpez.com/tutoriel/java/design-patterns-gang-of-four/?page=page_4#LVI-F}
 */
public class Memento {
	private int zoom;
	private int x;
	private int y;
	
	public Memento(int pZoom, int pX, int pY){
		zoom = pZoom;
		x = pX;
		y = pY;
	}
	
	public int getZoom(){
		return zoom;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
}

package tp;

import java.util.LinkedList;
import java.util.List;

/**
 * Contient la Pile de Memento <p>
 * {@link http://rpouiller.developpez.com/tutoriel/java/design-patterns-gang-of-four/?page=page_4#LVI-F}
 */
public class PileMemento {
	
	private List<Memento> listeMemento = new LinkedList<Memento>();

	public void ajouterMemento(Memento pMemento){
		listeMemento.add(pMemento);
	}
	
	/**
	 * Retourne un Memento qui correspond � l'index
	 * @param Index en int
	 */
	public Memento getMemento(int pIndex){
		return listeMemento.get(pIndex);
	}
}

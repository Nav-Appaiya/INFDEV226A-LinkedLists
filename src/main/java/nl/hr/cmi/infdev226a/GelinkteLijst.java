package nl.hr.cmi.infdev226a;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class GelinkteLijst {
	
	
	/**
	 * Alleen de gelinkte lijst heeft toegang tot de node
	 */
	private class Node {
		//Dit is de data die je opslaat
		Object data;
		
		// referenties naar de eerste en laatste nodes
		Node next, previous;
	}	
	
	
	private Node first, last;
	private int size;


    public Node getFirst(){
        throw new NotImplementedException();
	}


    public Node getLast(){
        throw new NotImplementedException();
	}	
	
	/**
	 * Voeg toe aan de voorkant
	 */
    public void insertFirst(Object o){throw new NotImplementedException();}

	/**
	 * Voeg toe aan de achterkant
	 */
    public void insertLast(Object o){throw new NotImplementedException();}
	
	/**
	 * Voeg toe voor een ander element
	 */
    public void insertBefore(Object o, Object before){throw new NotImplementedException();}
	
	/**
	 * Voeg toe na een ander element
	 */
    public void insertAfter(Object o, Object after){throw new NotImplementedException();}

	
	/**
	 * Verwijder een element
	 * @param data
	 */
    public void remove(Object data){throw new NotImplementedException();}
	
	/**
	 * Het aantal elementen in de gelinkte lijst
	 * @return
	 */
    public int getSize(){
        throw new NotImplementedException();
	}
}

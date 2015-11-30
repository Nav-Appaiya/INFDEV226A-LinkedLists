package nl.hr.cmi.infdev226a;

/**
 * Created by nav on 30-11-15.
 */
public class Main {

    protected GelinkteLijst lijst;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GelinkteLijst gelinkteLijst = new GelinkteLijst();

        System.out.println("Nav Appaiya - 30 November 2015 gelinktelijsten");
        System.out.println("=========================================");

        // Voor & achter aansluiten
        //gelinkteLijst.insertFirst(new Object());
        //gelinkteLijst.insertLast(1);
        //System.out.println("Size: " + gelinkteLijst.getSize() + "");

        // Inserten voor & na een Node-element
        //gelinkteLijst.insertBefore(new Object(), new Object());
        //gelinkteLijst.insertAfter(new Object(),new Object());
        //System.out.println("Size: " + gelinkteLijst.getSize() + "");

        // Verwijderen van een node
        Object object = new Object();
        gelinkteLijst.insertFirst(object);
        System.out.println(gelinkteLijst.getFirst());
        System.out.println("Expected 1, Result:" + gelinkteLijst.getSize());
        gelinkteLijst.remove(object);
        System.out.println("Expected 0, Result:" + gelinkteLijst.getSize());

        //System.out.println(gelinkteLijst.getLast());
    }

}

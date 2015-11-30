package nl.hr.cmi.infdev226a;

public class GelinkteLijst {

    private Node first, last;
    private int size;

    public Object getFirst() {
        return first.data;
    }

    public Object getLast() {
        return last.data;
    }

    /**
     * Done - Nav Appaiya 29 November
     * Voeg toe aan de voorkant
     */
    public void insertFirst(Object o) {
        Node newNode = new Node();
        newNode.data = o;
        newNode.next = first;
        newNode.previous = null;


        if (this.first != null) {
            //set the old first's previous to the newNode
            this.first.previous = newNode;
        } else {
            //list was empty, newNode will be the only node.
            //so also set the last
            this.last = newNode;
        }

        //set the head to the newNode
        this.first = newNode;
        size++;
    }

    /**
     * Done - Nav Appaiya 29 November
     * Voeg toe aan de achterkant
     */
    public void insertLast(Object o) {
        // n = new Node();
        Node n = new Node();
        n.data = o;
        n.next = null;
        n.previous = last;

        //if the list is not empty
        if (last != null) {
            last.previous = n;
        } else {
            this.last = n;
        }
        size++;
    }

    /**
     * Done - Nav Appaiya 29 November
     * Voeg toe voor een ander element
     */
    public void insertBefore(Object o, Object before) {
        Node s = first;
        while (s != null) {
            if (s.data.equals(before)) {
                Node n = new Node();
                n.data = o;
                n.next = s;
                n.next.previous = n;
                if (!isFirst(before)) {
                    n.previous = s.previous;
                    n.previous.next = n;
                } else {
                    first = n;
                }
                size++;
                break;
            } else {
                s = s.next;
            }
        }
        this.size++;
    }

    /**
     * Done - Nav Appaiya 29 November
     * Voeg toe na een ander element
     */
    public void insertAfter(Object o, Object after) {
        Node s = first;
        while (s != null) {
            if (s.data.equals(after)) {
                Node n = new Node();
                n.data = o;
                n.previous = s;
                n.previous.next = n;
//                System.out.println("@Nav Todo: debug till here ===============");
                if (!isLast(after)) {
                    n.next = s.next;
                    n.next.previous = n;
                } else {
                    last = n;
                }
                size++;
                break;
            } else {
                s = s.next;
            }
        }
        size++;
    }

    /**
     * Done - Nav Appaiya 29 November
     * Verwijder een element
     *
     * @param data
     */
    public void remove(Object data) {
        Node s = first;
        while (s != null) {
            if (s.data.equals(data)) {
                if (!isFirst(s.data) && !isLast(s.data)) {
                    s.previous.next = s.next;
                    s.next.previous = s.previous;
                } else if (getSize() == 1) {
                    first = null;
                    last = null;
                } else if (isFirst(s.data)) {
                    first = s.next;
                    s.next.previous = null;
                } else if (isLast(s.data)) {
                    last = s.previous;
                    s.previous.next = null;
                }
                size--;
                break;
            } else {
                s = s.next;
            }
        }
    }

    /**
     * Done - Nav Appaiya 29 November
     * Het aantal elementen in de gelinkte lijst
     *
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     * @param o
     * @return
     */
    boolean isFirst(Object o) {
        return first.data.equals(o);
    }

    /**
     * @param o
     * @return
     */
    boolean isLast(Object o) {
        return last.data.equals(o);
    }

    Object getData(Node n) {
        return n.data;
    }

    @Override
    public String toString() {
        Node s = first;
        String r = "";
        int c = 1;
        while (s != null) {
            r += "Node " + c++ + ":" + s + "\n";
            s = s.next;
        }
        return r;
    }

    /**
     * Alleen de gelinkte lijst heeft toegang tot de node
     */
    private class Node {
        //Dit is de data die je opslaat
        Object data;

        // referenties naar de eerste en laatste nodes
        Node next, previous;

    }
}

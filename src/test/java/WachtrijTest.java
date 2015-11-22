import nl.hr.cmi.infdev226a.Wachtrij;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WachtrijTest {
    Wachtrij wachtrij;

    @Before
    public void setup(){
        wachtrij = new Wachtrij();
    }

    @Test
    public void enqueueDequeueTest(){
        wachtrij.enqueue(1);
        wachtrij.enqueue(2);
        wachtrij.enqueue(3);
        assertEquals(3, wachtrij.dequeue());
        assertEquals(2, wachtrij.dequeue());
        assertEquals(1, wachtrij.dequeue());
    }

    @Test
    public void sizeTest(){
        wachtrij.enqueue(1);
        wachtrij.enqueue(2);
        wachtrij.enqueue(3);
        assertEquals(3, wachtrij.size());
    }

    @Test
    public void isEmptyTest(){
        assertTrue(wachtrij.isEmpty());
        wachtrij.enqueue(1);
        wachtrij.enqueue(2);
        wachtrij.enqueue(3);
        assertFalse(wachtrij.isEmpty());
    }

    @Test
    public void frontTest(){
        assertEquals(null, wachtrij.front());
        wachtrij.enqueue(1);
        wachtrij.enqueue(2);
        wachtrij.enqueue(3);
        assertEquals(1 , wachtrij.front());
    }
}
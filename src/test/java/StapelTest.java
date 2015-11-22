import nl.hr.cmi.infdev226a.Stapel;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StapelTest {

    Stapel stapel;

    @Before
    public void setup() {
        stapel = new Stapel();
    }

    @Test
    public void pushPopTest() {
        stapel.push(1);
        stapel.push(2);
        stapel.push(3);
        assertEquals(3, stapel.pop());
        assertEquals(2, stapel.pop());
        assertEquals(1, stapel.pop());
    }

    @Test
    public void frontTest() {
        stapel.push(1);
        assertEquals(1, stapel.front());
        stapel.push(2);
        stapel.push(3);
        assertEquals(3, stapel.front());
        assertEquals(3, stapel.front());
    }

    @Test
    public void isEmptyTest() {
        assertTrue(stapel.isEmpty());
        stapel.push(1);
        stapel.push(2);
        stapel.push(3);
        assertEquals(3, stapel.pop());
        assertEquals(2, stapel.pop());
        assertEquals(1, stapel.pop());
        assertTrue(stapel.isEmpty());
    }



}
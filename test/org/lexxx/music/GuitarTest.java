package org.lexxx.music;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lexxx.music.Guitar;
import org.lexxx.music.Note;
import org.lexxx.music.Tuning;


public class GuitarTest {

	@Test
	public void testEString() {
		Note c = Note.C;
		Guitar guitar = new Guitar(Tuning.STANDART);
		assertEquals(Note.A, guitar.getNote(6, 5));
		assertEquals(Note.A, guitar.getNote(5, 0));
		assertEquals(Note.B, guitar.getNote(5, 2));
		assertEquals(Note.C, guitar.getNote(5, 3));
		assertEquals(Note.D, guitar.getNote(5, 5));
		assertEquals(Note.E, guitar.getNote(5, 7));
		assertEquals(Note.F, guitar.getNote(5, 8));
		assertEquals(Note.G, guitar.getNote(5, 10));
		assertEquals(Note.A, guitar.getNote(5, 12));

	}
}

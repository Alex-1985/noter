package org.lexxx.music;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MajorTonalityTest {

	@Test
	public void testCorrectNotes() {
		Tonality tonality = new MajorTonality(Note.C);
		assertTrue(tonality.contains(Note.A));
		assertTrue(tonality.contains(Note.B));
		assertTrue(tonality.contains(Note.C));
		assertTrue(tonality.contains(Note.D));
		assertTrue(tonality.contains(Note.E));
		assertTrue(tonality.contains(Note.F));
		assertTrue(tonality.contains(Note.G));
		assertTrue(tonality.contains(Note.A));
	}

}

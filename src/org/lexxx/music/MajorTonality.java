package org.lexxx.music;


public class MajorTonality extends Tonality {

	private static final int[] _distances = { 2, 2, 1, 2, 2, 2, 1, 2 };

	public MajorTonality(Note rootNote) {

		super(rootNote, _distances);
	}

}

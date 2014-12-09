package org.lexxx.music;

import java.util.HashSet;
import java.util.Set;

public abstract class Tonality {

	int[] distances;
	private Note root;
	private Set<Note> notes = new HashSet<>();

	public Tonality(Note rootNote, int[] distances) {
		this.root = rootNote;
		this.distances = distances;
		notes.add(rootNote);
		Note lastNote = rootNote;
		for (int i = 0; i < distances.length; i++) {
			int currentDistance = distances[i];
			lastNote = lastNote.shift(currentDistance);
			notes.add(lastNote);
		}
	}


	public boolean contains(Note note) {
		return notes.contains(note);
	}

}

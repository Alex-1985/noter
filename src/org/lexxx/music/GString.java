package org.lexxx.music;

public class GString {
	Note[] notes = new Note[24];

	public GString(Note rootNode) {
		for (int i = 0; i < notes.length; i++) {
			notes[i] = rootNode.shift(i);
			
		}
	}

	public Note getNote(int lad) {
		return notes[lad];
	}

}

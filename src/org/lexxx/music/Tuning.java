package org.lexxx.music;

public enum Tuning {
	STANDART(Note.E, Note.B, Note.G, Note.D, Note.A, Note.E);
	private Note[] notes;
	Tuning(Note... notes) {
		this.notes = notes;
	}
	public Note getNote(int i) {
		return notes[i - 1];
	}

	public Note[] getNotes() {
		return notes;
	}

}

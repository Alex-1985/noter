package org.lexxx.music;

import java.util.ArrayList;
import java.util.List;

public class Guitar {
	List<GString> strings = new ArrayList<>(6);

	public Guitar(Tuning standart) {
		// creating strings accordingly to tuning
		for (Note note : standart.getNotes()) {
			strings.add(new GString(note));
		}
	}
	public Note getNote(int string, int lad) {
		GString gString = strings.get(string - 1);
		return gString.getNote(lad);
	}

}

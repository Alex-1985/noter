package org.lexxx.music;

import java.util.HashMap;
import java.util.Map;

public enum Note {
	C(0), Csharp_Dflat(1), D(2), Dsharp_Eflat(3), E(4), F(5), Fsharp_Gflat(6), G(
			7), Gsharp_Aflat(8), A(9), Asharp_Bflat(10), B(11);
	final static Map<Integer, Note> mapper = new HashMap<>();
	
	static{for (Note note : Note.values()) {
			mapper.put(note.index, note);
	}}

	private int index;
	
	Note(int index){
		this.index = index;
	}
	public Note shift(int i) {
		int key = (index + i) % 12;
		return mapper.get(key);
	}


}

package org.lexxx.music;

public class GuitarPrinter {

	public static void print(Guitar guitar) {
		print(guitar, new AllNotesTonality());
	}

	private static String formatString(String stringvalue) {
		return String.format("%1$12s   ", stringvalue);
	}

	public static void print(Guitar guitar, Tonality tonality) {
		StringBuffer sb = new StringBuffer();
		for (int stringIndex = 1; stringIndex <= 6; stringIndex++) {
			sb.append("|");
			for (int fretIndex = 0; fretIndex < 24; fretIndex++) {
				sb.append("|");
				Note note = guitar.getNote(stringIndex, fretIndex);
				String stringvalue = tonality.contains(note) ? note.toString()
						: "";
				sb.append(formatString(stringvalue));
			}
			sb.append("\n");
		}
		sb.append("|");
		for (int fretIndex = 0; fretIndex < 24; fretIndex++) {
			sb.append("|");
			String stringvalue = String.valueOf(fretIndex);
			sb.append(formatString(stringvalue));
		}
		System.out.println(sb);

	}

}

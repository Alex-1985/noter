package org.lexxx.music;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NotesShower {
	public static void main(String[] args) {
		String notes = "C D E F G A B";
		System.out.println(notes);
		// String chords = "C D E F G A B C";
		JFrame frame = new JFrame();
		BorderLayout layout = new BorderLayout();
		frame.setLayout(layout);
		JPanel centralPanel = new JPanel();
		centralPanel.setLayout(new GridLayout(7, 1));

		String[] chords = { "C major = C E G", "D minor = D F A",
				"E minor = E G B", "F major = F A C", "G major = G B D",
				"A minor = A C E", "B dim = B D F" };
		for (String chord : chords) {
			System.out.println(chord);
			centralPanel.add(new JLabel(chord));
		}
		frame.add(centralPanel, BorderLayout.CENTER);
		JLabel notesLabel = new JLabel(notes);
		frame.add(notesLabel, BorderLayout.EAST);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		//
		// Guitar guitar = new Guitar(Tuning.STANDART);
		// guitar.getNote(1, 5);
		// // GuitarPrinter.print(guitar);
		// Tonality cmajor = new MajorTonality(Note.C);
		// GuitarPrinter.print(guitar, cmajor);

	}
}

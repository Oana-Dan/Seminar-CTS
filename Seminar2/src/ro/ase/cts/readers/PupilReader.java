package ro.ase.cts.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;

public class PupilReader extends AplicantReader{

	public PupilReader(String fileName) {
		super(fileName);
	}

	public List<Aplicant> citesteAplicanti() throws FileNotFoundException {
		Scanner input = new Scanner(new File(super.getFileName()));
		input.useDelimiter(",|\n");
		List<Aplicant> elevi = new ArrayList<Aplicant>();

		while (input.hasNext()) {
			Elev elev = new Elev();
			super.citesteAplicant(input, elev);
			elev.setClasa(input.nextInt());
			elev.setTutore(input.next());
			elevi.add(elev);
		}
		input.close();
		return elevi;
	}
}

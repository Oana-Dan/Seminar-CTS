package ro.ase.cts.classes.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ro.ase.cts.classes.FakeStudent;
import ro.ase.cts.classes.Grupa;
import ro.ase.cts.classes.IStudent;

public class TestCaseFake {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void PromovobalitateFaraRestanteTest() {
		FakeStudent studentFake = new FakeStudent();
		studentFake.setAreRestante(false);
		Grupa grupa = new Grupa(1079);
		grupa.adaugaStudent(studentFake);
		assertEquals(1, grupa.getPromovabilitate(), 0.01);
	}
	
	@Test
	public void PromovobalitateCuRestanteTest() {
		FakeStudent studentFake = new FakeStudent();
		studentFake.setAreRestante(true);
		Grupa grupa = new Grupa(1079);
		grupa.adaugaStudent(studentFake);
		assertEquals(0, grupa.getPromovabilitate(), 0.01);
	}
}

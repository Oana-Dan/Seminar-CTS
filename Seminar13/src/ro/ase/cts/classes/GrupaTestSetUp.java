package ro.ase.cts.classes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class GrupaTestSetUp {

Grupa grupa;
	
	@Before
	public void setUp() throws Exception {
		grupa = new Grupa(1010);
		for(int i=1;i<36;i++) {
			Student student = new Student();
			student.adaugaNota(i%10 + 1);
			grupa.adaugaStudent(student);
		}
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(timeout=100)
	public void performancePromovabilitateTest() {
		grupa.getPromovabilitate();
	}
	
	@Test
	public void cardinalityPromovabilitateTest() {
		Grupa grupa = new Grupa(1050);
		Student student = new Student();
		student.adaugaNota(5);
		grupa.adaugaStudent(student);
		assertEquals(1f, grupa.getPromovabilitate(), 0.001f);
	}
}

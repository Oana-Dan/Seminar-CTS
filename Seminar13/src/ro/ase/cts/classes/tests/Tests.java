package ro.ase.cts.classes.tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ro.ase.cts.classes.Grupa;
import ro.ase.cts.classes.Student;

public class Tests {
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

	@Test
	public void constructorTest() {
		Grupa grupa = new Grupa(1079);
		Assert.assertEquals(1079, grupa.getNrGrupa());
	}
	
	@Test
	public void testareLimitaInferioara() {
		Grupa grupa = new Grupa(1000);
		Assert.assertEquals(1000, grupa.getNrGrupa());
	}
	
	@Test
	public void testareLimitaSuperioara() {
		Grupa grupa = new Grupa(1100);
		Assert.assertEquals(1100, grupa.getNrGrupa());
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void inAfaraLimitelorTest() {
		Grupa grupa = new Grupa(1300);
	}
	
	@Test(timeout = 1000)
	public void performantaTest() {
		Grupa grupa = new Grupa(1040);
	}

	@Test
	public void corectitudinePromovabilitateTest() {
		Grupa grupa = new Grupa(1005);
		for(int i=1;i<11;i++) {
			Student student = new Student();
			student.adaugaNota(i);
			grupa.adaugaStudent(student);
		}
		Assert.assertEquals(0.6f, grupa.getPromovabilitate(),.001f);
	}
	
	@Test
	public void limitaInferioaraPromovabilitateTest() {
		Grupa grupa = new Grupa(1005);
		for(int i=1;i<11;i++) {
			Student student = new Student();
			student.adaugaNota(1);
			grupa.adaugaStudent(student);
		}
		Assert.assertEquals(0.0f, grupa.getPromovabilitate(),.001f);
	}
	
	@Test
	public void limitaSuperioaraPromovabilitateTest() {
		for(int i=1;i<36;i++) {
			Student student = new Student();
			student.adaugaNota(i%10 + 1);
			grupa.adaugaStudent(student);
		}
	}
	
	@Test
	public void boundaryPromovabilitate() {
		Grupa grupa = new Grupa(1005);
		Assert.assertEquals(0, grupa.getPromovabilitate(), 0.001f);
	}
}

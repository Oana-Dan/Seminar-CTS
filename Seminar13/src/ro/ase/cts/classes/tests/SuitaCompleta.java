package ro.ase.cts.classes.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({Tests.class, TestStudentStub.class, TestCaseGetPromovabilitate.class, TestCaseFake.class, TestCaseDummy.class})

public class SuitaCompleta {
}
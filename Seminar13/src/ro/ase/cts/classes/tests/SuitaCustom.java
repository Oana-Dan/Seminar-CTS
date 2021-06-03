package ro.ase.cts.classes.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import ro.ase.cts.classes.NormalTest;

@RunWith(Categories.class)
@Suite.SuiteClasses({Tests.class, GrupaTestSetUp.class, TestCaseFake.class, TestCaseDummy.class, TestCaseGetPromovabilitate.class})
@Categories.IncludeCategory(TestCaseGetPromovabilitate.class)
@Categories.ExcludeCategory(NormalTest.class)
public class SuitaCustom {
}
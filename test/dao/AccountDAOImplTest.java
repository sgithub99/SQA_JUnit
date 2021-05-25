package dao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AccountDAOImplTest {
	private static final double DELTA = 1e-15;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCalculateInterest1() {

		AccountDAOImpl accountDAOImpl = new AccountDAOImpl();
		float expect = (float) (1450000) / 3;
		float actual = accountDAOImpl.calculateInterest(200000000, 400000000, 30, 1);
		assertEquals(expect, actual, DELTA);
	}

	@Test
	public void testCalculateInterest2() {
		AccountDAOImpl accountDAOImpl = new AccountDAOImpl();
		float expect = 0.0f;
		float actual = accountDAOImpl.calculateInterest(200000000, 10000, 30, 1);
		assertEquals(expect, actual, DELTA);
	}

	@Test
	public void testCalculateInterest3() {
		AccountDAOImpl accountDAOImpl = new AccountDAOImpl();
		float expect = 0.0f;
		float actual = accountDAOImpl.calculateInterest(900000, 400000000, 30, 1);
		assertEquals(expect, actual, DELTA);
	}

	@Test
	public void testCalculateInterest4() {
		AccountDAOImpl accountDAOImpl = new AccountDAOImpl();
		float expect = 1455555.5f;
		float actual = accountDAOImpl.calculateInterest(200000000, 400000000, 100, 1);
		assertEquals(expect, actual, DELTA);
	}

	@Test
	public void testCalculateInterest5() {
		AccountDAOImpl accountDAOImpl = new AccountDAOImpl();
		float expect = 0.0f;
		float actual = accountDAOImpl.calculateInterest(200099999, 400000000, 30, 1);
		assertEquals(expect, actual, DELTA);
	}

	@Test
	public void testCalculateInterest6() {
		AccountDAOImpl accountDAOImpl = new AccountDAOImpl();
		float expect = 966666.7f;
		float actual = accountDAOImpl.calculateInterest(200000000, 400000000, 60, 1);
		assertEquals(expect, actual, DELTA);

	}

	@Test
	public void testCalculateInterest7() {
		AccountDAOImpl accountDAOImpl = new AccountDAOImpl();
		float expect = 13888.891f;
		float actual = accountDAOImpl.calculateInterest(200000000, 400000000, 25, 1);
		assertEquals(expect, actual, DELTA);
	}

	@Test
	public void testCalculateInterest8() {
		AccountDAOImpl accountDAOImpl = new AccountDAOImpl();
		float expect = 0.0f;
		float actual = accountDAOImpl.calculateInterest(200000000, 400000000, 900, 30);
		assertEquals(expect, actual, DELTA);
	}

	@Test
	public void testCalculateInterest9() {
		AccountDAOImpl accountDAOImpl = new AccountDAOImpl();
		float expect = 0.0f;
		float actual = accountDAOImpl.calculateInterest(200000000, 400000000, -4, 1);
		assertEquals(expect, actual, DELTA);

	}

}

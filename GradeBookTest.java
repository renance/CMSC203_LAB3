import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class GradeBookTest {

	private GradeBook book1;
	private GradeBook book2;
	private GradeBook book3;
	@Before
	public void setUp() throws Exception {
		book1 = new GradeBook(5);
		book1.addScore(85.0);
		book1.addScore(95.0);

		book2 = new GradeBook(5);		
		book2.addScore(55.0);
		book2.addScore(75.0);
		book2.addScore(95.0);
		book2.addScore(75.0);
		book2.addScore(95.0);
		
		book3 = new GradeBook(5);		
		book3.addScore(76.0);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddScore() {
		String testStr = " 85.0 95.0 93.0";
		assertEquals(true, book1.addScore(93.0));
		assertTrue(book1.getScoreSize() == 3);
		assertTrue(book1.toString().equals(testStr));
		assertFalse(book2.addScore(93.0));
		assertTrue(book2.getScoreSize() == 5);
	}

	@Test
	public void testSum() {
		assertEquals(book1.sum(), 180.0, .01);
		assertTrue(book2.sum() == 395.0);
	}


	@Test
	public void testMinimum() {
		assertTrue(book1.minimum() == 85.0);
		assertTrue(book2.minimum() == 55.0);
	}

	@Test
	public void testFinalScore() {
		assertTrue(book1.finalScore() == 95.0);
		assertTrue(book2.finalScore() == 340.0);
		assertEquals(book3.finalScore(), 76.0, .01);
	}

	

}

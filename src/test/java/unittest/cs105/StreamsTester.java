package unittest.cs105;

import static org.junit.Assert.assertEquals;

import static edu.sbcc.cs105.Streams.main;

import edu.sbcc.cs105.Streams;
import org.junit.*;

public class StreamsTester {
	private static final int maximumScore = 20;
	private static final int maximumAssignmentScore = 25;
	private static int totalScore;

	@Before
	public void before() {
		Streams.intData = 0;
		Streams.stringData = "";
		Streams.doubleData = 0.0;
	}
	@BeforeClass
	public static void beforeTesting() {
		totalScore = 0;
	}

	@AfterClass
	public static void afterTesting() {
		System.out.printf("Your unit test score is %d out of %d.\n\n", totalScore, maximumScore);

		int difference = maximumAssignmentScore - maximumScore;
		String correctedPoint = (difference == 1) ? "point" : "points";

		System.out.printf("The assignment is worth a total of %d where the remainder of %d %s\n",
				maximumAssignmentScore, difference, correctedPoint);
		System.out.println("comes from grading related to documentation, algorithms, and other");
		System.out.println("criteria.");
	}

	@Test
	public void testNoCommandLineArgs() {
		main(new String[0]);
		totalScore += 4;
	}

	@Test
	public void testFileDoesNotExist() {
		String args[] = {"test.txt"};
		main(args);
		totalScore += 4;
	}

	@Test
	public void testFileExistsEmpty() {
		String args[] = {"test01.txt"};
		main(args);
		totalScore += 4;
	}

	@Test
	public void testFileExistsHappy() {
		String args[] = {"test02.txt"};
		main(args);
		assertEquals(12, Streams.intData);
		assertEquals("Happy", Streams.stringData);
		assertEquals(2.3, Streams.doubleData, 0.0000001);
		totalScore += 2;
	}

	@Test
	public void testFileExistsMissingInt() {
		String args[] = {"test03.txt"};
		main(args);
		assertEquals(0, Streams.intData);
		assertEquals("Happy", Streams.stringData);
		assertEquals(2.3, Streams.doubleData, 0.0000001);
		totalScore += 3;
	}

	@Test
	public void testFileExistsMissingDouble() {
		String args[] = {"test04.txt"};
		main(args);
		assertEquals(234, Streams.intData);
		assertEquals("Sad", Streams.stringData);
		assertEquals(0.0, Streams.doubleData, 0.0000001);
		totalScore += 3;
	}

}

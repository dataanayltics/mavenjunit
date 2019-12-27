package mavenTest;
import org.junit.jupiter.api.*;

class HelloWorldTest {

	@BeforeAll
    static void beforeAll() {
        System.out.println("Before all test methods");
    }
 
    @BeforeEach
    void beforeEach() {
        System.out.println("Before each test method");
    }
 
    @AfterEach
    void afterEach() {
        System.out.println("After each test method");
    }
 
    @AfterAll
    static void afterAll() {
        System.out.println("After all test methods");
    }

	@Test
	public void test() {
		//fail("Not yet implemented");
		
	}

	@Test
	public void test_add() {
		System.out.println("add");
	}

	@Test
	public void test_reverse() {
		
	}
}

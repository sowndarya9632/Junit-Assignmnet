package junitproject;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathUtilsTest {
    private MathUtils m;

    @BeforeAll
    public static void BeforeAll() {
        System.out.println("before all method");
    }

    @AfterAll
    public static void AfterAll() {
        System.out.println("after all method");
    }

    @BeforeEach
    public void setUp() {
        //m = new MathUtils(); // Initialize the MathUtils instance before each test
        System.out.println("before each");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("after each");
    }

    @Test
    public void test1() {
        System.out.println("running test1");
        
    }

    // Add more tests as needed
}

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(groups={"Group1", "Group2", "Group3"})
public class SampleTest {

    private int variable = 0;

    @BeforeClass
    public void setUp() throws Exception {
        System.out.println("=======");
        System.out.println("Setup1 variable1=" + variable++);
    }

    @AfterMethod
    public void tearDown() throws Exception {
        System.out.println("Teardown1 variable1=" + variable++);
        System.out.println("+++++++");
    }

    /**
     * Data Provider for tests
     * @return
     */
    @DataProvider(name="testData1")
    public Object[][] testData1() {
        return new Object[][] {
                {"Test1"},
                {"Test2"},
        };
    }

    /**
     * Verify
     * @param test
     */
    @Test(dataProvider="testData1")
    public void test1(String test) {
        System.out.println(test + " variable1=" + variable++);
    }
}

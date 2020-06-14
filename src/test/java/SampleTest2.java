import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(groups={"Group1", "Group2", "Group3"})
public class SampleTest2 {

    private int variable = 0;

    @BeforeClass
    public void setUp() throws Exception {
        System.out.println("=======");
        System.out.println("Setup2 variable2=" + variable++);
        if (variable == 4) {
            throw new Exception("Exception!");
        }
    }

    @AfterMethod
    public void tearDown() throws Exception {
        System.out.println("Teardown2 variable2=" + variable++);
        System.out.println("+++++++");
    }

    /**
     * Data Provider for tests
     * @return
     */
    @DataProvider(name="testData2")
    public Object[][] testData2() {
        return new Object[][] {
                {"Test3"},
                {"Test4"},
        };
    }

    /**
     * Verify the value
     * @param test
     */
    @Test(dataProvider="testData2")
    public void test2(String test) {
        System.out.println(test + " variable2=" + variable++);
    }
}

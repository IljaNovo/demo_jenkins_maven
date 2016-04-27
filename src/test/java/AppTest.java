import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    /**
     * test get str field
     * @throws Exception
     */
    @Test
    public void testGetStr() throws Exception {
        App a = new App();
        Assert.assertEquals(a.getStr(), "Hello World!");
    }

    /**
     * test add new string to str field
     * @throws Exception
     */
    @Test
    public void testAddStr() throws Exception {
        App a = new App();
        a.addStr(" My name is Max.");
        Assert.assertEquals(a.getStr(), "Hello World! My name is Max.");
    }
}
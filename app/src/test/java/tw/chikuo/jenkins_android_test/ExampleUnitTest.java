package tw.chikuo.jenkins_android_test;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void unitTest1() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void unitTest2() throws Exception {
        assertEquals(6, 3 + 3);
    }

    @Test
    public void unitTest3() throws Exception {
        assertEquals(8, 4 + 4);
    }
}
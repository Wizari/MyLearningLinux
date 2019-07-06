package Learning;

import myLearningLinux.employeesList.MainOnePack;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class TestEmployees {


    private final MainOnePack mainOnePack = new MainOnePack();

    @Test
    public void test1() {
        int result = mainOnePack.compareStrings("abc", "cba");
        assertTrue(result > 0);
    }

    @Test
    public void test2() {
        int result = mainOnePack.compareStrings("cba", "abc");
        assertTrue(result < 0);
    }

    @Test
    public void test3() {
        int result = mainOnePack.compareStrings("abc", "abc");
        assertTrue(result == 0);
    }


    @Test
    public void test4() {
        int result = mainOnePack.compareStrings("Жо", "Жопенко");
        assertTrue(result > 0);
    }

    @Test
    public void test5() {
        int result = mainOnePack.compareStrings("Жо", "Жопенко");
        assertTrue(result > 0);
    }


}
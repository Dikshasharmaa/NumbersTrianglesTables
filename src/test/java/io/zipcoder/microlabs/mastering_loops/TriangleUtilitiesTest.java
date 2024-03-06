package io.zipcoder.microlabs.mastering_loops;


import org.junit.Assert;
import org.junit.Test;

public class TriangleUtilitiesTest {

    @Test
    public void getRow() {
        String expected = "********************";
        int width = 20;
        String actual = TriangleUtilities.getRow(width);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void getTriangleTest1() {
        String expected =
                        "*\n" +
                        "**\n" +
                        "***\n" +
                        "****\n" +
                        "*****\n" +
                        "******\n" +
                        "*******\n" +
                        "********\n" +
                        "*********\n"+
                        "**********\n"; // Made changes because there were 9 rows and cols instead of 10
        String actual = TriangleUtilities.getTriangle(10);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTriangleTest2() {
        String expected =
                        "*\n" +
                        "**\n" +
                        "***\n" +
                        "****\n"+
                        "*****\n"; //made changes because instead of 5 there were 4 rows and cols.
        String actual = TriangleUtilities.getTriangle(5);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetLargeTriangle() {
        String expected =
                "*\n" +
                "**\n" +
                "***\n" +
                "****\n" +
                "*****\n" +
                "******\n" +
                "*******\n" +
                "********\n" +
                "*********\n"+
                "**********\n";// Made changes because there were 9 rows and col. instead of 10
        String actual = TriangleUtilities.getLargeTriangle();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testGetSmallTriangle() {
        String expected =
                        "*\n" +
                        "**\n" +
                        "***\n" +
                        "****\n";
        String actual = TriangleUtilities.getSmallTriangle();
        Assert.assertEquals(expected, actual);
    }
}

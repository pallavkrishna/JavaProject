package practice.testng.examples.testScripts;

import org.testng.annotations.*;

/*
What is Test NG
TestNG(Test New Generation) is testing f/w designed for development of various Testing Needs

*/
public class TestNGAnnotations {
    /*
    The list of groups that this configuration method will run before.
    This method is guaranteed to run shortly before
    the first test method that belongs to any of these groups is invoked.
    */
    @BeforeGroups
    public void beforeGroups() {

        System.out.print("beforeGroups");
    }

    //the annotated method will be run before all other methods run
    @BeforeSuite
    public void beforeSuite() {

        System.out.print("BeforeSuite");
    }

    /* the annotated method will be run before
    the test belonging to the classes
      inside the <test> tag is run*/
    @BeforeTest
    public void beforeTest() {
        System.out.print("beforeTest");
    }

    /*
    The annotated method will be run before each test method
    */
    @BeforeMethod
    public void beforeMethod() {
        System.out.print("beforeMethod");
    }

    /*The list of groups that this configuration method will run after.
    This method is guaranteed to run shortly after the last test method
    that belongs to any of these groups is invoked.
    */
    @AfterGroups
    public void afterGroups() {
        System.out.print("beforeGroups");
    }

    //the annotated method will be run after all other methods run
    @AfterSuite
    public void aftereSuite() {
        System.out.print("afterSuite");
    }

    /* the annotated method will be run after
   the test belonging to the classes
     inside the <test> tag is run*/
    @AfterTest
    public void afterTest() {
        System.out.print("afterTest");
    }

    //the annotated method will be run after each test method
    @AfterMethod
    public void afterMethod() {
        System.out.print("afterMethod");
    }

    @Test
    public void testMethod() {
        System.out.print("testMethod");
    }

    @Test
    public void testMethod1() {
        System.out.print("testMethod1");
    }

    @Test
    public void testMethod2() {
        System.out.print("testMethod2");
    }
}
